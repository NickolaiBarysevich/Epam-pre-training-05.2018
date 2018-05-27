/*
 * @(#)Triangle.java            1.2 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 27.05.18 23:30
 */

package com.nickshock.task3;

/**
 * This class defines whether there is a triangle with transmitted vertices
 *
 * @version          1.2 27 May 2018
 * @author           Barysevich Nikalai
 */

public class Triangle {

    /** Defines is a triangle exists*/
    public static String isTriangle(int x1, int y1, int x2,
                                    int y2, int x3, int y3) {
        double a = Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
        double b = Math.sqrt(Math.pow((y3 - y2), 2) + Math.pow((x3 - x2), 2));
        double c = Math.sqrt(Math.pow((y3 - y1), 2) + Math.pow((x3 - x1), 2));

        String result = "Triangle with this points cannot exist.";

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            result = "Triangle with this points can exist.";
            if (isRectangular(a, b, c)) {
                result = "Triangle with this points can exist and it's rectangular.";
            }
        }
        return result;
    }

    /** Defines whether the triangle is rectangular*/
    private static boolean isRectangular(double a, double b, double c) {
        return (a * a + b * b == c * c)
                || (b * b + c * c == a * a)
                || (a * a + c * c == b * b);
    }
}
