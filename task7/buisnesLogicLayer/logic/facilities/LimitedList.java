/*
 * @(#)LimitedList.java          1.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 19.06.18 0:46
 */

package com.nickshock.task7.buisnesLogicLayer.logic.facilities;


/**
 * Container class which allows to add as much elements as it was indicated.
 *
 * @param <Type> the type of elements in this list.
 * @author Barysevich Nikalai
 * @version 1.9 18 June 2018
 */

public class LimitedList<Type> extends AbstractList<Type> {

    /**
     * Constructs an initialises limited list with default capacity.
     */
    public LimitedList() {
    }

    /**
     * Constructs an initialises limited list with characteristics of gotten list.
     *
     * @param abstractList list to be copied.
     */
    public LimitedList(AbstractList<Type> abstractList) {
        super(abstractList);
    }

    /**
     * Constructs an initialises limited list with any capacity.
     *
     * @param Capacity capacity of this limited list.
     */
    public LimitedList(int Capacity) {
        value = new Object[Capacity];
    }

    /**
     * Adds an element to the list.
     *
     * @param element element to be added.
     * @return true if element was added.
     */
    public boolean add(Type element) {
        if (size == value.length) {
            return false;
        }
        value[size++] = element;
        return true;
    }

    /**
     * Adds elements to the list.
     *
     * @param elements elements to be added.
     * @return true if elements was added.
     */
    public boolean add(Type... elements) {
        if (size == value.length || size + elements.length >= value.length) {
            return false;
        }

        for (Type elem : elements) {
            value[size++] = elem;
        }
        return true;
    }

    /**
     * Returns the capacity of this list.
     *
     * @return the capacity of this list.
     */
    public int getCapacity() {
        return value.length;
    }
}
