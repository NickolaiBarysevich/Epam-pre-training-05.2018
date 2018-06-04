/*
 * @(#)PrimeNumber.java                  1.4 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 04.06.18 22:30
 */

package com.nickshock.task4;

/**
 * This class defines whether a number is prime and find all prime dividers
 * of a number
 *
 * @author Barysevich Nikalai
 * @version 1.4 4 June 2018
 */

public class PrimeNumber {

    public static final int FIRST_PRIME_NUMBER = 2;

    /**
     * Return true if a number is prime
     */
    public static boolean isPrime(int number) {

        if (number < FIRST_PRIME_NUMBER) {
            return false;
        }

        for (int i = FIRST_PRIME_NUMBER; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Return all simple dividers of a number
     */
    public static String findPrimeDividers(int number) {
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    builder.append(i);
                    builder.append(" ");

                }
            }
        }

        return builder.toString().trim();
    }
}
