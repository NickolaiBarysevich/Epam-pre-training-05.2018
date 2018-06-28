/*
 * @(#)Operator.java          1.4 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 21.06.18 17:32
 */

package com.nickshock.task7.buisnesLogicLayer.logic.staff;

import com.nickshock.task7.buisnesLogicLayer.entity.carContainer.AbstractList;
import com.nickshock.task9.Searcher;
import com.nickshock.task7.buisnesLogicLayer.entity.cars.Car;
import com.nickshock.task7.buisnesLogicLayer.entity.taxiStation.TaxiStation;

/**
 * Class that answers calls and finds suitable car for the order.
 *
 * @author Barysevich Nikalai
 * @version 1.4 21 June 2018
 */
public class Operator {

    public static final double COST_FOR_RIDE_PER_PERSON = 100;

    /**
     * Takes an order.
     *
     * @param station    station that would give a car.
     * @param passengers amount of passengers for the ride.
     * @return the cost for ride, if there is no suitable car return -1.
     */
    public static double takeOrder(TaxiStation station, int passengers) {

        if (station == null || station.getGarage().isEmpty() || passengers < 1) {
            return -1;
        }

        Car car = Searcher.findSuitableCarForRide(station, passengers);
        if (car == null) {
            return -1;
        }

        station.sendCarOnCall(car);
        station.setBudget(station.getBudget() + passengers * COST_FOR_RIDE_PER_PERSON);
        return passengers * COST_FOR_RIDE_PER_PERSON;
    }



    /**
     * Presents list of cars on call in string form.
     *
     * @param station station to be checked.
     * @return string form of cars list.
     */
    public static String getCarsOnCall(TaxiStation station) {
        if (station == null) {
            return "null";
        }

        AbstractList list = station.getOnCall();

        if (list.isEmpty()) {
            return "empty";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("{\n");
        for (int i = 0; i < list.getSize(); i++) {
            builder.append(list.getElement(i));
            builder.append("\n");
        }
        builder.append("}");

        return builder.toString();
    }

}
