/*
 * @(#)EqualLogic.java      1.0 25/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task2;

/**
 * This class is used for check the equality of 3 variables
 *
 * @version          1.0 25 May 2018
 * @author           Barysevich Nikalai
 */

public class EqualLogic {

    /** Compares 3 int numbers and return true if they are equal*/
    public static boolean checkEquality(int a, int b, int c) {
        return (a == b) && (b == c);
    }
}
