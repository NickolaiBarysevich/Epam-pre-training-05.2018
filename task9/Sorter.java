/*
 * @(#)Sorter.java          1.3 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 25.06.18 21:47
 */

package com.nickshock.task9;

import com.nickshock.task7.buisnesLogicLayer.entity.cars.Car;
import com.nickshock.task7.buisnesLogicLayer.entity.taxiStation.TaxiStation;
import com.nickshock.task7.buisnesLogicLayer.entity.carContainer.AbstractList;
import com.nickshock.task7.buisnesLogicLayer.entity.carContainer.UnlimitedList;


/**
 * This class sorts cars list by it's cost or amount of sits.
 *
 * @author Barysevich Nikalai
 * @version 1.3 25 June 2018
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
    public static void sortBySitsDescending(TaxiStation station) {
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
            if (index == i) break;
            Car temp = cars.getElement(i);
            cars.set(i, cars.getElement(index));
            cars.set(index, temp);
        }

    }

    /**
     * Sorts the cars in the garage in taxi station by it's sits in ascending order.
     * Uses quick sort.
     *
     * @param station the station in which cars need to be sorted.
     */
    public static void sortBySitsAscending(TaxiStation station) {
        if (station == null) return;

        AbstractList<Car> cars = station.getGarage();
        sortSits(cars, 0, cars.getSize() - 1);

    }

    private static void sortSits(AbstractList<Car> cars, int left, int right) {
        if (left >= right) return;

        int i = left, j = right;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (cars.getElement(i).getSits() <= cars.getElement(cur).getSits() && i < cur) {
                i++;
            }
            while (cars.getElement(cur).getSits() <= cars.getElement(j).getSits() && j > cur) {
                j--;
            }
            if (i < j) {
                Car temp = cars.getElement(i);
                cars.set(i, cars.getElement(j));
                cars.set(j, temp);
                if (i == cur) {
                    cur = j;
                } else if (j == cur) {
                    cur = i;
                }
            }
        }
        sortSits(cars, left, cur);
        sortSits(cars, cur + 1, right);
    }

    /**
     * Sorts the cars in the garage in taxi station by it's brands in ascending order.
     * Uses merge sort.
     *
     * @param station the station in which cars need to be sorted.
     */
    public static void sortByBrand(TaxiStation station) {
        if (station == null) return;

        UnlimitedList<Car> list = station.getGarage();
        AbstractList<Car> temp = mergeBrands(list);
        list.clear();
        list.add(temp);
    }

    private static AbstractList<Car> mergeBrands(AbstractList<Car> cars) {
        int length = cars.getSize();
        if (length < 2) return cars;
        int mid = length / 2;
        return sort(mergeBrands(cutList(cars, 0, mid)),
                mergeBrands(cutList(cars, mid, length)));
    }

    private static AbstractList<Car> cutList(AbstractList<Car> list, int start, int end) {
        AbstractList<Car> newList = new UnlimitedList<>();
        for (int i = start; i < end; i++) {
            newList.add(list.getElement(i));
        }
        return newList;
    }

    private static AbstractList<Car> sort(AbstractList<Car> cars1, AbstractList<Car> cars2) {
        int length1 = cars1.getSize(), length2 = cars2.getSize();
        int a = 0, b = 0, length = length1 + length2;
        UnlimitedList<Car> result = new UnlimitedList<>() ;
        for (int i = 0; i < length; i++) {
            if (b < length2 && a < length1) {
                if (cars1.getElement(a).getCarBrand().compareTo(cars2.getElement(b).getCarBrand()) > -1 ) {
                    result.add(cars2.getElement(b++));
                } else result.add(cars1.getElement(a++));
            } else if (b < length2) {
                result.add(cars2.getElement(b++));
            } else {
                result.add(cars1.getElement(a++));
            }
        }
        return result;
    }
}
