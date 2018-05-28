/*
 * @(#)MoodSensor.java            1.2 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 29.05.18 0:48
 */

package com.nickshock.task3;

/**
 * This class defines user's mood
 *
 * @version          1.2 29 May 2018
 * @author           Barysevich Nikalai
 */


public class MoodSensor {

    public static final String HAPPY = ":)";
    public static final String SAD = ":(";
    public static final String OK = ":|";
    public static final String LOL = ":D";

    public static final int BORDER_FOR_SAD = 25;
    public static final int BORDER_FOR_OK = 50;
    public static final int BORDER_FOR_HAPPY = 75;

    /** Defines mood*/
    public static String getMood() {
        int rand = (int) (Math.random() * 100);

        String result;

        if (rand < BORDER_FOR_SAD) {
            result = SAD;
        } else if (rand < BORDER_FOR_OK) {
            result = OK;
        } else if (rand < BORDER_FOR_HAPPY) {
            result = HAPPY;
        } else {
            result = LOL;
        }

        return result;
    }
}

