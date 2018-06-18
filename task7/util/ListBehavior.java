/*
 * @(#)ListBehavior.java          1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 16.06.18 17:52
 */

package com.nickshock.task7.util;

/**
 * Util interface that contains methods that needs to be implemented in containers.
 *
 * @author Barysevich Nikalai
 * @version 1.1 16 June 2018
 */

public interface ListBehavior<Type> {

    /**
     * Adds an element into container.
     *
     * @param element element to be added.
     * @return true if element was added.
     */
    boolean add(Type element);

    /**
     * Adds any amount of elements into container.
     *
     * @param elements elements to be added.
     * @return true if elements was added.
     */
    boolean add(Type... elements);

    /**
     * Returns the amount of elements in the container.
     *
     * @return the amount of elements in the container.
     */
    int getSize();

    /**
     * Checks whether the container is empty.
     *
     * @return true if container if empty.
     */
    boolean isEmpty();

    /**
     * Return the element of the container by the index.
     *
     * @param index the index of the element to be returned.
     * @return element with the index.
     */
    Type getElement(int index);

    /**
     * Removes the element from container by the index.
     *
     * @param index the index of the element to be removed.
     * @return true if element was removed.
     */
    boolean removeElement(int index);

    /**
     * Removes all elements from the container.
     */
    void clear();

    /**
     * Returns true if container contains the element.
     *
     * @param element element to be checked.
     * @return true if container contains the element.
     */
    boolean contains(Type element);

    /**
     * Returns true if container contains all the elements.
     *
     * @param elements elements to be checked.
     * @return true if container contains the elements.
     */
    boolean contains(Type... elements);

    boolean equals(Object obj);

    int hashCode();

}
