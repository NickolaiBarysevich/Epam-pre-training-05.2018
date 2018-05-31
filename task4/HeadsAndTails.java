/*
 * @(#)HeadsAndTails.java           1.3 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 01.06.18 0:57
 *
 */

package com.nickshock.task4;

/**
 * This class counts the number of dropped heads for a certain number of throws
 *
 * @version          1.3 1 June 2018
 * @author           Barysevich Nikalai
 */

import java.util.Random;

public class HeadsAndTails {

    public static final int HEADS_VALUE = 0;

    /** Return amount of dropped heads*/
    public static int throwCoin(int throwsAmount) {
        if (throwsAmount < 1) {
            return -1;
        }

        Random rnd = new Random();
        int heads = 0;

        int thr;

        for (int i = 0; i < throwsAmount; i++) {
            thr = rnd.nextInt(2);
            if (thr == HEADS_VALUE) {
                heads++;
            }
        }

        return heads;
    }

}
