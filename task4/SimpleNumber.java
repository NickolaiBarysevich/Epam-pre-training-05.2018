/*
 * @(#)SimpleNumber.java           1.2 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 01.06.18 0:52
 *
 */

package com.nickshock.task4;

/**
 * This class defines whether a number is simple and find all simple dividers
 * of a number
 *
 * @version          1.2 1 June 2018
 * @author           Barysevich Nikalai
 */

public class SimpleNumber {

    /** Return true if a number is simple*/
    public static boolean isSimple(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    /** Return all simple dividers of a number*/
    public static String findSimpleDividers(int number) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (isSimple(i)) {
                    result.append(i + " ");
                }
            }
        }

        return result.toString();
    }
}
