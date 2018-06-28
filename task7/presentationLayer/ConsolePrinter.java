/*
 * @(#)ConsolePrinter.java          1.3 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 28.06.18 12:33
 */

package com.nickshock.task7.presentationLayer;

/**
 * View class that prints gotten information to console.
 *
 * @author Barysevich Nikalai
 * @version 1.3 28 June 2018
 */
public class ConsolePrinter {

    /**
     * Prints gotten object to console.
     *
     * @param info info to be printed.
     */
    public static void print(Object info) {
        System.out.println(info);
    }
}
