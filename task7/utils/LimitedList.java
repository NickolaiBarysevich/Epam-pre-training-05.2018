/*
 * @(#)LimitedList.java          1.8 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 18:09
 */

package com.nickshock.task7.utils;


import java.util.Arrays;

/**
 * Container class which allows to add as much elements as it was indicated.
 *
 * @param <Type> the type of elements in this list.
 * @author Barysevich Nikalai
 * @version 1.8 16 June 2018
 */

public class LimitedList<Type> implements ListBehavior<Type> {

    protected static final int DEFAULT_CAPACITY = 10;

    protected int size;

    /**
     * Array of objects which contains added elements.
     */
    protected Object[] value;

    /**
     * Constructs an initialises limited list with default capacity.
     */
    public LimitedList() {
        value = new Object[DEFAULT_CAPACITY];
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
     * Constructs an initialises limited list with characteristics of gotten list.
     *
     * @param limitedList list to be copied.
     */
    public LimitedList(LimitedList<Type> limitedList) {
        value = limitedList.value;
        size = limitedList.size;
    }

    /**
     * Checks whether the gotten index satisfies the bound of this list.
     *
     * @param index index to be checked.
     * @throws IndexOutOfBoundsException if {@code index > size}.
     */
    private void rangeCheck(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException("index > size");
        }
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

    /**
     * Returns the amount of elements in the container.
     *
     * @return the amount of elements in the container.
     */
    public int getSize() {
        return size;
    }

    /**
     * Checks whether the container is empty.
     *
     * @return true if container if empty.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Return the element of the container by the index.
     *
     * @param index the index of the element to be returned.
     * @return element with the index.
     */
    @SuppressWarnings("unchecked")
    public Type getElement(int index) {
        rangeCheck(index);
        return (Type) value[index];
    }

    /**
     * Removes the element from container by the index.
     *
     * @param index the index of the element to be removed.
     * @return true if element was removed.
     */
    public boolean removeElement(int index) {
        rangeCheck(index);

        int shift = size - index - 1;

        if (shift > 0) {
            System.arraycopy(value, index + 1, value, index, shift);
        }

        value[--size] = null;
        return true;
    }

    /**
     * Removes the element from container.
     *
     * @param element to be removed.
     * @return true if element was removed.
     */
    public boolean removeElement(Type element) {
        if (element == null || !contains(element)) {
            return false;
        }

        int index = indexOf(element);

        if (index == -1) {
            return false;
        }

        int shift = size - index - 1;

        if (shift > 0) {
            System.arraycopy(value, index + 1, value, index, shift);
        }

        value[--size] = null;
        return true;
    }

    /**
     * Finds the index of the gotten element.
     *
     * @param element element to be checked.
     * @return the index of the gotten element.
     */
    public int indexOf(Type element) {
        if (element == null || !contains(element)) {
            return -1;
        }

        for (int i = 0; i < getSize(); i++) {
            if (value[i] == element) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Removes all elements from the container.
     */
    public void clear() {
        if (isEmpty()) return;

        for (int i = 0; i < size; i++) {
            value[i] = null;
        }

        size = 0;
    }

    /**
     * Returns true if container contains the element.
     *
     * @param element element to be checked.
     * @return true if container contains the element.
     */
    public boolean contains(Type element) {
        if (isEmpty()) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (value[i] == element) {
                return true;
            }
        }

        return false;
    }

    /**
     * Returns true if container contains all the elements.
     *
     * @param elements elements to be checked.
     * @return true if container contains the elements.
     */
    public boolean contains(Type... elements) {

        if (isEmpty() || size < elements.length) {
            return false;
        }

        for (Type elem : elements) {
            if (!contains(elem)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        LimitedList<Type> sl = (LimitedList<Type>) obj;

        return size == sl.size
                && value.length == sl.value.length
                && Arrays.equals(value, sl.value);
    }


    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + Arrays.hashCode(value);
        return result;
    }
}
