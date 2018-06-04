/*
 * @(#)Dragon.java                  1.3 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 04.06.18 23:58
 */

package com.nickshock.task3;

/**
 * This class count dragon's heads and eyes
 *
 * @author Barysevich Nikalai
 * @version 1.3 4 June 2018
 */

public class Dragon {

    public static final int HEADS_BEFORE_200 = 3;
    public static final int HEADS_AFTER_200 = 2;
    public static final int BORDER_FOR_200 = 200;
    public static final int BORDER_FOR_300 = 300;
    public static final int HEADS_IF_AGE_MORE_THAN_300 = 100;


    /**
     * Count heads
     */
    public static int countHeads(int age) {

        if (age == 0) {
            return 3;
        } else if (age < 0) {
            return -1;
        }

        int heads = age;

        if (age <= BORDER_FOR_200) {
            heads *= HEADS_BEFORE_200;
        } else if (age <= BORDER_FOR_300) {
            heads = BORDER_FOR_200 * HEADS_BEFORE_200;
            heads += (age - BORDER_FOR_200) * HEADS_AFTER_200;
        } else {
            heads = BORDER_FOR_200 * HEADS_BEFORE_200;
            heads += HEADS_IF_AGE_MORE_THAN_300 * HEADS_AFTER_200;
            heads += age - BORDER_FOR_300;
        }

        return heads;
    }

    /**
     * Count eyes
     */
    public static int getEyes(int heads) {
        return heads * 2;
    }

}
