/*
 * @(#)Searcher.java          1.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 21.06.18 20:40
 */

package com.nickshock.task9;

import com.nickshock.task7.buisnesLogicLayer.entity.cars.Car;
import com.nickshock.task7.buisnesLogicLayer.entity.cars.Minibus;
import com.nickshock.task7.buisnesLogicLayer.entity.taxiStation.TaxiStation;
import com.nickshock.task7.buisnesLogicLayer.entity.carContainer.UnlimitedList;

/**
 * This class finds car that you need. Like the most expensive or cheapest car.
 *
 * @author Barysevich Nikalai
 * @version 1.0 21 June 2018
 */
public class Searcher {

    /**
     * Finds the most expensive car.
     *
     * @param station station to be managed.
     * @return the most expensive car.
     */
    public static Car findMostExpensiveCar(TaxiStation station) {
        if (station == null) return null;
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
        if (station == null) return null;
        UnlimitedList<Car> cars = station.getAllCars();

        Car cheapest = cars.getElement(0);

        for (int i = 0; i < cars.getSize(); i++) {
            if (cars.getElement(i).getCost() < cheapest.getCost()) {
                cheapest = cars.getElement(i);
            }
        }

        return cheapest;
    }

    /**
     * Finds suitable car for the ride.
     *
     * @param station    station in which car would be searched.
     * @param passengers the amount of passengers to be seated.
     * @return car that is most suitable for the passengers.
     */
    public static Car findSuitableCarForRide(TaxiStation station, int passengers) {
        if (station == null) return null;

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
}
