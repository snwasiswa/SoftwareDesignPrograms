import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * A class to represent behaviors of.
 * @see         Server
 * @author      Steve Wasiswa
 * @version     1.0 December 3,2020
 */
public class Server extends JFrame {
    /**Instance variable to hold input message from user*/
    private JTextField enterField; // inputs message from user
    /**Instance variable to display information  to user*/
    private JTextArea displayArea; // display information to user
    /**Instance variable to hold ServerSocket object*/
    private ServerSocket server;
    /**Instance variable to hold socket*/
    private Socket connection;
    /**Instance variable to hold number of connections*/
    private int counter = 1;
    /** Instance variable to hold runnable objects*/
    private ArrayList<ClientHandler> clientThreads = new ArrayList<ClientHandler>();

    /**
     * Class constructor that initializes some instance variables and sets behaviors of different components.
     */
    public Server() {
        super("Server");

        enterField = new JTextField(); // create enterField
        enterField.addActionListener(
                new ActionListener() {
                    /**
                     * The method sends message to clients
                     * @param       event   Event or action is triggered once the user enters a message to send
                     */
                    public void actionPerformed(ActionEvent event) {
                        int i = 0;
                        do{
                            (clientThreads.get(i)).sendData(event.getActionCommand());
                            enterField.setText("");
                            i++;
                        }while(i < clientThreads.size());
                    }
                }
        );

        add(enterField, BorderLayout.NORTH);
        displayArea = new JTextArea(); // create displayArea
        add(new JScrollPane(displayArea), BorderLayout.CENTER);
        setSize(400, 200); // set size of window
        setVisible(true); // show window
    }

    /**
     * The method sets up and run server, and accepts connection of every client as a thread
     */
    public void runServer() {
        // create ExecutorService with a thread
        ExecutorService task = Executors.newFixedThreadPool(100);

        try // set up server to receive connections; process connections
        {
            server = new ServerSocket(23525, 100); // create ServerSocket

            while (true) {
                waitForConnection();
                connection = server.accept();
                clientThreads.add(new ClientHandler(connection,counter));
                // Execute runnable client
                task.execute(clientThreads.get(clientThreads.size()-1));
                // Increment the number of connections
                counter++;
                // Set thee enterField to editable mode, so the server enter something
                enterField.setEditable(true);
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    /**
     * The method manipulates displayArea in the event-dispatch thread
     * @param      messageToDisplay   A String object, message to display
     */
    private void displayMessage(final String messageToDisplay)
    {
        SwingUtilities.invokeLater(
                new Runnable()
                {
                    public void run() // updates displayArea
                    {
                        displayArea.append(messageToDisplay); // append message
                    }
                }
        );
    }

    /**
     * The method displays connection info
     */
    private void waitForConnection()
    {
        displayMessage("Waiting for connection\n");

    }

    /**
     * A class to represent behaviors of.
     * @see         ClientHandler
     * @author      Steve Wasiswa
     * @version     1.0 December 3,2020
     */
    private class ClientHandler implements Runnable {

        /**Instance variable to hold Socket*/
        private Socket connection;
        /**Instance variable to hold a client number */
        private int clientNumber;
        /**Instance variable to hold output message from user*/
        private ObjectOutputStream output;
        /**Instance variable to hold input message from user*/
        private ObjectInputStream input;

        /**
         * Class constructor that initializes some instance variables and sets behaviors of the ClientHandler class.
         * @param                socket      socket object to get connection
         * @param                clientNumber    number to get client number for every client that connects
         */
        private ClientHandler(Socket socket, int clientNumber) {
            // Initialize instance variable
            this.connection = socket;
            this.clientNumber = clientNumber;

            // get streams to send and receive data
            try {
                input = new ObjectInputStream(connection.getInputStream());
                output = new ObjectOutputStream(connection.getOutputStream());
                output.flush();

                displayMessage("\nGot I/O streams\n");

                String message = "Connection successful";
                sendData(message);

                displayMessage("\nConnection " + clientNumber + " received from: " +
                        connection.getInetAddress().getHostName() + "\n\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /**
         * The method send messages to clients
         * @param      message   Message to send
         */
        private void sendData(String message) {
            //send message to client
            try {
                output.writeObject("SERVER>>> " + message);
                output.flush();
                displayMessage("\nSERVER>>> " + message);
            }catch (IOException ioException) {
                displayMessage("\nError writing object");
            }
        }

        /**
         * The method closes or terminates connections
         */
        private void closeConnection(){
            displayMessage("\nClosing connection\n");
            try {
                output.close(); // close output stream
                input.close(); // close input stream
                connection.close(); // close socket
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

        /**
         * The method allows the ClientHandler to be run as a Runnable object
         */
        @Override
        public void run() {
            String message = null; // Set the message to null

            try {
                do // process messages sent from client
                {
                    try // read message and display it
                    {
                        message = (String) input.readObject(); // read new message
                        displayMessage("\n" + message); // display message
                    } catch (ClassNotFoundException classNotFoundException) {
                        displayMessage("\nUnknown object type received");
                    }

                } while (!message.equals("CLIENT>>> TERMINATE"));

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // Close connection
                closeConnection();
                clientThreads.remove(this); // remove the runnable object
            }
        }
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */


