/*
 * @(#)Sequence.java      1.1 26/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task2;

/**
 * Class that checks number's digits on increasing sequence
 *
 * @version          1.1 26 May 2018
 * @author           Barysevich Nikalai
 */

public class Sequence {
    
    //public static final String NUMBER_ERROR = "wrong number";

    /** Check if a number is increasing sequence*/
    public static boolean isIncreasingSequence(int a) {
        //if (a < 1000 || a > 9999) throw new ArithmeticException(NUMBER_ERROR);
        return ((a / 1000) % 10) < ((a / 100) % 10) && ((a / 10) % 10) < a % 10;
    }

    /** Check if a number is decreasing sequence*/
    public static boolean isDecreasingSequence(int a) {
        //if (a < 1000 || a > 9999) throw new ArithmeticException(NUMBER_ERROR);
        return ((a / 1000) % 10) > ((a / 100) % 10) && ((a / 10) % 10) > a % 10;
    }
}
