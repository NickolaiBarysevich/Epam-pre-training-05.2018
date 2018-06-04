/*
 * @(#)Palindrome.java                  2.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 04.06.18 22:17
 */

package com.nickshock.task4;

/**
 * This class defines whether a number is a palindrome
 *
 * @author Barysevich Nikalai
 * @version 2.1 4 June 2018
 */

public class Palindrome {

    /**
     * Return true if a number is a palindrome
     */
    public static boolean isPalindrome(int number) {
        if (number < 10) {
            return number > -1;
        }

        int first;
        int last;

        while (number != 0) {
            first = getFirstDigit(number);
            last = MaxDigit.getLastDigit(number);

            if (first != last) {
                return false;
            }

            number /= 10;
            number -= first * getFactor(number);
        }

        return true;
    }

    /**
     * Return the first digit of a number
     */
    public static int getFirstDigit(int number) {
        return number / getFactor(number);
    }

    /**
     * Return the factor of a number.
     * It's need to calculate the first digit
     */
    public static int getFactor(int number) {
        int factor = 1;
        while ((number /= 10) != 0) {
            factor *= 10;
        }
        return factor;
    }


}
