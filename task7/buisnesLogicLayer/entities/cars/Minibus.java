/*
 * @(#)Minibus.java          1.2 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 15:54
 */

package com.nickshock.task7.buisnesLogicLayer.entities.cars;

/**
 * Entity class that presents a minibus.
 *
 * @author Barysevich Nikalai
 * @version 1.2 16 June 2018
 */

public class Minibus extends Car {

    public static final int MIN_SITS = 6;
    public static final int MAX_SITS = 18;

    /** Sets default value of sits for any minibus.*/
    {
        sits = MIN_SITS;
    }

    public Minibus(double cost, String carBrand, String model) {
        super(cost, carBrand, model);
    }

    public Minibus(Car minibus) {
        super(minibus);
    }

    @Override
    public void setSits(int sits) {
        if (sits < MIN_SITS) {
            throw new IllegalArgumentException("sits < " + MIN_SITS);
        }

        if (sits > MAX_SITS) {
            throw new IllegalArgumentException("sits > " + MAX_SITS);
        }
        super.setSits(sits);
    }


}
