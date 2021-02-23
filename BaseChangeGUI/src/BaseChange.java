/**
 * A class to represent behaviors of.
 * @see         BaseChange
 * @author      Steve Wasiswa
 * @version     1.0 October 23,2020
 */
public class BaseChange {
    /**
     * The method converts a decimal to any base
     * Returns a string literal
     * @param      number    An integer number to convert
     * @param      base      base to convert to
     * @return     String    A string literal of the converted number
     */
    public static String decimalToAnyBase( int number, int base){

        // Declare and initialize local variables
        String conversion = "";
        String reverse_conversion = "";
        char characters[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L',
                'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        if ( number == 0){
            return "0";
        }

        // As long as number is greater than 0, computes its conversion
        while (number > 0) {
            if (base == 2) {
                // Computes remainder and concatenate it with a string
                conversion += number % base;
                number /= base;
            }

            if (base == 8) {
                // Computes remainder and concatenate it with a string
                conversion += number % 8;
                number /= 8;
            }

            if (base == 16) {
                // Concatenate a character with a string based on the remainder
                conversion += characters[number % 16];
                number /= 16;
            }

            if (base == 32) {
                // Concatenate a character with a string based on the remainder
                conversion += characters[number % 32];
                number /= 32;
            }
        }

        char[] character = conversion.toCharArray(); // Convert into characters
        // Reverse the string
        for (int i = character.length - 1; i >= 0; i--) {
            reverse_conversion += character[i];
        }
        return reverse_conversion;
    }
    /**
     * The method converts a binary number to any base
     * Returns a string literal
     * @param      number    A long number to convert
     * @param      base      base to convert to
     * @return     String    A string literal of the converted number
     */
    public static String binaryToAnyBase(long number, int base){

        // Declare and initialize local variables
        String conversion = "";
        int decimal = 0;
        int power = 0;

        if ( number == 0){
            return "0";
        }

        // As long as number is greater than 0, computes its conversion
        while (number > 0) {
            //Computes conversion when the base is 10
            if (base == 10) {
                decimal += (number % 10) * Math.pow(2,power);
                number /= 10;
                power++;
            }
            //Computes conversion when the base is 8, by finding its decimal and then convert it to base 8
            if (base == 8){
                while (number > 0) {
                    decimal += (number % 10) * Math.pow(2, power);
                    number /= 10;
                    power++;
                }
                return decimalToAnyBase(decimal,base);
            }
            //Computes conversion when the base is 16, by finding its decimal and then convert it to base 16
            if (base == 16){

                while (number > 0) {
                    decimal += (number % 10) * Math.pow(2, power);
                    number /= 10;
                    power++;
                }
                return decimalToAnyBase(decimal, base);
            }
            //Computes conversion when the base is 32, by finding its decimal and then convert it to base 32
            if (base == 32){
                while (number > 0) {
                    decimal += (number % 10) * Math.pow(2, power);
                    number /= 10;
                    power++;
                }
                return decimalToAnyBase(decimal,base);
            }
        }
        return conversion + decimal;
    }
    /**
     * The method converts a number from base 8 to any base
     * Returns a string literal
     * @param      number    An integer number to convert
     * @param      base      base to convert to
     * @return     String    A string literal of the converted number
     */
    public static String octalToAnyBase( int number, int base){

        // Declare and initialize local variables
        String conversion = "";
        int decimal = 0;
        int power = 0;

        if ( number == 0){
            return "0";
        }

        // As long as number is greater than 0, computes its decimal
        while (number > 0) {
            if (base == 10) {
                decimal += (number % 10) * Math.pow(8,power);
                number /= 10;
                power++;
            }
            //Computes conversion when the base is 2, by finding its decimal and then convert it to base 2
            if (base == 2){
                while (number > 0) {
                    decimal += (number % 10) * Math.pow(8, power);
                    number /= 10;
                    power++;
                }
                return decimalToAnyBase(decimal,base);
            }
            //Computes conversion when the base is 16, by finding its decimal and then convert it to base 16
            if (base == 16){
                while (number > 0) {
                    decimal += (number % 10) * Math.pow(8, power);
                    number /= 10;
                    power++;
                }
                return decimalToAnyBase(decimal, base);
            }
            //Computes conversion when the base is 32, by finding its decimal and then convert it to base 32
            if (base == 32){
                while (number > 0) {
                    decimal += (number % 10) * Math.pow(8, power);
                    number /= 10;
                    power++;
                }
                return decimalToAnyBase(decimal,base);
            }
        }
        return conversion + decimal;
    }
    /**
     * The method converts hexadecimal to any base
     * Returns a string literal
     * @param      hex_number    A string to use for conversion
     * @param      base      base to convert to
     * @return     String    A string literal of the converted number
     */
    public static String hexadecimalToAnyBase( String hex_number, int base){

        // Declare and initialize local variables
        String conversion = "";
        int decimal = 0;
        String alpha_numeric = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int counter = 0;

        if (hex_number.equalsIgnoreCase("0")){
            return "0";
        }

        // As long as number is greater than 0, computes its decimal
        if (base == 10) {
            while ( counter < hex_number.length()) {
                decimal = decimal * 16 + alpha_numeric.indexOf(hex_number.toUpperCase().charAt(counter));
                counter++;
            }
        }

        //Computes conversion when the base is 2, by finding its decimal and then convert it to base 2
        if (base == 2){
            while (counter < hex_number.length()) {
                decimal = decimal * 16 + alpha_numeric.indexOf(hex_number.toUpperCase().charAt(counter));
                counter++;
            }
            return decimalToAnyBase(decimal,base);
        }
        //Computes conversion when the base is 8, by finding its decimal and then convert it to base 8
        if (base == 8){
            while (counter < hex_number.length()) {
                decimal = decimal * 16 + alpha_numeric.indexOf(hex_number.toUpperCase().charAt(counter));
                counter++;
            }
            return decimalToAnyBase(decimal, base);
        }
        //Computes conversion when the base is 32, by finding its decimal and then convert it to base 32
        if (base == 32){
            while (counter < hex_number.length()) {
                decimal = decimal * 16 + alpha_numeric.indexOf(hex_number.toUpperCase().charAt(counter));
                counter++;
            }
            return decimalToAnyBase(decimal,base);
        }

        return conversion + decimal;

    }
    /**
     * The method converts a number from base 32 to any base
     * Returns a string literal
     * @param      number    A string to use for conversion
     * @param      base      base to convert to
     * @return     String    A string literal of the converted number
     */
    public static String baseThirtyTwoToAnyBase( String number, int base){

        // Declare and initialize local variables
        String conversion = "";
        int decimal = 0;
        String alpha_numeric = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int counter = 0;

        if (number.equalsIgnoreCase("0")){
            return "0";
        }
        //Computes its decimal
        if (base == 10) {
            while ( counter < number.length()) {
                decimal = decimal * 32 + alpha_numeric.indexOf(number.toUpperCase().charAt(counter));
                counter++;
            }
        }
        //Computes conversion when the base is 2, by finding its decimal and then convert it to base 2
        if (base == 2){
            while (counter < number.length()) {
                decimal = decimal * 32 + alpha_numeric.indexOf(number.toUpperCase().charAt(counter));
                counter++;
            }
            return decimalToAnyBase(decimal,base);
        }
        //Computes conversion when the base is 8, by finding its decimal and then convert it to base 8
        if (base == 8){
            while (counter < number.length()) {
                decimal = decimal * 32 + alpha_numeric.indexOf(number.toUpperCase().charAt(counter));
                counter++;
            }
            return decimalToAnyBase(decimal, base);
        }
        //Computes conversion when the base is 16, by finding its decimal and then convert it to base 16
        if (base == 16){
            while (counter < number.length()) {
                decimal = decimal * 32 + alpha_numeric.indexOf(number.toUpperCase().charAt(counter));
                counter++;
            }
            return decimalToAnyBase(decimal,base);
        }
        return conversion + decimal;
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */