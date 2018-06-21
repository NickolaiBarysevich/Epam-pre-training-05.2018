/*
 * @(#)Task07.java          1.4 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 21.06.18 20:26
 */

package com.nickshock.task7.controller;

import com.nickshock.task7.buisnesLogicLayer.entity.cars.Car;
import com.nickshock.task7.buisnesLogicLayer.entity.cars.Minibus;
import com.nickshock.task7.buisnesLogicLayer.entity.cars.PassengerCar;
import com.nickshock.task7.buisnesLogicLayer.entity.taxiStation.TaxiStation;
import com.nickshock.task7.buisnesLogicLayer.logic.facilities.Searcher;
import com.nickshock.task7.buisnesLogicLayer.logic.facilities.Sorter;
import com.nickshock.task7.buisnesLogicLayer.logic.staff.Administrator;
import com.nickshock.task7.buisnesLogicLayer.logic.staff.Operator;
import com.nickshock.task7.presentationLayer.ConsolePrinter;
import com.nickshock.task7.util.CarCreator;

import java.util.Random;

/**
 * Class that manages the project.
 *
 * @author Barysevich Nikalai
 * @version 1.4 21 June 2018
 */

public class Task07 {
    /**
     * Runs the program.
     */
    public static void main(String[] args) {
        presentation();
    }

    /**
     * Represents the work of the project.
     */
    public static void presentation() {
        TaxiStation station = new TaxiStation("Diamond", 100000);
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
        Sorter.sortBySits(station);
        carList = Administrator.listToString(station);
        ConsolePrinter.print(carList);

        ConsolePrinter.print("\nStation cost:");
        double cost = Administrator.calculateStationCost(station);
        ConsolePrinter.print(cost);

        ConsolePrinter.print("\nStation budget:");
        double budget = station != null ? station.getBudget() : -1;
        ConsolePrinter.print(budget);

        Administrator.sellCar(station, car);
        ConsolePrinter.print("\nThe car " + car + " was sold.");

        budget = station != null ? station.getBudget() : -1;
        ConsolePrinter.print("Current budget is: " + budget);

        ConsolePrinter.print("\nTaking orders...");

        int acceptedOrders = 0;
        Random rnd = new Random();

        for (int i = 0; i < 15; i++) {
            int passengers = rnd.nextInt(Minibus.MAX_SITS - PassengerCar.MIN_SITS + 1) + PassengerCar.MIN_SITS;
            double order = Operator.takeOrder(station, passengers);

            if (order != -1) {
                acceptedOrders++;
                ConsolePrinter.print("Order with " + passengers
                        + " passengers accepted. Cost for ride: " + order + ".");

            } else {
                ConsolePrinter.print("Order with " + passengers + " passengers declined.");
            }
        }

        ConsolePrinter.print("Accepted orders: " + acceptedOrders);
        ConsolePrinter.print("Cars on calls:");
        ConsolePrinter.print(Operator.getCarsOnCall(station));

        ConsolePrinter.print("\nWaiting cars from calls...");
        if (station != null) station.waitCars();
        ConsolePrinter.print("All cars in garage");

        ConsolePrinter.print("\nBudget before taking orders: " + budget);
        budget = station != null ? station.getBudget() : -1;
        ConsolePrinter.print("\nBudget after orders: " + budget);

    }
}
