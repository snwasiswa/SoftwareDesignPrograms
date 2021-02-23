import javax.swing.JFrame;
/**
 * A class to represent behaviors of.
 * @see         ClientTest
 * @author      Steve Wasiswa
 * @version     1.0 December 3,2020
 */
public class ClientTest
{
   /**
    * The main method tests the client-side application
    * @param args array of string
    */
   public static void main(String[] args)
   {
      Client application; // declare client application

      // if no command line args
      if (args.length == 0)
         application = new Client("128.255.17.149"); // connect to localhost
         //application = new Client("127.0.0.1"); // connect to localhost

      else
         application = new Client(args[0]); // use args to connect

      application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      application.runClient(); // run client application
   } 
}

/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */
