/*
 * @(#)Ring.java      1.1 26/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task2;

/**
 * This class is used for calculate ring area
 *
 * @version          1.1 26 May 2018
 * @author           Barysevich Nikalai
 */

public class Ring {

    /** Return the area of a ring*/
     public static double getRingArea(double r1, double r2) {
        return r1 > r2 ? Math.PI * (r1 * r1 - r2 * r2)
                        : Math.PI * (r2 * r2 - r1 * r1);
    }
}
