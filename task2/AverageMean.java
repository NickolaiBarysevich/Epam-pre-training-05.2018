/*
 * @(#)AverageMean.java      1.0 25/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task2;

/**
 * This class is used for calculating arithmetic and geometric
 * means of numbers's digits
 *
 * @version          1.0 25 May 2018
 * @author           Barysevich Nikalai
 */

public class AverageMean {

    /** Return the arithmetical mean of numerals of a number*/
    public static double arithmeticMean(int a) {
        if (a < 100_000 || a > 999_999) throw new ArithmeticException("wrong number");

        double sum = 0;
        byte[] arr = new byte[6];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = (byte) (a % 10);
            sum += arr[i];
            a /= 10;
        }

        return sum / arr.length;
    }

    /** Return the geometric mean of numerals of a number*/
    public static double geometricMean(int a) {
        if (a < 100_000 || a > 999_999) throw new ArithmeticException("wrong number");

        double op = 1;
        byte[] arr = new byte[6];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = (byte) (a % 10);
            op *= arr[i];
            a /= 10;
        }

        return Math.pow(op, 1. / arr.length);
    }
}
