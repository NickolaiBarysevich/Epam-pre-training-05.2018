/*
 * @(#)ArrayOperations.java          1.4 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 05.06.18 22:21
 */

package com.nickshock.task5;

/**
 * This class contains methods that do some algorithmic operations on array
 *
 * @author Barysevich Nikalai
 * @version 1.4 5 June 2018
 */

public class ArrayOperations {

    public static final String LENGTH_ERROR = "array length < ";

    /**
     * <p>Finds the minimum element of the array</p>
     *
     * @param array the array to be checked
     * @return min element of the array
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static int getMinElement(int[] array) {
        final int MIN_LENGTH = 1;

        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(LENGTH_ERROR + MIN_LENGTH);
        }

        if (array.length == 1) {
            return array[0];
        }

        int min = array[0];

        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }

    /**
     * <p>Finds the maximum element of the array</p>
     *
     * @param array the array to be checked
     * @return max element of the array
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static int getMaxElement(int[] array) {
        final int MIN_LENGTH = 1;

        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(LENGTH_ERROR + MIN_LENGTH);
        }

        if (array.length == 1) {
            return array[0];
        }

        int max = array[0];

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    /**
     * <p>Counts the arithmetic mean of the array elements</p>
     *
     * @param array the array to be checked
     * @return arithmetic mean of the array elements
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static double getArithmeticMean(int[] array) {
        final int MIN_LENGTH = 1;

        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(LENGTH_ERROR + MIN_LENGTH);
        }

        if (array.length == 1) {
            return array[0];
        }

        double sum = 0;

        for (int i : array) {
            sum += i;
        }

        return sum / array.length;
    }

    /**
     * <p>Counts the geometric mean of the array elements</p>
     *
     * @param array the array to be checked
     * @return geometric mean of the array elements,
     * return -1 if array contains negative elements
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static double getGeometricMean(int[] array) {
        final int MIN_LENGTH = 1;

        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(LENGTH_ERROR + MIN_LENGTH);
        }

        if (array.length == 1) {
            return array[0];
        }

        int product = 1;

        for (int i : array) {
            if (i < 0) {
                product = -1;
                break;
            }
            product *= i;
        }

        return product != -1 ? Math.exp(Math.log(product) / array.length) : product;
    }

    /**
     * <p>Checks the array whether it's sorted in ascending order</p>
     *
     * @param array the array to be checked
     * @return true if the array sorted in ascending order
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static boolean isSortedInAscendingOrder(int[] array) {
        final int MIN_LENGTH = 1;

        if (array == null || array.length < MIN_LENGTH) {
            return false;
        }

        if (array.length == 1) {
            return true;
        }

        boolean result = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] >= array[i]) {
                result = false;
                break;
            }
        }

        return result;
    }

    /**
     * <p>Checks the array whether it's sorted in descending order</p>
     *
     * @param array the array to be checked
     * @return true if the array sorted in descending order
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static boolean isSortedInDescendingOrder(int[] array) {
        final int MIN_LENGTH = 1;

        if (array == null || array.length < MIN_LENGTH) {
            return false;
        }

        if (array.length == 1) {
            return true;
        }

        boolean result = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (!(array[i] <= array[i + 1])) {
                result = false;
                break;
            }
        }

        return result;
    }

    /**
     * <p>Finds in array the first element that smaller than previous and next one</p>
     *
     * @param array the array to be checked
     * @return position of first min local element of the array
     * if  there is no such element return -1
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static int getLocalMinPosition(int[] array) {
        final int MIN_LENGTH = 3;

        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(LENGTH_ERROR + MIN_LENGTH);
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < array[i - 1]
                    && array[i] < array[i + 1]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * <p>Finds in array the first element that bigger than previous and next one</p>
     *
     * @param array the array to be checked
     * @return position of first max local element of the array
     * if  there is no such element return -1
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static int getLocalMaxPosition(int[] array) {
        final int MIN_LENGTH = 3;

        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(LENGTH_ERROR + MIN_LENGTH);
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1]
                    && array[i] > array[i + 1]) {
                return i;
            }
        }

        return -1;
    }

    /**
     * <p>Reverses the array</p>
     *
     * @param array the array to be reversed
     * @throws NullPointerException         if {@code array == null}
     * @throws ArrayTooSmallLengthException if {@code array.length < MIN_LENGTH}
     */
    public static void reverseArray(int[] array) {
        final int MIN_LENGTH = 1;

        if (array == null) {
            throw new NullPointerException();
        }

        if (array.length < MIN_LENGTH) {
            throw new ArrayTooSmallLengthException(LENGTH_ERROR + MIN_LENGTH);
        }

        if (array.length == 1) {
            return;
        }

        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
