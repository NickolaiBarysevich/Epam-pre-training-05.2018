/*
 * @(#)Dragon.java            1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 27.05.18 23:30
 */

package com.nickshock.task3;

/**
 * This class count dragon's heads and eyes
 *
 * @version          1.1 27 May 2018
 * @author           Barysevich Nikalai
 */

public class Dragon {

    public static final int HEADS_BEFORE201 = 3;
    public static final int HEADS_AFTER200 = 2;


    /** Count heads and eyes*/
    public static String countHeads(int years) {
        String result = "Dragon has 3 heads and 6 eyes.";

        if (years == 0) return result;
        else if (years < 0) {
            result = "Wrong years value.";
            return result;
        }

        int heads = years;

        if (years < 201) {
            heads *= HEADS_BEFORE201;
        } else if (years < 301) {
            heads = 200 * HEADS_BEFORE201;
            heads += (years - 200) * HEADS_AFTER200;
        } else {
            heads = 200 * HEADS_BEFORE201;
            heads += 100 * HEADS_AFTER200;
            heads += years - 300;
        }

        result = "Dragon has " + heads + " and " + heads * 2 + " eyes.";

        return result;
    }


}
