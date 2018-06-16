/*
 * @(#)Administrator.java          1.2 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 1:34
 */

package com.nickshock.task7.buisnesLogicLayer.logic;

import com.nickshock.task7.utils.UnlimitedList;
import com.nickshock.task7.buisnesLogicLayer.entities.cars.Car;
import com.nickshock.task7.buisnesLogicLayer.entities.taxiStation.TaxiStation;

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

        if (car == null) {
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
     * Finds the most expensive car.
     *
     * @param station station to be managed.
     * @return the most expensive car.
     */
    public static Car findMostExpensiveCar(TaxiStation station) {
        UnlimitedList<Car> cars = station.getAllCars();

        Car mostExpensive = cars.getElement(0);

        for (int i = 0; i < cars.getSize(); i++) {
            if (cars.getElement(i).getCost() > mostExpensive.getCost()) {
                mostExpensive = cars.getElement(i);
            }
        }

        return mostExpensive;
    }

    /**
     * Finds the cheapest car.
     *
     * @param station station to be managed.
     * @return the cheapest car.
     */
    public static Car findCheapestCar(TaxiStation station) {
        UnlimitedList<Car> cars = station.getAllCars();

        Car cheapest = cars.getElement(0);

        for (int i = 0; i < cars.getSize(); i++) {
            if (cars.getElement(i).getCost() < cheapest.getCost()) {
                cheapest = cars.getElement(i);
            }
        }

        return cheapest;
    }

}
