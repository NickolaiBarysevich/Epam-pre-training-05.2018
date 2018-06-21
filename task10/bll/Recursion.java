/*
 * @(#)Recursion.java          1.2 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 21.06.18 14:15
 */

package com.nickshock.task10.bll;

/**
 * This class represents some tasks solved by recursion
 *
 * @author Barysevich Nikalai
 * @version 1.2 21 June 2018
 */
public class Recursion {

    /**
     * Returns sum of the digits of a number.
     *
     * @param number the number, digits of which to be summed.
     * @return sum of the digits of a number.
     */
    public static int countDigitsSum(int number) {
        if (number < 0) return number;
        if (number < 10) {
            return number;
        }
        return number % 10 + countDigitsSum(number / 10);
    }

    /**
     * Raises a number to the power of.
     *
     * @param x the number to be powered.
     * @param n the power.
     * @return raised number to the power of n.
     */
    public static double pow(double x, int n) {
        if (n == 1) {
            return x;
        }
        return x * pow(x, --n);
    }

    /**
     * Defines whether the sum of the digits of a first number equals to the second number.
     *
     * @param n the number digits of which ti be summed.
     * @param s the number to be compared with the sum.
     * @return true if the sum of the digits equals to s.
     */
    public static boolean equals(int n, int s) {
        if (n < 0 || s < 0) return false;

        if (s == 0 || n == 0) return n == s;

        return equals(n / 10, s - n % 10);
    }

    /**
     * Method founds the Fibonacci number by the index.
     *
     * @param index the index of Fibonacci number to be found.
     * @return Fibonacci number by the index.
     */
    public static int getFibByIndex(int index) {
        if (index < 2) {
            if (index < 0){
                return -1;
            }
            return index;
        }
        return getFibByIndex(index - 1) + getFibByIndex(index - 2);
    }

    /**
     * Method solve the "tower of hanoi".
     *
     * @param rings amount of rings to be replaced.
     * @param source the first pyramid where rings situated.
     * @param receiver the pyramid where rings must be.
     * @param temp temporary pyramid.
     */
    public static void resolveHanoi(int rings, char source, char receiver, char temp) {
        if (rings > 0) {
            resolveHanoi(rings - 1, source, temp, receiver);
            System.out.println(source + "-->" + receiver);
            resolveHanoi(rings - 1, temp, receiver, source);
        }
    }
}
