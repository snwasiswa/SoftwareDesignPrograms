/**
 * A class to represent behaviors of.
 * @see         ArabicToRomanGUIEasy
 * @author      Steve Wasiswa
 * @version     1.0 October 2,2020
 */

// Import necessary libraries
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ArabicToRomanGUIEasy  extends JFrame {

    // Declare instance variables
    private JTextField textField1, textField2;
    private Label label1, label2;
    private JButton button;

    /**
     * Class constructor that initializes all the instances variables and sets other behaviors.
     */
    public ArabicToRomanGUIEasy() {

        setLayout(new FlowLayout());

        // Set size of the window and title of the game
        setSize(700, 100);
        setTitle("Conversion");

        label1 = new Label("Enter an arabic number");
        add(label1);
        textField1 = new JTextField(10);
        add(textField1);

        label2 = new Label("Roman Number");
        add(label2);
        textField2 = new JTextField(10);
        add(textField2);

        button = new JButton("Convert");
        add(button);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        // Register events
        TextFieldHandler handler1 = new TextFieldHandler();
        JButtonHandler handler2 = new JButtonHandler();
        textField1.addActionListener(handler1);
        textField2.addActionListener(handler1);
        button.addActionListener(handler2);

    }
    /**
     * A private inner class to represent behaviors of.
     * @see         TextFieldHandler
     * @author      Steve Wasiswa
     */
    private class TextFieldHandler implements ActionListener {

        /**
         * The method processes text field events.
         * @param      event    Event is triggered once the user enters the Enter key
         */
        @Override
        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == textField1){
                // Get text from textField1 to display its conversion to textField2
                textField2.setText(arabicToRoman(Integer.parseInt(textField1.getText())));
            }
        }
    }

    /**
     * A private inner class to represent behaviors of.
     * @see         JButtonHandler
     * @author      Steve Wasiswa
     */
    private class JButtonHandler implements ActionListener {

        /**
         * The method processes button events.
         * @param      event    Event is triggered once the user clicks the button
         */
        @Override
        public void actionPerformed(ActionEvent event) {

            if (event.getSource() == button) {
                // Get text from textField1 to display its conversion to textField2
                textField2.setText(arabicToRoman(Integer.parseInt(textField1.getText())));
            }
        }
    }

    /**
     * The method that converts the arabic number to roman number
     * Returns a combination of string literals
     * @param      number_to_convert   integer to convert into roman number
     * @return     String   a combination of string literals
     */
    public String arabicToRoman(int number_to_convert) {

        // Declaring and assigning necessary variables
        int[] arabic;
        arabic = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String roman;
        roman = "";
        int index;

        // Only considering numbers from 1 to 3999 included
        if ( number_to_convert >=1 && number_to_convert <= 3999) {

            index = 0;
            do {
                if (number_to_convert >= arabic[index]) {
                    // Assign roman numbers according to different possible outcomes
                    if (arabic[index] == 1000)
                        roman += "M";
                    if (arabic[index] == 900)
                        roman += "C" + "M";
                    if (arabic[index] == 500)
                        roman += "D";
                    if (arabic[index] == 400)
                        roman += "C" + "D";
                    if (arabic[index] == 100)
                        roman += "C";
                    if (arabic[index] == 90)
                        roman += "X" + "C";
                    if (arabic[index] == 50)
                        roman += "L";
                    if (arabic[index] == 40)
                        roman += "X" + "L";
                    if (arabic[index] == 10)
                        roman += "X";
                    if (arabic[index] == 9)
                        roman += "I" + "X";
                    if (arabic[index] == 5)
                        roman += "V";
                    if (arabic[index] == 4)
                        roman += "I" + "V";
                    if (arabic[index] == 1)
                        roman += "I";
                    // Update number to convert as long as it satisfies the condition( being in the range)
                    number_to_convert -= arabic[index];
                } else {
                    index++;
                }
            } while (number_to_convert > 0); // Number to convert has to be greater than 0
        }
        return roman;
    }
}

/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */