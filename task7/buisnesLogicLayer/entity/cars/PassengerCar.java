/*
 * @(#)PassengerCar.java          1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 1:31
 */

package com.nickshock.task7.buisnesLogicLayer.entity.cars;

/**
 * Entity class that presents a passenger car.
 *
 * @author Barysevich Nikalai
 * @version 1.1 16 June 2018
 */

public class PassengerCar extends Car {

    public static final int MAX_SITS = 5;

    public PassengerCar(double cost, String carBrand, String model) {
        super(cost, carBrand, model);
    }

    public PassengerCar(Car passengerCar) {
        super(passengerCar);
    }

    @Override
    public void setSits(int sits) {
        if (sits > MAX_SITS) {
            throw new IllegalArgumentException("sits > " + MAX_SITS);
        }
        super.setSits(sits);
    }
}
