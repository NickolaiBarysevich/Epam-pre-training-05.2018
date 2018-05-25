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
 * @version          2.0 26 May 2018
 * @author           Barysevich Nikalai
 */

public class AverageMean {

//    public static final int MIN_VALUE = 100_000;
//    public static final int MAX_VALUE = 999_999;


    /** Return the arithmetical mean of numerals of a number*/
    public static double arithmeticMean(int a) {
        byte n1 = (byte) ((a / 100_000) % 10);
        byte n2 = (byte) ((a / 10_000) % 10);
        byte n3 = (byte) ((a / 1_000) % 10);
        byte n4 = (byte) ((a / 100) % 10);
        byte n5 = (byte) ((a / 10) % 10);
        byte n6 = (byte) (a % 10);

        return (n1 + n2 + n3 + n4 + n5 + n6) / 6.;
    }

//    public static double arithmeticMean(int a) {
//        if (a < MIN_VALUE || a > MAX_VALUE) throw new ArithmeticException("wrong number");
//
//        double sum = 0;
//        byte[] arr = new byte[6];
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            arr[i] = (byte) (a % 10);
//            sum += arr[i];
//            a /= 10;
//        }
//
//        return sum / arr.length;
//    }

    /** Return the geometric mean of numerals of a number*/
    public static double geometricMean(int a) {
        byte n1 = (byte) ((a / 100_000) % 10);
        byte n2 = (byte) ((a / 10_000) % 10);
        byte n3 = (byte) ((a / 1_000) % 10);
        byte n4 = (byte) ((a / 100) % 10);
        byte n5 = (byte) ((a / 10) % 10);
        byte n6 = (byte) (a % 10);

        return Math.exp(Math.log(n1 * n2 * n3 * n4 * n5 * n6) / 6);
    }
//    public static double geometricMean(int a) {
//        if (a < MIN_VALUE || a > MAX_VALUE) throw new ArithmeticException("wrong number");
//
//        double op = 1;
//        byte[] arr = new byte[6];
//
//        for (int i = arr.length - 1; i >= 0; i--) {
//            arr[i] = (byte) (a % 10);
//            op *= arr[i];
//            a /= 10;
//        }
//
//        return Math.exp(Math.log(op) / arr.length);
//    }
}
