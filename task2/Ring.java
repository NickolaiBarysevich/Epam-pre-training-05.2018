/*
 * @(#)Ring.java      1.0 25/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task2;

/**
 * This class is used for calculate ring area
 *
 * @version          1.0 25 May 2018
 * @author           Barysevich Nikalai
 */

public class Ring {

    /** Return the area of a ring*/
    public static double ringArea(double r1, double r2) {
        if (r2 > r1) throw new ArithmeticException("r1 must be bigger than r2");
        return Math.PI * (r1 * r1 - r2 * r2);
    }
}
