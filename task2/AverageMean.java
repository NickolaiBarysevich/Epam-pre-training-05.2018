/*
 * @(#)AverageMean.java      2.1 29/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task2;

/**
 * This class is used for calculating arithmetic and geometric
 * means of numbers's digits
 *
 * @version          2.1 29 May 2018
 * @author           Barysevich Nikalai
 */

public class AverageMean {

   //public static final int MIN_VALUE = 100_000;
   //public static final int MAX_VALUE = 999_999;
   //public static final String NUMBER_ERROR = "wrong number"; 


    /** Return the arithmetical mean of numerals of a number*/
    public static double getArithmeticMean(int number) {
        int n1 = number % 10;
        int n2 = getDigit(number /= 10);
        int n3 = getDigit(number /= 10);
        int n4 = getDigit(number /= 10);
        int n5 = getDigit(number /= 10);
        int n6 = getDigit(number /= 10);

        return (n1 + n2 + n3 + n4 + n5 + n6) / 6.;
    }

    public static int getDigit(int number) {
        return number % 10;
    }

//    public static double getArithmeticMean(int a) {
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
    public static double getGeometricMean(int number) {
        int n1 = number % 10;
        int n2 = getDigit(number /= 10);
        int n3 = getDigit(number /= 10);
        int n4 = getDigit(number /= 10);
        int n5 = getDigit(number /= 10);
        int n6 = getDigit(number /= 10);
        int n7 = getDigit(number /= 10);

        return Math.exp(Math.log(n1 * n2 * n3 * n4 * n5 * n6) / 6);
    }
//    public static double getGeometricMean(int a) {
//        if (a < MIN_VALUE || a > MAX_VALUE) throw new ArithmeticException(NUMBER_ERROR);
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
