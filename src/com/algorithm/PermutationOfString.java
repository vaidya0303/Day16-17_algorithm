package com.algorithm;

/**
 *  Permutation of the string means all the possible new strings that can be formed by
 *  interchanging the position of the characters of the string.
 *
 *  For example :-
 *     string ABC has permutations [ABC, ACB, BAC, BCA, CAB, CBA].
 */

/**
 * import Hashset class
 * import set class
 * import scanner class
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * creating a class name as PermutationOfString
 */
class PermutationOfString {
    public static Set<String> getPermutation(String str) {

        /**
         *  create a set to avoid duplicate permutation
         */
        Set<String> permutations = new HashSet<String>();

        /**
         * here we using conditional statement
         * check if string is null
         */
        if (str == null) {
            return null;

        } else if (str.length() == 0) {

            /**
             * terminating condition for recursion
             */
            permutations.add("");

            return permutations;
        }

        /**
         *  get the first character
         */
        char first = str.charAt(0);

        /**
         *  get the remaining substring
         */
        String sub = str.substring(1);

        /**
         *  make recursive call to getPermutation()
         */
        Set<String> words = getPermutation(sub);

        /**
         * here using for loop
         *  access each element from words
         */
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){

                /**
                 * insert the permutation to the set
                 */
                permutations.add(strNew.substring(0, i) + first + strNew.substring(i));
            }
        }
        return permutations;
    }

    /**
     * create a main method
     * all programs execute in main method
     * @param args no arguments is default
     */
    public static void main(String[] args) {

        /**
         *  create an object of scanner class
         *  object name is input
         */
        Scanner input = new Scanner(System.in);

        /**
         *  take input from users
         */
        System.out.print("Enter the string: ");
        String data = input.nextLine();
        System.out.println("Permutations of " + data + ": \n" + getPermutation(data));
    }
}