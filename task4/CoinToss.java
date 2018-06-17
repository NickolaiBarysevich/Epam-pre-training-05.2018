/*
 * @(#)CoinToss.java          1.5 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 17.06.18 21:48
 */

package com.nickshock.task4;

import java.util.Random;

/**
 * This class counts the number of dropped heads for a certain number of throws.
 *
 * @version 1.5 17 June 2018
 * @author Barysevich Nikalai
 */
public class CoinToss {

    /**
     * Return amount of dropped heads.
     *
     * @param throwsAmount amount of throws do be made.
     * @return the amount of dropped heads.
     */
    public static int tossACoin(int throwsAmount) {
        if (throwsAmount < 1) {
            return -1;
        }

        Random rnd = new Random();
        int heads = 0;

        for (int i = 0; i < throwsAmount; i++) {
            if (rnd.nextBoolean()) {
                heads++;
            }
        }

        return heads;
    }

}
