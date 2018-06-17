/*
 * @(#)CarCreator.java          1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 17:42
 */

package com.nickshock.task7.utils;

import com.nickshock.task7.buisnesLogicLayer.entities.cars.*;

import java.util.Random;

/**
 * Util class that creates car with random parameters.
 *
 * @author Barysevich Nikalai
 * @version 1.1 16 June 2018
 */
public class CarCreator {

    public static final String[] CAR_BRANDS = {"BMV", "OPEL", "AUDI", "HONDA", "MAZDA", "CITROEN", "MERCEDES-BENZ",
                                                "VOLVO", "MITSUBISHI", "TOYOTA", "RENO"};
    private static final String LETTERS_FOR_MODEL = "ABCDEFGHIJKLMNOPUVWXYZ";

    public static final int MIN_COST_FOR_PASS_CAR = 4000;
    public static final int MAX_COST_FOR_PASS_CAR = 7000;
    public static final int MIN_COST_FOR_MINIBUS = 6000;
    public static final int MAX_COST_FOR_MINIBUS = 10000;

    /**
     * Creates a car with random parameters.
     *
     * @param minCost min bound for car cost.
     * @param maxCost max bound for car cost.
     * @return new car.
     */
    public static Car createCar(int minCost, int maxCost) {
        Random rnd = new Random();

        double cost = rnd.nextInt(maxCost - minCost + 1) + minCost;
        String carBrand = CAR_BRANDS[rnd.nextInt(CAR_BRANDS.length)];
        String model = LETTERS_FOR_MODEL.charAt(rnd.nextInt(LETTERS_FOR_MODEL.length()))
                + "-" + Integer.toString(rnd.nextInt(1000));

        return new Car(cost, carBrand, model);
    }

    /**
     * Creates a passenger car with random parameters.
     *
     * @return new passenger car.
     */
    public static PassengerCar createPassengerCar() {
        return new PassengerCar(createCar(MIN_COST_FOR_PASS_CAR, MAX_COST_FOR_PASS_CAR));
    }

    /**
     * Creates a minibus with random parameters.
     *
     * @return new minibus.
     */
    public static Minibus createMinibus() {
        Random rnd = new Random();

        int sits = rnd.nextInt(Minibus.MAX_SITS - Minibus.MIN_SITS + 1) + Minibus.MIN_SITS;
        Minibus Minibus = new Minibus(createCar(MIN_COST_FOR_MINIBUS, MAX_COST_FOR_MINIBUS));
        Minibus.setSits(sits);

        return Minibus;
    }




}
