/*
 * @(#)PassengerCar.java          1.2 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 20.06.18 12:49
 */

package com.nickshock.task7.buisnesLogicLayer.entity.cars;

/**
 * Entity class that presents a passenger car.
 *
 * @author Barysevich Nikalai
 * @version 1.2 10 June 2018
 */

public class PassengerCar extends Car {

    public static final int MAX_SITS = 5;

    public PassengerCar() {
    }

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
