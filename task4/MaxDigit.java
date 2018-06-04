/*
 * @(#)MaxDigit.java                  1.4 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 04.06.18 22:12
 */

package com.nickshock.task4;

/**
 * This class defines the max digit of a number
 *
 * @author Barysevich Nikalai
 * @version 1.4 4 June 2018
 */

public class MaxDigit {

    public static final int MAX_DIGIT_VALUE = 9;

    /**
     * Return max digit
     */
    public static int getMaxDigit(int number) {
        number = Math.abs(number);

        int max = 0;
        int digit = getLastDigit(number);

        while (number != 0) {
            if (digit > max) {
                max = digit;
            }

            if (max == MAX_DIGIT_VALUE) {
                break;
            }
            digit = getLastDigit(number /= 10);
        }

        return max;
    }

    /**
     * Return last digit
     */
    public static int getLastDigit(int number) {
        return number % 10;
    }


}
