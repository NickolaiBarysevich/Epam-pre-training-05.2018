/*
 * @(#)DifferentDigits.java           1.7 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 01.06.18 0:52
 *
 */

package com.nickshock.task4;

/**
 * This class calculates the amount of the different digits in a number
 *
 * @version          1.7 1 June 2018
 * @author           Barysevich Nikalai
 */

public class DifferentDigits {

    /** Return the amount of a different digits*/
    public static int countDifferentDigits(int number) {

        int amountOfSameDigits = 0;
        int length = getNumberLength(number);

        int digit;
        while (number != 0) {
            digit = MaxDigit.getLastDigit(number);

            if (countDigitInNumber(number, digit) > 1) {
                amountOfSameDigits++;
            }

            number /= 10;
        }

        return length - amountOfSameDigits;
    }

    /** Return the of a one digit in a number*/
    public static int countDigitInNumber(int number, int countingDigit) {
        int amount = 0;

        int digit;

        while (number != 0) {
            digit = MaxDigit.getLastDigit(number);

            if (digit == countingDigit) {
                amount++;
            }
            number /= 10;
        }

        return amount;
    }

    /** Returns length of a number*/
    public static int getNumberLength(int number) {
        int length = 0;
        while (number != 0) {
            length++;
            number /= 10;
        }
        return length;
    }


}
