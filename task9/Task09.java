/*
 * @(#)Task09.java          1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 25.06.18 21:47
 */

package com.nickshock.task9;

import com.nickshock.task7.buisnesLogicLayer.entity.cars.Car;
import com.nickshock.task7.buisnesLogicLayer.entity.taxiStation.TaxiStation;
import com.nickshock.task7.buisnesLogicLayer.logic.staff.Administrator;
import com.nickshock.task7.presentationLayer.ConsolePrinter;
import com.nickshock.task7.util.CarCreator;


public class Task09 {

    public static void main(String[] args) {
        presentation();
    }

    public static void presentation() {
        TaxiStation station = new TaxiStation("7788", 100000);
        ConsolePrinter.print("New station was created");
        ConsolePrinter.print(station);
        ConsolePrinter.print("");

        ConsolePrinter.print("Buying cars for station...");
        for (int i = 0; i < 15; i++) {
            Car car = CarCreator.getRandomCar();
            Administrator.buyCar(station, car);
        }

        ConsolePrinter.print("\nBought cars:");
        String carList = Administrator.listToString(station);
        ConsolePrinter.print(carList);

        ConsolePrinter.print("\nMost expensive car:");
        Car car = Searcher.findMostExpensiveCar(station);
        ConsolePrinter.print(car);

        ConsolePrinter.print("\nThe cheapest car:");
        car = Searcher.findCheapestCar(station);
        ConsolePrinter.print(car);

        ConsolePrinter.print("\nSorted cars by cost in ascending order");
        Sorter.sortByCostAscending(station);
        carList = Administrator.listToString(station);
        ConsolePrinter.print(carList);

        ConsolePrinter.print("\nSorted cars by cost in descending order");
        Sorter.sortByCostDescending(station);
        carList = Administrator.listToString(station);
        ConsolePrinter.print(carList);

        ConsolePrinter.print("\nSorted cars by sits in descending order");
        Sorter.sortBySitsDescending(station);
        carList = Administrator.listToString(station);
        ConsolePrinter.print(carList);

        ConsolePrinter.print("\nSorted cars by sits in Ascending order");
        Sorter.sortBySitsAscending(station);
        carList = Administrator.listToString(station);
        ConsolePrinter.print(carList);

        ConsolePrinter.print("\nSorted cars by brand in Ascending order");
        Sorter.sortByBrand(station);
        carList = Administrator.listToString(station);
        ConsolePrinter.print(carList);

    }
}
