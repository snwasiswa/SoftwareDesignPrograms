/**
 * The class represents the behavior of.
 * @see         PerfectNumbersEasy
 * @author      Steve Wasiswa
 * @version     1.0 September 11,2020
 */
public class PerfectNumbersEasy { // Beginning class PerfectNumbersEasy
    /**
     * The method determines whether the parameter number is a perfect number or not.
     * Takes an integer number and returns a boolean true or false.
     * @param    number      the number to determine whether it is perfect or not.
     * @return   boolean     true if number is perfect; false otherwise.
     */
    public static boolean isPerfect( int number){
        // Declare and initialize local variables sum and divisor
        int sum = 0;
        int divisor = 1;
        // Going from 1 to all the divisors less than the number itself and sum them all
        while( number != 1 && divisor < number){
            if (number % divisor == 0){ // Checks if the number chosen is a divisor of the parameter(number)
                sum += divisor; // compute the sum
            }
            divisor++; // Increment the divisor
        }

        if (sum == number) { // Check if the sum is equals the number and returns true

            return true;
        }
        return false;
    }
} // end class PerfectNumbersEasy

/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */