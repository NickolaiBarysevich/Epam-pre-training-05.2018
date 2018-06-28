/*
 * @(#)Administrator.java          1.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 18:33
 */

package com.nickshock.task7.buisnesLogicLayer.logic.staff;

import com.nickshock.task7.buisnesLogicLayer.entity.carContainer.AbstractList;
import com.nickshock.task7.buisnesLogicLayer.entity.carContainer.UnlimitedList;
import com.nickshock.task7.buisnesLogicLayer.entity.cars.Car;
import com.nickshock.task7.buisnesLogicLayer.entity.taxiStation.TaxiStation;

/**
 * Class that manages taxi station.
 *
 * @author Barysevich Nikalai
 * @version 1.2 16 June 2018
 */
public class Administrator {

    /**
     * Buys new car for the taxi station.
     *
     * @param station station to be managed.
     * @param car     car to be bought for the station.
     * @return true if car was successfully bought.
     */
    public static boolean buyCar(TaxiStation station, Car car) {

        if (car == null || station == null) {
            return false;
        }

        double stationBudget = station.getBudget();
        double carCost = car.getCost();

        if (stationBudget < carCost) {
            return false;
        }

        station.addCar(car);
        station.setBudget(stationBudget - carCost);
        return true;

    }

    /**
     * Sells a car for the station.
     *
     * @param station station to be managed.
     * @param car     car to be sold.
     * @return true if car was successfully sold.
     */
    public static boolean sellCar(TaxiStation station, Car car) {

        if (car == null || !station.contains(car)) {
            return false;
        }

        station.removeCar(car);

        double sellPrice = car.getCost() * 0.6;
        station.setBudget(station.getBudget() + sellPrice);

        return true;
    }

    /**
     * Calculates the total cost of the station.
     *
     * @param station station to be managed.
     */
    public static double calculateStationCost(TaxiStation station) {
        if (station == null) return -1;
        UnlimitedList<Car> cars = station.getAllCars();

        int carsCost = 0;

        if (cars == null) {
            return carsCost;
        }

        for (int i = 0; i < cars.getSize(); i++) {
            carsCost += cars.getElement(i).getCost();
        }

        return carsCost + station.getBudget();
    }

    /**
     * Represents cars list onto string form.
     *
     * @param station garage of which needs to be represented.
     * @return car list into string form.
     */
    public static String listToString(TaxiStation station) {
        if (station == null) {
            return "null";
        }

        AbstractList list = station.getGarage();

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
