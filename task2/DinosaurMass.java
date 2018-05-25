/*
 * @(#)DinosaurMass.java      1.0 25/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task2;

/**
 * This class is used for calculating dinosaur's mass in milligrams,
 * grams and tons
 *
 * @version          1.0 25 May 2018
 * @author           Barysevich Nikalai
 */

public class DinosaurMass {

    /** Return dinosaur's mass in milligrams*/
    public static int dinosaurMassInMilligrams (int killos) {
        return killos * 1_000_000;
    }

    /** Return dinosaur's mass in grams*/
    public static int dinosaurMassInGrams (int killos) {
        return killos * 1_000;
    }

    /** Return dinosaur's mass in tons*/
    public static double dinosaurMassInTons (int killos) {
        return killos * 0.001;
    }

}
