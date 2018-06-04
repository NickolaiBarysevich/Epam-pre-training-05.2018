/*
 * @(#)Triangle.java                  1.4 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 05.06.18 0:04
 */

package com.nickshock.task3;

/**
 * This class defines whether there is a triangle with transmitted vertices
 *
 * @author Barysevich Nikalai
 * @version 1.4 5 June 2018
 */

public class Triangle {

    /**
     * Defines if a triangle exists
     */
    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    /**
     * Return distance between two points
     */
    public static double getSide(int x1, int y1, int x2, int y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    /**
     * Defines whether the triangle is rectangular
     */
    public static boolean isRectangular(double a, double b, double c) {
        return a * a + b * b == c * c
                || b * b + c * c == a * a
                || a * a + c * c == b * b;
    }
}
