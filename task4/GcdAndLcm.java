/*
 * @(#)GcdAndLcm.java          1.2 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 23:36
 */

package com.nickshock.task4;

/**
 * This class counts gcd and lcm of a number.
 *
 * @author Barysevich Nikalai
 * @version 1.2 16 June 2018
 */

public class GcdAndLcm {

    /**
     * Counts gcd of two numbers.
     *
     * @param a first number.
     * @param b second number.
     * @return gcd of two numbers.
     */
    public static int getGcd(int a, int b) {
        return b == 0 ? Math.abs(a) : getGcd(b, a % b);
    }

    /**
     * Counts lcm of two numbers.
     *
     * @param a first number.
     * @param b second number.
     * @return lcm of two numbers.
     */
    public static int getLcm(int a, int b) {
        return a / getGcd(a, b) * b;
    }
}
