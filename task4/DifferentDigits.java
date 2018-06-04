/*
 * @(#)DifferentDigits.java                  1.9 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 04.06.18 22:35
 */

package com.nickshock.task4;

/**
 * This class calculates the amount of the different digits in a number
 *
 * @author Barysevich Nikalai
 * @version 1.9 4 June 2018
 */

public class DifferentDigits {

    /**
     * Return the amount of the different digits
     */
    public static int countDifferentDigits(int number) {

        int length = getNumberLength(number);

        int digit;
        while (number != 0) {
            digit = MaxDigit.getLastDigit(number);

            if (!isSingleDigit(number, digit)) {
                length--;
            }

            number /= 10;
        }

        return length;
    }

    /**
     * Return true if digit is single in a number
     */
    public static boolean isSingleDigit(int number, int countingDigit) {
        int amount = 0;

        boolean result = true;
        int digit;

        while (number != 0) {
            digit = MaxDigit.getLastDigit(number);

            if (digit == countingDigit) {
                amount++;
            }

            if (amount > 1) {
                result = false;
                break;
            }
            number /= 10;
        }

        return result;
    }

    /**
     * Returns length of a number
     */
    public static int getNumberLength(int number) {
        int length = 0;
        while (number != 0) {
            length++;
            number /= 10;
        }
        return length;
    }


}
