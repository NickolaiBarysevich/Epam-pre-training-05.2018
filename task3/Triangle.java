/*
 * @(#)Triangle.java            1.3 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 29.05.18 00:41
 */

package com.nickshock.task3;

/**
 * This class defines whether there is a triangle with transmitted vertices
 *
 * @version          1.3 28 May 2018
 * @author           Barysevich Nikalai
 */

public class Triangle {

   /** Defines is a triangle exists*/
    public static String isTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double a = getSide(x1, y1, x2, y2);
        double b = getSide(x2, y2, x3, y3);
        double c = getSide(x1, y1, x3, y3);

        String result = "Triangle with this points cannot exist.";

        if (a + b > c && a + c > b && b + c > a) {
            result = "Triangle with this points can exist.";
            if (isRectangular(a, b, c)) {
                result = "Triangle with this points can exist and it's rectangular.";
            }            
        }
        return result;
    }

    public static double getSide(int x1, int y1, int x2, int y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    /** Defines whether the triangle is rectangular*/
    private static boolean isRectangular(double a, double b, double c) {
        return a * a + b * b == c * c
                || b * b + c * c == a * a
                || a * a + c * c == b * b;
    }
}
