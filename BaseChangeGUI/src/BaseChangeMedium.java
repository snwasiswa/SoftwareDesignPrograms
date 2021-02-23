import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A class to represent behaviors of.
 * @see         BaseChangeMedium
 * @author      Steve Wasiswa
 * @version     1.0 October 23,2020
 */
public class BaseChangeMedium extends JFrame {

    // Instance variables
    /**Instance variable to get text from the user input*/
    private JTextField textField1;
    /**Instance variable to get text from the user input*/
    private JTextField textField2;
    /**Instance variable to get text from the user input*/
    private JTextField textField3;
    /**Instance variable to display text of the converted number*/
    private JTextField textField4;
    /**Instance variable to help with the label*/
    private Label label1;
    /**Instance variable to help with the label*/
    private Label label2;
    /**Instance variable to display with of the label*/
    private Label label3;
    /**Instance variable to display with of the label*/
    private Label label4;
    /**Instance variable for the button*/
    private JButton button;

    /**
     * Class constructor that initializes all the instances variables and sets behaviors of different components.
     */
    public BaseChangeMedium() {

        //Set layout
        setLayout(new FlowLayout());

        // Set size of the window and title of the game
        setSize(800, 100);
        setTitle("Base Change Conversion ( Base 2, 8 , 10, 16, 32)");

        // Create and add different components to the BaseChangeMedium
        label1 = new Label("Enter a positive number in desired base:");
        add(label1);
        textField1 = new JTextField(8);
        add(textField1);

        label2 = new Label("Enter current base:");
        add(label2);
        textField2 = new JTextField(4);
        add(textField2);

        label3 = new Label("Enter desired base:");
        add(label3);
        textField3 = new JTextField(4);
        add(textField3);

        label4 = new Label("Converted number:");
        add(label4);
        textField4 = new JTextField(8);
        add(textField4);

        button = new JButton("Convert");
        add(button);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // Register events
        TextFieldHandler handler1 = new TextFieldHandler();
        textField1.addActionListener(handler1);
        textField2.addActionListener(handler1);
        textField3.addActionListener(handler1);
        textField4.addActionListener(handler1);
        button.addActionListener(handler1);

    }
    /**
     * A private inner class to represent behaviors of.
     * @see         TextFieldHandler
     * @author      Steve Wasiswa
     */
    private class TextFieldHandler implements ActionListener {
        /**
         * The method processes button events for uploading images.
         * @param      event    Event or action is triggered once the user clicks the Enter key
         */
        @Override
        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == textField1 || event.getSource() == textField2 || event.getSource() == textField3
            || event.getSource() == button) {

                // Declare and assign local variables
                int current_base = Integer.parseInt(textField2.getText());
                int desired_base = Integer.parseInt(textField3.getText());

                // Execute the right operation based on different conditions ( for integers)
                if ((current_base == 10 || current_base == 8) && (desired_base == 10
                        || desired_base == 2 || desired_base == 8 || desired_base == 16 || desired_base == 32)) {
                    // Declare a variable and assign it the user input
                    int number = Integer.parseInt(textField1.getText());

                    if (current_base == 10 && desired_base == 2) {
                        textField4.setText(BaseChange.decimalToAnyBase(number, desired_base));

                    } else if (current_base == 10 && desired_base == 8) {
                        textField4.setText(BaseChange.decimalToAnyBase(number, desired_base));

                    } else if (current_base == 10 && desired_base == 16) {
                        textField4.setText(BaseChange.decimalToAnyBase(number, desired_base));

                    } else if (current_base == 10 && desired_base == 32) {
                        textField4.setText(BaseChange.decimalToAnyBase(number, desired_base));

                    } else if (current_base == 8 && desired_base == 10) {
                        textField4.setText(BaseChange.octalToAnyBase(number, desired_base));

                    } else if (current_base == 8 && desired_base == 2) {
                        textField4.setText(BaseChange.octalToAnyBase(number, desired_base));

                    } else if (current_base == 8 && desired_base == 16) {
                        textField4.setText(BaseChange.octalToAnyBase(number, desired_base));

                    } else if (current_base == 8 && desired_base == 32) {
                        textField4.setText(BaseChange.octalToAnyBase(number, desired_base));
                    }

                    // Execute the right operation based on different conditions ( for strings)
                }else if ((current_base == 2) && (desired_base == 10
                        || desired_base == 2 || desired_base == 8 || desired_base == 16 || desired_base == 32)){
                    // Declare a local variable and assign it the user input
                    long number2 = Long.parseLong(textField1.getText());

                    if (desired_base == 10) {
                        textField4.setText(BaseChange.binaryToAnyBase(number2, desired_base));

                    } else if (desired_base == 8) {
                        textField4.setText(BaseChange.binaryToAnyBase(number2, desired_base));

                    } else if (desired_base == 16) {
                        textField4.setText(BaseChange.binaryToAnyBase(number2, desired_base));

                    } else if (desired_base == 32) {
                        textField4.setText(BaseChange.binaryToAnyBase(number2, desired_base));
                    }
                    // Execute the right operation based on different conditions ( for strings)
                } else if ((current_base == 16 || current_base == 32) && (desired_base == 10 || desired_base == 2
                        || desired_base == 8 || desired_base == 16 || desired_base == 32)) {
                    // Declare a local variable and assign it input from the user
                    String number1 = textField1.getText();

                    if (current_base == 16 && desired_base == 10) {
                        textField4.setText(BaseChange.hexadecimalToAnyBase(number1, desired_base));

                    } else if (current_base == 16 && desired_base == 2) {
                        textField4.setText(BaseChange.hexadecimalToAnyBase(number1, desired_base));

                    } else if (current_base == 16 && desired_base == 8) {
                        textField4.setText(BaseChange.hexadecimalToAnyBase(number1, desired_base));

                    } else if (current_base == 16 && desired_base == 32) {
                        textField4.setText(BaseChange.hexadecimalToAnyBase(number1, desired_base));

                    } else if (current_base == 32 && desired_base == 10) {
                        textField4.setText(BaseChange.baseThirtyTwoToAnyBase(number1, desired_base));

                    } else if (current_base == 32 && desired_base == 2) {
                        textField4.setText(BaseChange.baseThirtyTwoToAnyBase(number1, desired_base));

                    } else if (current_base == 32 && desired_base == 8) {
                        textField4.setText(BaseChange.baseThirtyTwoToAnyBase(number1, desired_base));

                    } else if (current_base == 32 && desired_base == 16) {
                        textField4.setText(BaseChange.baseThirtyTwoToAnyBase(number1, desired_base));
                    }
                }
            }
        }
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */