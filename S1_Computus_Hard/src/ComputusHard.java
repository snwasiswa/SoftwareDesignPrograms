/**
 * A class to represent behaviors of.
 * @see         ComputusHard
 * @author      Steve Wasiswa
 * @version     1.0 September 25,2020
 */

public class ComputusHard {

    // Declare instance variable
    private int year;

    /**
     * Class constructor that takes in one parameter and initializes it.
     * @param    year    year to use for determining Easter day
     */
    public ComputusHard(int year){

        this.year = year;
    }

    /**
     * The method computes the Easter day based on gregorian algorithm and combines month and day for a formatted output.
     *  Returns a string literal.
     * @return   String     combination of month and day.
     */
    public String algorithmGregorian() {

        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (2 * e + 2 * i - h - k + 32) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int month = (h + l - 7 * m + 114) / 31;
        int day = ((h + l - 7 * m + 114) % 31) + 1;

        // Returns either March or April along with a day
        if (month == 3) {
            return "March" + " " + day;
        } else {
            return "April" + " " + day;
        }
    }

    /**
     * The method computes the frequency of each Easter day over an entire cycle and print them out.
     */
    public void printFrequencyOfEasterDay() {

        // In March, Easter days go only from 22nd day to the 31st day
        for ( int march_day = 22; march_day<= 31; march_day++) {
            int count = 0;

            // Declare and initialize the calendar day ( Month/day)
            String calendar_day = "March" + " " + march_day;
            // Loop over an entire cycle
            for  (int year = 0; year <= 5700000; year++) {
                ComputusHard easter_year = new ComputusHard(year);
                // Check if the calendar day corresponds to one from the algorithm
                if (calendar_day.equalsIgnoreCase(easter_year.algorithmGregorian())) {
                    count++;
                }
            }

            // Print the frequency of each calendar day for April
            System.out.println(calendar_day + " - " + count);

        }

        // In April, Easter days go only from 1st day to the 25th day
        for ( int april_day = 1; april_day<= 25; april_day++) {

            int count = 0;
            // Declare and initialize the calendar day ( Month/day)
            String calendar_day = "April" + " " + april_day;
            // Loop over an entire cycle
            for  (int year = 0; year <= 5700000; year++) {
                ComputusHard easter_year = new ComputusHard(year);
                // Check if the calendar day corresponds to one from the algorithm
                if (calendar_day.equalsIgnoreCase(easter_year.algorithmGregorian())) {
                    count++;
                }
            }

            // Print the frequency of each calendar day for April
            System.out.println(calendar_day + " - " + count);
        }
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */