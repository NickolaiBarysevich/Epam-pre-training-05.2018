/*
 * @(#)MatrixInitializer.java          1.2 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 09.06.18 2:13
 */

package com.nickshock.task6;

import com.nickshock.task5.ArrayTooSmallLengthException;

import java.util.Arrays;
import java.util.Random;

/**
 * This class contains method that initialises matrix with random int
 * values and method that writes the matrix into string.
 *
 * @author Barysevich Nikalai
 * @version 1.2 9 June 2018
 */

public class MatrixInitializer {

    public static final int MIN_LENGTH = 1;

    public static final String LENGTH_ERROR = "array length or array[0] length = ";

    /**
     * <p>Initialize the matrix with random int values.</p>
     *
     * @param matrix   the matrix to be initialized.
     * @param minBound minimum value.
     * @param maxBound maximum value.
     * @throws NullPointerException         if {@code matrix == null}
     * @throws ArrayTooSmallLengthException if {@code matrix.length < MIN_LENGTH}
     */
    public static void initRandom(int[][] matrix, int minBound, int maxBound) {
        MatrixWorker.validateArguments(matrix);

        Random rnd = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(maxBound - minBound + 1) + minBound;
            }
        }
    }

    /**
     * <p>Represents the content of the matrix into string form.</p>
     *
     * @param matrix the matrix to be written.
     * @return the matrix into string form
     * if {@code matrix == null} return "null".
     * @throws ArrayTooSmallLengthException if {@code matrix.length == 0} or {@code ints.length == 0}
     */
    public static String toString(int[][] matrix) {
        if (matrix == null) {
            return "null";
        }

        if (matrix.length == 0) {
            throw new ArrayTooSmallLengthException(MatrixInitializer.LENGTH_ERROR + MatrixInitializer.MIN_LENGTH);
        }

        for (int[] ints : matrix) {
            if (ints.length == 0) {
                throw new ArrayTooSmallLengthException(MatrixInitializer.LENGTH_ERROR + MatrixInitializer.MIN_LENGTH);
            }
        }

        StringBuilder builder = new StringBuilder();

        for (int[] ints : matrix) {
            builder.append(Arrays.toString(ints));
            builder.append("\n");
        }

        return builder.toString();
    }
}
