/**
 * The class represents the behavior of.
 * @see        PerfectNumbersEasyDriver
 * @author     Steve Wasiswa
 * @version    1.0  September 11,2020
 */
public class PerfectNumbersEasyDriver { // Beginning class PerfectNumbersEasyDriver
    /**
     * The main method prints out all the perfect numbers from 1 to 1000 along with their factors,
     * the number itself is excluded.
     * @param  args     array of strings
     */
    public static void main(String[] args) { // main method begins execution of Java application

        System.out.println("Here are all the perfect numbers with their factors from 1 to 1000\n");
        System.out.println("Perfect numbers\t\t\t\tFactors");
        System.out.println("---------------\t\t\t\t--------");

        for ( int number = 1; number <= 1000; number++){ // Going through all the numbers from 1 to 1000 for a test
            // Check explicitly if the condition holds true and print out the perfect number
            if (PerfectNumbersEasy.isPerfect(number) == true) {
                System.out.print(number + "\t\t\t\t\t\t\t");
                // Going through all the numbers from 1 to the perfect number - 1 ( perfect number excluded)
                for ( int factor = 1; factor < number; factor++){
                    if (number % factor== 0) { // Checks if the factor is a divisor of the number
                        System.out.print(factor + "\t" ); // Print out the perfect number's factors
                    }
                }
                System.out.println("");
            }
        }
    } // end method main
} // end class PerfectNumbersEasyDriver

/**
 * (C) Copyright 2020 by Steve Wasiswa. All Rights Reserved.
 *
 */