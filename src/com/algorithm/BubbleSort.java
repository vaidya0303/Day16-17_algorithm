package com.algorithm;  //package name

/**  problem statement :-
 *
 * a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
 * b. I/P -> read in the list ints
 * c. O/P -> Print the Sorted List
 */

import java.util.Arrays;    //Import Array class

/**  Working  :-
 *
 * [A]. First Iteration (Compare and Swap) :-
 *
 * 1. Starting from the first index, compare the first and the second elements.
 * 2. If the first element is greater than the second element, they are swapped.
 * 3. Now, compare the second and the third elements. Swap them if they are not in order.
 * 4. The above process goes on until the last element.
 *
 * [B]. Remaining Iteration :-
 *
 * 5. The same process goes on for the remaining iterations.
 * 6. After each iteration, the largest element among the unsorted elements is placed at the end.
 * 7. In each iteration, the comparison takes place up to the last unsorted element.
 * 8. The array is sorted when all the unsorted elements are placed at their correct positions.
 */

/**
 * main class name as BubbleSort
 */
class BubbleSort {

    /**
     * create a method name as bubblesort this is parameterized method
     * perform the bubble sort
     * @param array
     */
    static void bubbleSort(int array[]) {
        int size = array.length;

        /**
         * here using for loop
         *  loop to access each array element
         */
        for (int i = 0; i < size - 1; i++)

        /**
         *  loop to compare array elements
         */
            for (int j = 0; j < size - i - 1; j++)

            /**
             *  compare two adjacent elements
             *  change > to < to sort in descending order
             */
                if (array[j] > array[j + 1]) {

                    /**
                     * swapping occurs if elements
                     *  are not in the intended order
                     */
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    /**
     * Here create a main method
     * all program execute in main method
     * @param args the array whose string representation to return
     */
    public static void main(String args[]) {

        int[] data = { -2, 45, 0, 11, -9 };

        /**
         * the array whose string representation to return
         * Class name :-BubbleSort
         * Method Name :-bubbleSort
         * calling directly coz main both method are static.
         */
        BubbleSort.bubbleSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}