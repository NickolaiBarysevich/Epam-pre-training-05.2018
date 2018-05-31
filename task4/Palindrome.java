/*
 * @(#)Palindrome.java           2.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 01.06.18 0:57
 *
 */

package com.nickshock.task4;

/**
 * This class defines whether the number is a palindrome
 *
 * @version          2.0 1 June 2018
 * @author           Barysevich Nikalai
 */

public class Palindrome {

    /** Return true if a number is a palindrome*/
    public static boolean isPalindrome(int number) {
        boolean result = true;

        if (number < 10 && number > -10){
            return result;
        }


        int first;
        int last;

        while (number != 0) {
            first = getFirstDigit(number);
            last = MaxDigit.getLastDigit(number);

            if (first != last) {
                result = false;
                break;
            }

            number /= 10;
            number -= first * getFactor(number);
        }

        return result;
    }

    /** Return the first digit of a number*/
    public static int getFirstDigit(int number) {

        int p = getFactor(number);

        return number/p;
    }

    /** Return the factor of a number.
     * It's need to calculate the first digit
     */
    public static int getFactor(int number) {
        int factor = 1;
        while ((number /= 10) != 0){
            factor *= 10;
        }
        return factor;
    }


}
