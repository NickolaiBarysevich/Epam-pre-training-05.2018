/*
 * @(#)Reverse.java      2.0 26/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task2;

/**
 * This class is used for reversing a number
 *
 * @version          2.0 26 May 2018
 * @author           Barysevich Nikalai
 */

public class Reverse {

//    public static final int MIN_VALUE = 1_000_000;
//    public static final int MAX_VALUE = 9_999_999;

   public static int reverse(int number) {
        int n1 = number % 10;
        int n2 = getDigit(number /= 10);
        int n3 = getDigit(number /= 10);
        int n4 = getDigit(number /= 10);
        int n5 = getDigit(number /= 10);
        int n6 = getDigit(number /= 10);
        int n7 = getDigit(number /= 10);

        int num = 0;

        num += n7;
        num += n6 * 10;
        num += n5 * 100;
        num += n4 * 1000;
        num += n3 * 10000;
        num += n2 * 100000;
        num += n1 * 1000000;

        return num;
    }

    public static int getDigit(int number) {
        return number % 10;
    }


//    public static int reverse(int a) {
//        if (a < MIN_VALUE || a > MAX_VALUE) throw new ArithmeticException("wrong number");
//
//        byte[] arr = new byte[7];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (byte) (a % 10);
//            a /= 10;
//        }
//
//        int num = 0;
//
//        for (int i = arr.length - 1, p = 1; i >= 0; --i, p *= 10) {
//            num += arr[i] * p;
//        }
//        return num;
//    }
}

