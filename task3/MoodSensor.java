/*
 * @(#)MoodSensor.java           1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 27.05.18 23:30
 */

package com.nickshock.task3;

/**
 * This class defines user's mood
 *
 * @version          1.1 27 May 2018
 * @author           Barysevich Nikalai
 */


public class MoodSensor {

    public static final String HAPPY = ":)";
    public static final String SAD = ":(";
    public static final String OK = ":|";
    public static final String LOL = ":D";

    /** Defines mood*/
    public static String getMood() {
        int rand = (int) (Math.random() * 100);

        String result;

        if (rand < 25) {
            result = SAD;
        } else if (rand < 50) {
            result = OK;
        } else if (rand < 75) {
            result = HAPPY;
        } else {
            result = LOL;
        }

        return result;
    }
}
