/**
 * The class tests all the different functionality included in ComputusHard.
 * @author     Steve Wasiswa
 * @version    1.0  September 25,2020
 */

// Import the relevant classes

import java.util.Scanner;

public class ComputusHardDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int entered_year = input.nextInt();

        ComputusHard easter = new ComputusHard(entered_year);
        System.out.print("Easter: ");
        System.out.println(easter.algorithmGregorian() + ", " + entered_year +"\n") ;

        // Print number of times easter calendar day occured over an entire cycle
        System.out.println("Number of times Easter occured in each calendar day over an entire cycle:\n");
        easter.printFrequencyOfEasterDay();

    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */
