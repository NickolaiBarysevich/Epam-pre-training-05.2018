/*
 * @(#)MoodSensor.java          1.6 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 19.06.18 1:01
 */

package com.nickshock.task3;

import java.util.Random;

/**
 * This class defines user's mood.
 *
 * @author Barysevich Nikalai
 * @version 1.6 19 June 2018
 */
public class MoodSensor {

    public static final String[] MOODS = {":)", ":(", ":|", ":D"};

    /**
     * Defines mood an returns it into string form.
     *
     * @return mood into string forms.
     */
    public static String getMood() {
        return MOODS[new Random().nextInt(MOODS.length)];
    }
}

