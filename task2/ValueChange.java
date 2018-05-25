/*
 * @(#)ValueChange.java      1.0 25/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task2;

/**
 * Class that used for changing values o two variables
 *
 * @version          1.0 25 May 2018
 * @author           Barysevich Nikalai
 */

public class ValueChange {

    /** Change values of two int variables*/
    public static void change(int a, int b) {
        System.out.println("Got: a = " + a + ", b = " + b);
        a += b;
        b = a - b;
        a = a - b;
        System.out.println("Result: a = " + a + ", b = " + b);
    }
}
