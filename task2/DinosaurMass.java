/*
 * @(#)DinosaurMass.java      1.1 26/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task2;

/**
 * This class is used for calculating dinosaur's mass in milligrams,
 * grams and tons
 *
 * @version          1.1 26 May 2018
 * @author           Barysevich Nikalai
 */

public class DinosaurMass {

    public static final int EXP_FOR_MILLIS = 1_000_000;
    public static final int EXP_FOR_GRAMS = 1_000;
    public static final double EXP_FOR_TONS = 0.001;

    /** Return dinosaur's mass in milligrams*/
    public static int toMilligrams (int killos) {
        return killos * EXP_FOR_MILLIS;
    }

    /** Return dinosaur's mass in grams*/
    public static int toGrams (int killos) {
        return killos * EXP_FOR_GRAMS;
    }

    /** Return dinosaur's mass in tons*/
    public static double toTons (int killos) {
        return killos * EXP_FOR_TONS;
    }

}
