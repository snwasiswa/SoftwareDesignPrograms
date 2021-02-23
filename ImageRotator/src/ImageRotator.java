import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

/**
 * A class to represent behaviors of.
 * @see        ImageRotator
 * @author      Steve Wasiswa
 * @version     1.0 October 09,2020
 */
public class ImageRotator extends JFrame {
    // Declare instances variables
    private JButton rotate, uploadFile;
    private JTextField textField1;
    private DrawImage drawImage;
    private JFileChooser fileChooser;
    private String file;
    private JPanel panel,menuPanel, displayPanel;
    private Label label1;

    /**
     * Class constructor that initializes all the instances variables and sets behaviors of different components.
     */
    public ImageRotator() {

        // Set size of the window and title of the game
        setSize(1000, 800);
        setTitle("Image Rotator");

        // Set layout for panel
        panel = new JPanel(new BorderLayout());
        // Set layout for menuPanel
        menuPanel= new JPanel(new FlowLayout());
        // Set layout for displayPanel
        displayPanel= new JPanel(new BorderLayout());
        // Create and add different components to the ImageRotator
        uploadFile = new JButton("Upload Image");
        menuPanel.add(uploadFile);
        label1 = new Label("Enter rotation angle between 0 - 360 degrees");
        menuPanel.add(label1);
        textField1 = new JTextField(10);
        menuPanel.add(textField1);

        rotate= new JButton("Rotate");
        menuPanel.add(rotate);

        // Create DrawImage object
        drawImage = new DrawImage();
        drawImage.setVisible(true);
        drawImage.setSize(600,600);
        displayPanel.add(drawImage);

        // Add menuPanel and displayPanel to the panel
        panel.add(menuPanel, BorderLayout.NORTH);
        panel.add(displayPanel, BorderLayout.CENTER);

        add(panel);

        // Register events
        JButtonHandler1 buttonHandler1 = new JButtonHandler1();
        changeState buttonHandler2 = new changeState();
        uploadFile.addActionListener(buttonHandler1);
        rotate.addActionListener(buttonHandler2);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * A private inner class to represent behaviors of.
     * @see         JButtonHandler1
     * @author      Steve Wasiswa
     */
    private class JButtonHandler1 implements ActionListener {
        /**
         * The method processes button events for uploading images.
         * @param      event    Event or action is triggered once the user clicks the button
         */

        @Override
        public void actionPerformed(ActionEvent event) {
            // Choose a file once the event is triggered
            if (event.getSource() == uploadFile) {
                fileChooser = new JFileChooser();

                // Get the full path of the file
                if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
                    file = fileChooser.getSelectedFile().getAbsolutePath();

                }
                // Load the file the frame
                drawImage.loadImage(file);

            }
        }
    }

    /**
     * A private inner class to represent behaviors of.
     * @see         changeState
     * @author      Steve Wasiswa
     */
    private class changeState implements ActionListener{
        /**
         * The method processes button events when degree the user changes angle of rotation.
         * @param      event    Event or action is triggered once the user clicks the button
         */

        @Override
        public void actionPerformed(ActionEvent event) {

            if ( event.getSource() == rotate){

                Double angle = Double.parseDouble(textField1.getText());
                drawImage.setRotationAngle(angle);
                repaint();
            }
        }
    }
}

/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */

