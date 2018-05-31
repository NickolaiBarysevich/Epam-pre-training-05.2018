/*
 * @(#)MaxDigit.java           1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 01.06.18 0:57
 *
 */

package com.nickshock.task4;

/**
 * This class defines the max digit of a number
 *
 * @version          1.1 31 M1 June 2018
 * @author           Barysevich Nikalai
 */

public class MaxDigit {

    /** Return max digit*/
    public static int getMaxDigit(int number) {

        int max = 0;
        int digit = getLastDigit(number);

        while (number != 0) {
            if (digit > max) {
                max = digit;
            }

            if (max == 9) {
                break;
            }
            digit = getLastDigit(number /= 10);
        }

        return max;
    }

    /** Return last digit*/
    public static int getLastDigit(int number) {
        return number % 10;
    }


}
