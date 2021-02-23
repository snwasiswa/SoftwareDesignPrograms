// Fig. 28.5: Client.java
// Client portion of a stream-socket connection between client and server.
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
/**
 * A class to represent behaviors of.
 * @see         Client
 * @author      Steve Wasiswa
 * @version     1.0 December 3,2020
 */
public class Client extends JFrame
{
   /**Instance variable to enter information from user*/
   private JTextField enterField;
   /**Instance variable to display information from user*/
   private JTextArea displayArea;
   /**Instance variable to hold output stream to server*/
   private ObjectOutputStream output;
   /**Instance variable to hold input stream from server*/
   private ObjectInputStream input;
   /**Instance variable to hold message from server*/
   private String message = "";
   /**Instance variable to hold server for the application*/
   private String chatServer;
   /**Instance variable to hold socket to communicate with server*/
   private Socket client;


   /**
    * Class constructor that initializes some instance variables and sets behaviors of different components.
    * @param      host   A String object, host to which the client connects
    */
   public Client(String host)
   {
      super("Client");

      chatServer = host; // set server to which this client connects

      enterField = new JTextField(); // create enterField
      enterField.setEditable(false);
      enterField.addActionListener(
         new ActionListener() 
         {
            // send message to server
            /**
             * The method sends message to server
             * @param       event   Event or action is triggered once the user enters a message to send
             */
            public void actionPerformed(ActionEvent event)
            {
               sendData(event.getActionCommand());
               enterField.setText("");
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
    * The method connects to server and process messages from server
    */
   public void runClient() 
   {
      try // connect to server, get streams, process connection
      {
         connectToServer(); // create a Socket to make connection
         getStreams(); // get the input and output streams
         processConnection(); // process connection
      } 
      catch (EOFException eofException) 
      {
         displayMessage("\nClient terminated connection");
      } 
      catch (IOException ioException) 
      {
         ioException.printStackTrace();
      } 
      finally 
      {
         closeConnection(); // close connection
      }
   }


   /**
    * The method connects to server
    * @throws   IOException if can't connect to server
    */
   private void connectToServer() throws IOException
   {      
      displayMessage("Attempting connection\n");

      // create Socket to make connection to server
      client = new Socket(InetAddress.getByName(chatServer), 23525);

      // display connection information
      displayMessage("Connected to: " + 
         client.getInetAddress().getHostName());
   }

   /**
    * The method gets streams to send and receive data
    * @throws   IOException if can't get streams to send or receive data
    */
   private void getStreams() throws IOException
   {
      // set up output stream for objects
      output = new ObjectOutputStream(client.getOutputStream());      
      output.flush(); // flush output buffer to send header information

      // set up input stream for objects
      input = new ObjectInputStream(client.getInputStream());

      displayMessage("\nGot I/O streams\n");
   }

   /**
    * The method processes connection with server
    * @throws   IOException if can't process connection with server
    */
   private void processConnection() throws IOException
   {
      // enable enterField so client user can send messages
      setTextFieldEditable(true);

      do // process messages sent from server
      { 
         try // read message and display it
         {
            message = (String) input.readObject(); // read new message
            displayMessage("\n" + message); // display message
         } 
         catch (ClassNotFoundException classNotFoundException) 
         {
            displayMessage("\nUnknown object type received");
         } 

      } while (!message.equals("SERVER>>> TERMINATE"));
   }

   /**
    * The method closes streams and socket
    */
   private void closeConnection() 
   {
      displayMessage("\nClosing connection");
      setTextFieldEditable(false); // disable enterField

      try 
      {
         output.close(); // close output stream
         input.close(); // close input stream
         client.close(); // close socket
      } 
      catch (IOException ioException) 
      {
         ioException.printStackTrace();
      } 
   }

   // send message to server
   /**
    * The method sends message to server
    * @param    message  A String object, message to send
    */
   public void sendData(String message)
   {
      try // send object to server
      {
         output.writeObject("CLIENT>>> " + message);
         output.flush(); // flush data to output
         displayMessage("\nCLIENT>>> " + message);
      } 
      catch (IOException ioException)
      {
         displayArea.append("\nError writing object");
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
               displayArea.append(messageToDisplay);
            }
         }  
      ); 
   } 

   /**
    * The method manipulates enterField in the event-dispatch thread
    * @param      editable   A boolean type, it is true or false depending on the need
    */
   private void setTextFieldEditable(final boolean editable)
   {
      SwingUtilities.invokeLater(
         new Runnable() 
         {
            public void run() // sets enterField's editability
            {
               enterField.setEditable(editable);
            }
         } 
      ); 
   } 
}

/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */
