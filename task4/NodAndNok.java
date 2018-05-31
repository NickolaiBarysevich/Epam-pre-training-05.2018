/*
 * @(#)NodAndNok.java           1.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 01.06.18 0:53
 *
 */

package com.nickshock.task4;

/**
 * This class counts nod and nok of a number
 *
 * @version          1.0 1 June 2018
 * @author           Barysevich Nikalai
 */

public class NodAndNok {

    /** Counts nod*/
    public static int getNod(int a, int b) {
        return b == 0 ? a : getNod(b, a % b);
    }

    /** Counts nod*/
    public static int getNok(int a, int b) {
        return a / getNod(a, b) * b;
    }
}
