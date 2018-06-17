/*
 * @(#)Palindrome.java          2.2 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 23:51
 */

package com.nickshock.task4;

/**
 * This class defines whether a number is a palindrome.
 *
 * @author Barysevich Nikalai
 * @version 2.2 16 June 2018
 */

public class Palindrome {

    /**
     * Returns true if a number is a palindrome.
     *
     * @param number number to be checked.
     * @return true if number is a palindrome.
     */
    public static boolean isPalindrome(int number) {
        if (number < 10) {
            return number > -1;
        }

        while (number != 0) {
            int first = getFirstDigit(number);
            int last = MaxDigit.getLastDigit(number);

            if (first != last) {
                return false;
            }

            number /= 10;
            number -= first * getFactor(number);
        }

        return true;
    }

    /**
     * Returns the first digit of a number.
     *
     * @param number number in which first digit would be counted.
     * @return the first digit of a number.
     */
    public static int getFirstDigit(int number) {
        return number / getFactor(number);
    }

    /**
     * Return the factor of a number.
     * It's need to calculate the first digit.
     *
     * @param number number in which factor would be counted.
     * @return the factor of a number.
     */
    public static int getFactor(int number) {
        int factor = 1;
        while ((number /= 10) != 0) {
            factor *= 10;
        }
        return factor;
    }


}
