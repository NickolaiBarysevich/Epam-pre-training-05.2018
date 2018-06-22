/*
 * @(#)Sorter.java          1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 21.06.18 20:40
 */

package com.nickshock.task9;

import com.nickshock.task7.buisnesLogicLayer.entity.cars.Car;
import com.nickshock.task7.buisnesLogicLayer.entity.taxiStation.TaxiStation;
import com.nickshock.task7.buisnesLogicLayer.logic.facilities.AbstractList;

/**
 * This class sorts cars list by it's cost or amount of sits.
 *
 * @author Barysevich Nikalai
 * @version 1.1 21 June 2018
 */
public class Sorter {

    /**
     * Sorts the cars in the garage in taxi station by it's cost in descending order.
     * Uses bubble sort.
     *
     * @param station the station in which cars need to be sorted.
     */
    public static void sortByCostDescending(TaxiStation station) {
        if (station == null) return;

        AbstractList<Car> cars = station.getGarage();
        int length = cars.getSize() - 1;

        for (int i = 0; i < length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < cars.getSize(); j++) {
                if (cars.getElement(j).getCost() > cars.getElement(i).getCost()) {
                    Car temp = cars.getElement(i);
                    cars.set(i, station.getGarage().getElement(j));
                    cars.set(j, temp);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    /**
     * Sorts the cars in the garage in taxi station by it's cost in ascending order.
     * Uses insertion sort.
     *
     * @param station the station in which cars need to be sorted.
     */
    public static void sortByCostAscending(TaxiStation station) {
        if (station == null) return;

        AbstractList<Car> cars = station.getGarage();
        int length = cars.getSize() - 1;

        for (int i = 0; i < length; i++) {
            if (cars.getElement(i + 1).getCost() < cars.getElement(i).getCost()) {
                Car temp = cars.getElement(i + 1);
                cars.set(i + 1, cars.getElement(i));
                int j = i;
                while (j > 0 && temp.getCost() < cars.getElement(j - 1).getCost()) {
                    cars.set(j, cars.getElement(j - 1));
                    j--;
                }
                cars.set(j, temp);
            }
        }
    }

    /**
     * Sorts the cars in the garage in taxi station by it's sits in descending order.
     * Uses selection sort.
     *
     * @param station the station in which cars need to be sorted.
     */
    public static void sortBySits(TaxiStation station) {
        if (station == null) return;

        AbstractList<Car> cars = station.getGarage();
        int length = cars.getSize() - 1;

        for (int i = 0; i < length; i++) {
            int index = i;
            for (int j = i + 1; j < cars.getSize(); j++) {
                if (cars.getElement(j).getSits() > cars.getElement(index).getSits()) {
                    index = j;
                }
            }
            Car temp = cars.getElement(i);
            cars.set(i, cars.getElement(index));
            cars.set(index, temp);
        }

    }

}
