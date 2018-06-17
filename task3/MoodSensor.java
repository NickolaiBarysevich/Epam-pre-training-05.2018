/*
 * @(#)MoodSensor.java          1.5 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 18:47
 */

package com.nickshock.task3;

import java.util.Random;

/**
 * This class defines user's mood.
 *
 * @author Barysevich Nikalai
 * @version 1.5 16 June 2018
 */
public class MoodSensor {

    public static final String HAPPY = ":)";
    public static final String SAD = ":(";
    public static final String OK = ":|";
    public static final String LOL = ":D";

    public static final int VALUE_FOR_SAD = 0;
    public static final int VALUE_FOR_OK = 1;
    public static final int VALUE_FOR_HAPPY = 2;
    public static final int AMOUNT_OF_MOODS = 4;

    /**
     * Defines mood an returns it into string form.
     *
     * @return mood into string forms.
     */
    public static String getMood() {
        switch (new Random().nextInt(AMOUNT_OF_MOODS)) {
            case VALUE_FOR_SAD: return SAD;
            case VALUE_FOR_OK: return OK;
            case VALUE_FOR_HAPPY: return HAPPY;
            default: return LOL;
        }
    }
}

