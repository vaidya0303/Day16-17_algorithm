package com.algorithm;  //package name
/**
 * Binary Search the Word from Word List
 * a. Desc -> Read in a list of words from File. Then prompt the user to enter a word to
 *    search the list. The program reports if the search word is found in the list.
 * b. I/P -> read in the list words comma separated from a File and then enter the word
 *    to be searched
 * c. Logic -> Use Arrays to sort the word list and then do the binary search
 * d. O/P -> Print the result if the word is found or not
 *
 */

/**
 * import array class
 * import scanner class
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * main class name as BinarySearch
 */
public class BinarySearch {
    /**
     * create a main method.all program execute in main method
     * @param args no arguments
     */
    public static void main(String[] args) {
        /**
         * create object for BinarySearch class
         * object name is binaryObj
         */
        BinarySearch binaryObj = new BinarySearch();
        /**
         * create scanner class and object
         */
        Scanner scanner = new Scanner(System.in);
        /**
         * create array list
         */
        String[] wordList = {"trimph", "bmw", "ducati", "benelli", "yamaha","ktm"};
        /**
         * array list is ascending order
         */
        Arrays.sort(wordList);
        System.out.println("List of Words :");
        System.out.println(Arrays.toString(wordList));
        System.out.println("Enter the word you want to search");
        String searchName = scanner.nextLine();
        scanner.close();

        /**
         *
         * method calling
         * result is objectname.method name
         */

        int result = binaryObj.binarySearch(wordList, searchName);
/**
 * if result is -1 then print word is not present in the list
 *
 */
        if (result == -1)
            System.out.println("word is found at "
                    + "index " + result);
        else
            System.out.println("word is not present in the list");

    }

    /**
     * create a method name as binarySearch
     * this is parameterized method
     * @param wordList
     * @param searchName
     * @return wordlist searchName
     */
    public int binarySearch(String[] wordList, String searchName) {

        int start = 0, length = wordList.length - 1;
        /**
         * using while loop
         */
        while (start <= length) {
            int middle = start + (length - start) / 2;
            int result = searchName.compareTo(wordList[middle]);
            /**
             * if condition is true then return middle
             */
            if (result == 0)
                return middle;
            /**
             * if condition checked
             * if result is greater than 0 then start is middle +1
             * if false then length =middle -1
             */
            if (result > 0)
                start = middle + 1;
            else
                length = middle - 1;
        }
        return -1;
    }
}