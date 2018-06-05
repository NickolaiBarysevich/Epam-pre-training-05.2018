/*
 * @(#)ArrayTooSmallLengthException.java          1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 05.06.18 22:22
 */

package com.nickshock.task5;

/**
 * Thrown if array length too small for needed operation
 *
 * @author Barysevich Nikalai
 * @version 1.1 5 June 2018
 */

public class ArrayTooSmallLengthException extends RuntimeException {

    /**
     * Constructs a {@code ArrayTooSmallLengthException} with no detail message.
     */
    public ArrayTooSmallLengthException() {
    }

    /**
     * Constructs a {@code ArrayTooSmallLengthException} with the specified
     * detail message.
     *
     * @param message the detail message.
     */
    public ArrayTooSmallLengthException(String message) {
        super(message);
    }
}
