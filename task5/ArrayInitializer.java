/*
 * @(#)ArrayInitializer.java          1.3 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 05.06.18 22:22
 */

package com.nickshock.task5;

import java.util.Random;

/**
 * This class need to fill array with random numbers
 *
 * @author Barysevich Nikalai
 * @version 1.3 5 June 2018
 */

public class ArrayInitializer {

    public static final int MIN_LENGTH = 1;

    public static final String OUT_OF_BOUNDS_ERROR = "out of type range bounds";

    /**
     * <p>Initialize the array with random byte values</p>
     *
     * @param array the array to be initialized
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static void initRandom(byte[] array) {
        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(ArrayOperations.LENGTH_ERROR + MIN_LENGTH);
        }

        Random rnd = new Random();
        rnd.nextBytes(array);
    }

    /**
     * <p>Initialize the array with random short values</p>
     *
     * @param array    the array to be initialized
     * @param maxBound maximum value
     * @param minBound minimum value
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     * @throws IllegalArgumentException     if {@code maxBound > Short.MAX_VALUE}
     *                                      or {@code minBound < Short.MAX_VALUE}
     */
    public static void initRandom(short[] array, int maxBound, int minBound) {
        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(ArrayOperations.LENGTH_ERROR + MIN_LENGTH);
        }

        if (maxBound > Short.MAX_VALUE || minBound < Short.MAX_VALUE) {
            throw new IllegalArgumentException(OUT_OF_BOUNDS_ERROR);
        }

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = (short) (rnd.nextInt(maxBound - minBound + 1) + minBound);
        }
    }

    /**
     * <p>Initialize the array with random int values</p>
     *
     * @param array    the array to be initialized
     * @param maxBound maximum value
     * @param minBound minimum value
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static void initRandom(int[] array, int maxBound, int minBound) {
        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(ArrayOperations.LENGTH_ERROR + MIN_LENGTH);
        }

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(maxBound - minBound + 1) + minBound;
        }
    }

    /**
     * <p>Initialize the array with random char values</p>
     *
     * @param array    the array to be initialized
     * @param maxBound maximum values
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     * @throws IllegalArgumentException     if {@code maxBound > Short.MAX_VALUE}
     *                                      or {@code minBound < Short.MAX_VALUE}
     */
    public static void initRandom(char[] array, int maxBound) {
        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(ArrayOperations.LENGTH_ERROR + MIN_LENGTH);
        }

        if (maxBound > Character.MAX_VALUE) {
            throw new IllegalArgumentException(OUT_OF_BOUNDS_ERROR);
        }

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) rnd.nextInt(maxBound + 1);
        }
    }

    /**
     * <p>Initialize the array with random long values</p>
     *
     * @param array the array to be initialized
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static void initRandom(long[] array) {
        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(ArrayOperations.LENGTH_ERROR + MIN_LENGTH);
        }

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = rnd.nextLong();
        }
    }

    /**
     * <p>Initialize the array with random float values</p>
     *
     * @param array the array to be initialized
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static void initRandom(float[] array) {
        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(ArrayOperations.LENGTH_ERROR + MIN_LENGTH);
        }

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = rnd.nextFloat();
        }
    }

    /**
     * <p>Initialize the array with random double values</p>
     *
     * @param array the array to be initialized
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static void initRandom(double[] array) {
        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(ArrayOperations.LENGTH_ERROR + MIN_LENGTH);
        }

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextDouble();
        }
    }

    /**
     * <p>Initialize the array with random boolean values</p>
     *
     * @param array the array to be initialized
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static void initRandom(boolean[] array) {
        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(ArrayOperations.LENGTH_ERROR + MIN_LENGTH);
        }

        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextBoolean();
        }
    }

}
