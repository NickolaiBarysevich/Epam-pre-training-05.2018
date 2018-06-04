/*
 * @(#)PerfectNumber.java                  1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 04.06.18 22:41
 */

package com.nickshock.task4;

/**
 * This class defines whether a number is a perfect
 *
 * @version          1.1 1 June 2018
 * @author           Barysevich Nikalai
 */

public class PerfectNumber {

    public static final int FIRST_PERFECT_NUMBER = 6;

    /** Return true if a number is perfect*/
    public static boolean isPerfect(int number) {
        if (number < FIRST_PERFECT_NUMBER) {
            return false;
        }

        if (number == FIRST_PERFECT_NUMBER) {
            return true;
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return number == sum;
    }
}
