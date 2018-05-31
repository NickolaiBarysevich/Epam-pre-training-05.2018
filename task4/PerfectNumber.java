/*
 * @(#)PerfectNumber.java           1.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 01.06.18 0:07
 *
 */

package com.nickshock.task4;

/**
 * This class defines whether a number is a perfect
 *
 * @version          1.0 1 June 2018
 * @author           Barysevich Nikalai
 */

public class PerfectNumber {

    /** Return true if a number is perfect*/
    public static boolean isPerfect(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return number == sum;
    }
}
