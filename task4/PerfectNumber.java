/*
 * @(#)PerfectNumber.java          1.2 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 17.06.18 0:43
 */

package com.nickshock.task4;

/**
 * This class defines whether a number is perfect.
 *
 * @author Barysevich Nikalai
 * @version 1.2 16 June 2018
 */

public class PerfectNumber {

    public static final int FIRST_PERFECT_NUMBER = 6;

    /**
     * Returns true if the number is perfect.
     *
     * @param number to be checked.
     * @return true if the number is perfect.
     */
    public static boolean isPerfect(int number) {
        if (number < FIRST_PERFECT_NUMBER) {
            return false;
        }

        if (number == FIRST_PERFECT_NUMBER) {
            return true;
        }

        int sum = 0;
        int length = number / 2;
        for (int i = 1; i <= length; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return number == sum;
    }
}
