/*
 * @(#)UnlimitedList.java          1.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 19.06.18 0:46
 */

package com.nickshock.task7.buisnesLogicLayer.logic.storage;

import java.util.Arrays;

/**
 * Container class which allows to add as much elements as needed.
 *
 * @param <Type> the type of elements in this list.
 * @author Barysevich Nikalai
 * @version 1.4 18 June 2018
 */
public class UnlimitedList<Type> extends AbstractList<Type> {

    /**
     * Constructs an initialises limited list with default capacity.
     */
    public UnlimitedList() {
    }

    /**
     * Constructs an initialises limited list with characteristics of gotten list.
     *
     * @param abstractList list to be copied.
     */
    public UnlimitedList(AbstractList<Type> abstractList) {
        super(abstractList);
    }

    /**
     * Extends the capacity of the value array.
     */
    private void grow() {
        int oldCapacity = value.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        value = Arrays.copyOf(value, newCapacity);
    }

    /**
     * Adds an element to the list.
     *
     * @param element element to be added.
     * @return true if element was added.
     */
    @Override
    public boolean add(Type element) {
        if (size >= value.length) {
            grow();
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
        for (Type elem : elements) {
            add(elem);
        }

        return true;
    }

    /**
     * Adds all elements ot the gotten list to this list.
     *
     * @param list list to be added to this list.
     * @return true if elements was added.
     */
    public boolean add(ListBehavior<Type> list) {
        for (int i = 0; i < list.getSize(); i++) {
            add(list.getElement(i));
        }

        return true;
    }

}
