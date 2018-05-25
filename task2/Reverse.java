/*
 * @(#)Reverse.java      1.0 25/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task2;

/**
 * This class is used for reversing a number
 *
 * @version          1.0 25 May 2018
 * @author           Barysevich Nikalai
 */

public class Reverse {

    /** Reverse the numerals of a number*/
    public static int reverse(int a) {
        if (a < 1_000_000 || a > 9_999_999) throw new ArithmeticException("wrong number");

        byte[] arr = new byte[7];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) (a % 10);
            a /= 10;
        }

        int num = 0;

        for (int i = arr.length - 1, p = 1; i >= 0; --i, p *= 10) {
            num += arr[i] * p;
        }
        return num;
    }
}
