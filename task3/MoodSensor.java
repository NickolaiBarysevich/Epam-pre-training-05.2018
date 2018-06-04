/*
 * @(#)MoodSensor.java                  1.3 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 05.06.18 0:00
 */

package com.nickshock.task3;

import java.util.Random;

/**
 * This class defines user's mood
 *
 * @author Barysevich Nikalai
 * @version 1.3 4 June 2018
 */


public class MoodSensor {

    public static final String HAPPY = ":)";
    public static final String SAD = ":(";
    public static final String OK = ":|";
    public static final String LOL = ":D";

    public static final int BORDER_FOR_SAD = 25;
    public static final int BORDER_FOR_OK = 50;
    public static final int BORDER_FOR_HAPPY = 75;
    public static final int RANDOM_RANGE = 100;

    /**
     * Defines mood
     */
    public static String getMood() {
        Random rnd = new Random();
        int rand = rnd.nextInt(RANDOM_RANGE + 1);

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

