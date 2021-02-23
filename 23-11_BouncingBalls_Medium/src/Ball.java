import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * A class to represent behaviors of.
 * @see         Ball
 * @author      Steve Wasiswa
 * @version     1.0 October 30,2020
 */
public class Ball extends JPanel implements Runnable{

    /**Instance variable to hold color*/
    private Color color;
    /**Instance variable to hold random number*/
    Random number;
    /**Instance variable to hold diameter of the ball*/
    private int diameter;
    /**Instance variable to hold x-coordinate of the ball*/
    private int horizontalPosition;
    /**Instance variable to hold y-coordinate of the ball*/
    private int verticalPosition;
    /**Instance variable to hold y-step of the ball*/
    private int verticalStep;
    /**Instance variable to hold x-step of the ball*/
    private int horizontalStep;

    /**
     * Class constructor that initializes all the instances variables and sets behaviors of different components.
     */
    public Ball() {
        number = new Random();
        diameter = 50;
        horizontalPosition = number.nextInt(200);
        verticalPosition = number.nextInt(200);
        verticalStep = number.nextInt(20);
        horizontalStep = number.nextInt(20);
        color = new Color(30, number.nextInt(200), number.nextInt(200));;

    }

    /**
     * The method draws a ball using coordinates
     * @param      g   object of type Graphics, which comes from the Graphics package
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Set color
        g.setColor(color);
        // Draw the ball
        g.fillOval(horizontalPosition, verticalPosition, diameter, diameter);
    }

    /**
     * The method adjusts the ball according to coordinates
     */
    public void movingBall() {

        // If the ball goes over the edge, update its horizontal coordinates
        if (diameter + horizontalPosition + horizontalStep > getWidth() || horizontalPosition + horizontalStep < 0) {
            horizontalStep = horizontalStep * (-1);
        }
        // If the ball goes over the edge, update its vertical coordinates
        if (diameter + verticalPosition + verticalStep > getHeight() || verticalPosition + verticalStep < 0) {
            verticalStep = verticalStep * (-1);
        }
        // Update coordinates
        verticalPosition = verticalPosition + verticalStep;
        horizontalPosition = horizontalPosition + verticalStep;
    }

    /**
     * The method allows the ball to be run as a thread
     */
    @Override
    public void run() {

        while (isVisible()) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            //Update
            movingBall();
            //Refresh
            repaint();
        }
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */