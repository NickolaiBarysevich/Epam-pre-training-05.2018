/*
 * @(#)Operator.java          1.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 18:34
 */

package com.nickshock.task7.buisnesLogicLayer.logic.staff;

import com.nickshock.task7.util.UnlimitedList;
import com.nickshock.task7.util.ListHelper;
import com.nickshock.task7.buisnesLogicLayer.entity.cars.Car;
import com.nickshock.task7.buisnesLogicLayer.entity.cars.Minibus;
import com.nickshock.task7.buisnesLogicLayer.entity.taxiStation.TaxiStation;

/**
 * Class that answers calls and finds suitable car for the order.
 *
 * @author Barysevich Nikalai
 * @version 1.3 16 June 2018
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

        if (station.getGarage().isEmpty() || passengers < 1) {
            return -1;
        }

        Car car = findCar(station, passengers);
        if (car == null) {
            return -1;
        }

        station.sendCarOnCall(car);
        station.setBudget(station.getBudget() + passengers * COST_FOR_RIDE_PER_PERSON);
        return passengers * COST_FOR_RIDE_PER_PERSON;
    }

    /**
     * Finds suitable car for the ride.
     *
     * @param station    station in which car would be searched.
     * @param passengers the amount of passengers to be seated.
     * @return car that is most suitable for the passengers.
     */
    private static Car findCar(TaxiStation station, int passengers) {

        UnlimitedList<Car> garage = station.getGarage();
        Car suitableCar = null;
        int sitForDriver = 1;

        for (int i = 0; i < garage.getSize(); i++) {
            Car car = garage.getElement(i);
            if (car.getSits() - sitForDriver >= passengers && car.getSits() < Minibus.MAX_SITS) {
                suitableCar = car;
                break;
            }
        }

        if (suitableCar != null) {
            for (int i = 0; i < garage.getSize(); i++) {
                Car car = garage.getElement(i);
                if (car.getSits() - sitForDriver >= passengers && car.getSits() < suitableCar.getSits()) {
                    suitableCar = car;
                }
            }
        }

        return suitableCar;
    }

    /**
     * Presents list of cars on call in string form.
     *
     * @param station station to be checked.
     * @return string form of cars list.
     */
    public static String getCarsOnCall(TaxiStation station) {
        return ListHelper.listToString(station.getOnCall());
    }

}
