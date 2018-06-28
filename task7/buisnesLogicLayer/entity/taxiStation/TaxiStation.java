/*
 * @(#)TaxiStation.java          1.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 16:28
 */

package com.nickshock.task7.buisnesLogicLayer.entity.taxiStation;


import com.nickshock.task10.pl.ConsolePrinter;
import com.nickshock.task7.buisnesLogicLayer.entity.carContainer.UnlimitedList;
import com.nickshock.task7.buisnesLogicLayer.entity.cars.*;

import java.util.Objects;

/**
 * Entity class that presents a taxi station.
 *
 * @author Barysevich Nikalai
 * @version 1.7 16 June 2018
 */
public class TaxiStation {

    private static final int RIDE_TIME_IN_MILLIS = 60_000;

    private double budget;
    private String name;

    /**
     * List that contains cars that is not busy and just is in the garage.
     */
    private UnlimitedList<Car> garage;

    /**
     * Contains cars that on a call at the moment.
     */
    private UnlimitedList<Car> onCall;

    /**
     * Contains threads that waiting while the order is performed.
     */
    private UnlimitedList<Thread> orders;

    /**
     * Initializes lists.
     */
    {
        garage = new UnlimitedList<>();
        onCall = new UnlimitedList<>();
        orders = new UnlimitedList<>();
    }

    /**
     * Constructs and initializes taxi station with name and budget.
     *
     * @param name name to be set as station's name.
     * @param budget budget to be set as station's budget.
     */
    public TaxiStation(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void addCar(Car car) {
        garage.add(car);
    }

    public void removeCar(Car car) {
        garage.removeElement(car);
    }

    /**
     * Sends car on a call.
     * It mean that car removes from "garage" and add to "onCall". Also creates a new thread that waits
     * car from a call. When car returns it is removes from "onCall" and add to "garage".
     */
    public void sendCarOnCall(Car car) {

        garage.removeElement(car);
        onCall.add(car);

        Thread call = new Thread(() -> {
            try {
                Thread.sleep(RIDE_TIME_IN_MILLIS);
            } catch (InterruptedException e) {
                ConsolePrinter.print("Some unknown situation happened during the ride.");
            }
            onCall.removeElement(car);
            garage.add(car);
        });

        trimCalls();
        call.start();
        orders.add(call);

    }

    /**
     * Searches "dead" threads in orders and removes them.
     */
    private void trimCalls() {
        for (int i = 0; i < orders.getSize(); i++) {
            Thread cal = orders.getElement(i);
            if (!cal.isAlive()) {
                orders.removeElement(cal);
            }
        }
    }

    public boolean contains(Car car) {
        return garage.contains(car);
    }

    public int getStationCapaсity() {
        return garage.getSize() + onCall.getSize();
    }

    public UnlimitedList<Car> getGarage() {
        return garage;
    }

    public UnlimitedList<Car> getOnCall() {
        return onCall;
    }

    public UnlimitedList<Car> getAllCars() {
        if (garage == null) return null;
        UnlimitedList<Car> cars = new UnlimitedList<>(garage);
        cars.add(onCall);

        return cars;
    }

    /**
     * Waits while all threads end it performance.
     */
    public void waitCars() {
        trimCalls();

        try {
            for (int i = 0; i < orders.getSize(); i++) {
                orders.getElement(i).join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxiStation that = (TaxiStation) o;
        return Double.compare(that.budget, budget) == 0 &&
                Objects.equals(garage, that.garage) &&
                Objects.equals(onCall, that.onCall) &&
                Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(garage, onCall, orders, budget);
    }

    @Override
    public String toString() {
        return "TaxiStation{" +
                "name = '" + name + '\'' +
                ", budget = " + budget +
                ", carsInGarage = " + garage.getSize() +
                ", carsOnCall = " + onCall.getSize() +
                '}';
    }

    @Override
    protected void finalize() {
        waitCars();
    }
}

