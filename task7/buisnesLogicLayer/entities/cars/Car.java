/*
 * @(#)Car.java          1.4 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 15:50
 */

package com.nickshock.task7.buisnesLogicLayer.entities.cars;

/**
 * Entity class that presents a car with minimum characteristics.
 *
 * @author Barysevich Nikalai
 * @version 1.4 16 June 2018
 */

public class Car {

    public static final int MIN_SITS = 2;

    protected int sits; /* Amount of sits in the car*/
    protected double cost;
    protected String carBrand;
    protected String model;

    /** Sets default value of sits for any car.*/
    {
        sits = 4;
    }

    /**
     * Constructs and initializes a car with specified cost, brand and model.
     *
     * @param cost     car's cost.
     * @param carBrand car's brand.
     * @param model    car's model.
     */
    public Car(double cost, String carBrand, String model) {
        this.cost = cost;
        this.carBrand = carBrand;
        this.model = model;
    }

    /**
     * Constructs and initializes a car with the same characteristics as the received car.
     *
     * @param car a car to be copied.
     */
    public Car(Car car) {
        sits = car.sits;
        cost = car.cost;
        carBrand = car.carBrand;
        model = car.model;
    }

    public int getSits() {
        return sits;
    }

    public double getCost() {
        return cost;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getModel() {
        return model;
    }

    /**
     * Set sits of the car.
     *
     * @param sits sits to be set.
     * @throws IllegalArgumentException if {@code sits < MIN_SITS}
     */
    public void setSits(int sits) {
        if (sits < MIN_SITS) {
            throw new IllegalArgumentException("sits < " + MIN_SITS);
        }
        this.sits = sits;
    }

    /**
     * Set cost of the car.
     *
     * @param cost cost to be set.
     * @throws IllegalArgumentException if {@code cost < 0}
     */
    public void setCost(double cost) {
        if (cost < 0) {
            throw new IllegalArgumentException("cost < 0");
        }
        this.cost = cost;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car that = (Car) o;

        if (sits != that.sits) return false;
        if (Double.compare(that.cost, cost) != 0) return false;
        if (carBrand != null ? !carBrand.equals(that.carBrand) : that.carBrand != null) return false;
        return model != null ? model.equals(that.model) : that.model == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = sits;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (carBrand != null ? carBrand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + carBrand + ", "
                + model + " (sits: " + sits + ", cost: " + cost + ")";
    }


}
