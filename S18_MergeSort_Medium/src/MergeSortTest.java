import java.util.Arrays;
import java.util.Random;
/**
 * A class to represent behaviors of.
 * @see         MergeSortTest
 * @author      Steve Wasiswa
 * @version     1.0 December 3,2020
 */
public class MergeSortTest
{
   /**
    * The main method tests the MergeSort method on 100 random numbers, and outputs
    * both the original array and the sorted array.
    * @param   args   a String object
    */
   public static void main(String[] args)
   {
      // Create an array of size 100 to hold random numbers
      int[] randonNumbers = new int[100];
      // Create Random object
      Random random = new Random();

      // Generate 100 random numbers from 0 to 1000
      for ( int i = 0; i < 100; i++){
         randonNumbers[i] = random.nextInt(1000);
      }

      // Print the original array
      System.out.println("Original Array: " + Arrays.toString(randonNumbers));

      System.out.println("Sorting the array...");
      // Call the mergeSort method
      MergeSort.mergeSort(randonNumbers);
      // Print the sorted array
      System.out.println("Array after sorting: " + Arrays.toString(randonNumbers));

   } 
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */

