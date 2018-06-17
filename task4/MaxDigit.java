/*
 * @(#)MaxDigit.java          1.5 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 17.06.18 0:45
 */

package com.nickshock.task4;

/**
 * This class defines the max digit of a number.
 *
 * @author Barysevich Nikalai
 * @version 1.5 16 June 2018
 */

public class MaxDigit {

    public static final int MAX_DIGIT_VALUE = 9;

    /**
     * Returns max digit.
     *
     * @param number number in which max digit to be searched.
     * @return max digit of a number.
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
     * Returns the last digit of a number.
     *
     * @param number number in which last digit to be counted.
     * @return the last digit of a number.
     */
    public static int getLastDigit(int number) {
        return number % 10;
    }


}
