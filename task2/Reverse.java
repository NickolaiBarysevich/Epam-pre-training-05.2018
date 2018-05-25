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

    /** Reverse the numerals of a number*/
    public static int reverse(int a) {
        byte n1 = (byte) ((a / 100_000_0) % 10);
        byte n2 = (byte) ((a / 100_000) % 10);
        byte n3 = (byte) ((a / 10_000) % 10);
        byte n4 = (byte) ((a / 1_000) % 10);
        byte n5 = (byte) ((a / 100) % 10);
        byte n6 = (byte) ((a / 10) % 10);
        byte n7 = (byte) (a % 10);

        int num = 0;

        num += n1;
        num += n2 * 10;
        num += n3 * 100;
        num += n4 * 1000;
        num += n5 * 10000;
        num += n6 * 100000;
        num += n7 * 1000000;

        return num;
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

