import java.util.Arrays;
/**
 * A class to represent behaviors of.
 * @see         MergeSort
 * @author      Steve Wasiswa
 * @version     1.0 December 3,2020
 */
public class MergeSort{

    /**
     * The method sort an array of integers using recursion
     * @param      data an array to sort that holds integers
     */
    public static void mergeSort(int[] data) {

        if ( data.length > 1){
            // Create two arrays to hold each half of the original array
            int[] firstHalf = new int[data.length / 2];
            int[] secondHalf = new int[data.length / 2];

            // Divide the original array into two halves
            firstHalf = Arrays.copyOfRange(data, 0, data.length / 2);
            secondHalf = Arrays.copyOfRange(data, data.length / 2, data.length);

            // Sort both halves by calling the method mergeSort on each one of them
            mergeSort(firstHalf);
            mergeSort(secondHalf);

            // Merge both sorted arrays by calling the method mergeArrays
            mergeArrays(data, firstHalf, secondHalf);
        }
    }
    /**
     * The method merges two sorted arrays
     * @param      data an array to sort that holds integers
     * @param      firstHalf a sorted array that holds first half of integers
     * @param      secondHalf a sorted array that holds second half of integers
     */
    private static void mergeArrays(int[] data, int[] firstHalf, int[] secondHalf){

        int index1 = 0; // Create and initialize index of data to 0
        int index2 = 0; // Create and initialize index of firstHalf to 0
        int index3 = 0; // Create and initialize index of secondHalf to 0

        // Repeatedly, compare items from firstHalf and secondHalf, and moves the smallest
        // one to data
        while(index2 < firstHalf.length && index3 < secondHalf.length){
            if (firstHalf[index2] < secondHalf[index3]) {
                data[index1] = firstHalf[index2];
                // Increment both indexes
                index1 = index1 + 1;
                index2 = index2 + 1;
            } else {
                data[index1] = secondHalf[index3];
                // Increment both indexes
                index1 = index1 + 1;
                index3 = index3 + 1;
            }
        }
        // Move elements from firstHalf to data, if they are any left.
        while(index2 < firstHalf.length){
            data[index1] = firstHalf[index2];
            // Increment both indexes
            index1 = index1 + 1;
            index2 = index2 + 1;
        }
        // Move elements from secondHalf to data, if they are any left.
        while(index3 < secondHalf.length){
            data[index1] = secondHalf[index3];
            // Increment both indexes
            index1 = index1 + 1;
            index3 = index3 + 1;
        }
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */


