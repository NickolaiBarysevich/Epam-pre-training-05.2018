/*
 * @(#)Dragon.java            1.2 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 29.05.18 00:45
 */

package com.nickshock.task3;

/**
 * This class count dragon's heads and eyes
 *
 * @version          1.2 29 May 2018
 * @author           Barysevich Nikalai
 */

public class Dragon {

    public static final int HEADS_BEFORE200 = 3;
    public static final int HEADS_AFTER200 = 2;
    public static final int BORDER_FOR_200 = 200;
    public static final int BORDER_FOR_300 = 300;


    /** Count heads and eyes*/
    public static String countHeads(int years) {
        String result = "Dragon has 3 heads and 6 eyes.";

        if (years == 0) return result;
        else if (years < 0) {
            result = "Wrong years value.";
            return result;
        }

        int heads = years;

        if (years <= BORDER_FOR_200) {
            heads *= HEADS_BEFORE200;
        } else if (years <= BORDER_FOR_300) {
            heads = BORDER_FOR_200 * HEADS_BEFORE200;
            heads += (years - BORDER_FOR_200) * HEADS_AFTER200;
        } else {
            heads = BORDER_FOR_200 * HEADS_BEFORE200;
            heads += 100 * HEADS_AFTER200;
            heads += years - BORDER_FOR_300;
        }

        result = "Dragon has " + heads + " and " + heads * 2 + " eyes.";

        return result;
    }


}
