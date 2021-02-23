import javax.swing.JFrame;
/**
 * A class to represent behaviors of.
 * @see         ServerTest
 * @author      Steve Wasiswa
 * @version     1.0 December 3,2020
 */
public class ServerTest
{
   /**
    * The main method tests the server-side application
    * @param args array of string
    */
   public static void main(String[] args)
   {
      Server application = new Server(); // create server
      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.runServer(); // run server application

   } 
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */