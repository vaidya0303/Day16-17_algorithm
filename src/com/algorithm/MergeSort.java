package com.algorithm;

/**
 * program to do Merge Sort of list of Strings.
 *
 * a. Logic -> To Merge Sort an array, we divide it into two halves, sort the two halves
 *    independently, and then merge the results to sort the full array. To sort a[lo, hi),
 *
 *   we use the following recursive strategy:
 * b. Base case: If the subarray length is 0 or 1, it is already sorted.
 * c. Reduction step: Otherwise, compute mid = lo + (hi - lo) / 2, recursively sort the
 *    two subarrays a[lo, mid) and a[mid, hi), and merge them to produce a sorted
 *    result.
 *
 */

/**
 * import array class
 */

import java.util.Arrays;

/**
 * create a class name as MergeSort
 */
public class MergeSort {

    /**
     * create a main method.all program execute in main method
     * @param args no arguments
     */
    public static void main(String[] args) {

        /**
         * create a string type array
         */
        String[] array = { "Karnataka", "Hyderabad", "Delhi", "Noida", "Goa", "Kerala" };
        mergeSort(array, 0, array.length - 1);
        System.out.println("Result " + Arrays.toString(array));
    }

    /**
     * creating a method name as mergeSort.
     * this is parameterized method mergeSort to Sort of list of Strings.
     *
     * @param array
     * @param low
     * @param high
     */
    public static void mergeSort(String[] array, int low, int high) {

        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;

        /**
         * sort the first and the second half
         */
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);
    }
    // end mergeSort

    /**
     *  create a method name as merge
     *  this is parameterized method
     * @param array
     * @param low
     * @param mid
     * @param high
     */
    public static void merge(String[] array, int low, int mid, int high) {
        /**
         * size of the range to be merged
         */
        int n = high - low + 1;

        /**
         * merge both halves into a temporary array b
         */
        String[] b = new String[n];
        /**
         * next element to consider in the first range
         */
        int i1 = low;
        /**
         * next element to consider in the second range
         */
        int i2 = mid + 1;
        int j = 0; // next open position in b

        /**
         * here using while loop
         * as long as neither i1 nor i2 past the end, move the smaller into b
         */
        while (i1 <= mid && i2 <= high) {
            if (array[i1].compareTo(array[i2]) < 0) {
                b[j] = array[i1];
                i1++;
            } else {
                b[j] = array[i2];
                i2++;
            }
            j++;
        }

        /**
         * note that only one of the two while loops below is executed copy any
         * remaining entries of the first half
         */
        while (i1 <= mid) {
            b[j] = array[i1];
            i1++;
            j++;
        }

        /**
         * using while loop
         * copy any remaining entries of the second half
         */
        while (i2 <= high) {
            b[j] = array[i2];
            i2++;
            j++;
        }

        /**
         * using for loop
         * copy back from the temporary array
         */
        for (j = 0; j < n; j++) {
            array[low + j] = b[j];
        }
    }

}