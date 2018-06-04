/*
 * @(#)GcdAndLcm.java                  1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 04.06.18 22:32
 */

package com.nickshock.task4;

/**
 * This class counts gcd and lcm of a number
 *
 * @author Barysevich Nikalai
 * @version 1.1 4 June 2018
 */

public class GcdAndLcm {

    /**
     * Counts gcd
     */
    public static int getGcd(int a, int b) {
        return b == 0 ? Math.abs(a) : getGcd(b, a % b);
    }

    /**
     * Counts lcm
     */
    public static int getLcm(int a, int b) {
        return a / getGcd(a, b) * b;
    }
}
