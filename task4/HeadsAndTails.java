/*
 * @(#)HeadsAndTails.java                  1.4 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 04.06.18 22:12
 */

package com.nickshock.task4;

/**
 * This class counts the number of dropped heads for a certain number of throws
 *
 * @version 1.4 4 June 2018
 * @author Barysevich Nikalai
 */

import java.util.Random;

public class HeadsAndTails {

    public static final int HEADS_VALUE = 0;
    public static final int RANDOM_RANGE = 2;

    /** Return amount of dropped heads*/
    public static int tossACoin(int throwsAmount) {
        if (throwsAmount < 1) {
            return -1;
        }

        Random rnd = new Random();
        int heads = 0;

        int thr;

        for (int i = 0; i < throwsAmount; i++) {
            thr = rnd.nextInt(RANDOM_RANGE);
            if (thr == HEADS_VALUE) {
                heads++;
            }
        }

        return heads;
    }

}
