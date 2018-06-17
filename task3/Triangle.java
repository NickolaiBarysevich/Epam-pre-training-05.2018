/*
 * @(#)Triangle.java          1.6 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 17.06.18 1:05
 */

package com.nickshock.task3;

/**
 * This class defines whether there is a triangle with transmitted vertices.
 *
 * @author Barysevich Nikalai
 * @version 1.6 17 June 2018
 */
public class Triangle {

    /**
     * Defines if the triangle exists.
     *
     * @param a first side of the triangle.
     * @param b second side of the triangle.
     * @param c third side of the triangle.
     * @return true if triangle exists.
     */
    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    /**
     * Returns distance between two points.
     *
     * @param x1 x of the first point.
     * @param y1 y of the first point.
     * @param x2 x of the second point.
     * @param y2 y of the second point.
     * @return distance between two points.
     */
    public static double getSide(int x1, int y1, int x2, int y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    /**
     * Defines whether the triangle is rectangular.
     *
     * @param a first side of the triangle.
     * @param b second side of the triangle.
     * @param c third side of the triangle.
     * @return true if triangle is rectangular.
     */
    public static boolean isRectangular(double a, double b, double c) {
        return a * a + b * b == c * c
                || b * b + c * c == a * a
                || a * a + c * c == b * b;
    }
}
