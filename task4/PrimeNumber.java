/*
 * @(#)PrimeNumber.java          1.5 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 17.06.18 0:43
 */

package com.nickshock.task4;

/**
 * This class defines whether a number is prime and find all prime dividers
 * of a number.
 *
 * @author Barysevich Nikalai
 * @version 1.5 16 June 2018
 */

public class PrimeNumber {

    public static final int FIRST_PRIME_NUMBER = 2;

    /**
     * Returns true if the number is prime.
     *
     * @param number to be checked.
     * @return true if the number is prime.
     */
    public static boolean isPrime(int number) {
        if (number == FIRST_PRIME_NUMBER) {
            return true;
        }

        if (number < FIRST_PRIME_NUMBER || number % 2 == 0) {
            return false;
        }

        int length = (int) Math.sqrt(number);

        for (int i = FIRST_PRIME_NUMBER + 1; i <= length; i+=2) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Returns all simple dividers of the number.
     *
     * @param number number to be checked.
     * @return all simple dividers of the number.
     */
    public static String findPrimeDividers(int number) {
        StringBuilder builder = new StringBuilder();

        int length = number / 2;

        for (int i = 1; i <= length; i++) {
            if (number % i == 0) {
                if (isPrime(i)) {
                    builder.append(i);
                    builder.append(" ");
                }
            }
        }

        if (isPrime(number)) {
            builder.append(number);
        }

        String result = builder.toString().trim();

        return !result.equals("") ? result : "No simple dividers of " + number;
    }
}
