import java.util.concurrent.*;
import javax.swing.*;

/**
 * A class to represent behaviors of.
 * @see         BouncingBallsMediumDriver
 * @author      Steve Wasiswa
 * @version     1.0 October 30,2020
 */
public class BouncingBallsMediumDriver {

    /**
     * The main method instantiates object to run the GUI program.
     * @param   args   a String object
     */
    public static void main(String[] args){

        /**Instance variable to fold JFrame*/
        JFrame frame = new JFrame();
        //Set of the window
        frame.setSize(600,600);
        //Title of he window
        frame.setTitle("Bouncing Balls");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        for (int i=0; i<20;i++){
            // Runnable object
            Ball ball = new Ball();
            frame.add(ball);
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.execute(ball);
            executorService.shutdown();
        }
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */