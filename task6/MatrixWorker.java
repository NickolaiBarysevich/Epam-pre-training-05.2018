/*
 * @(#)MatrixWorker.java          1.4 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 11.06.18 23:00
 */

package com.nickshock.task6;

import com.nickshock.task5.ArrayTooSmallLengthException;

/**
 * This class contains various methods
 * that do some algorithmic operations on matrices.
 * Such as searching for minimum element of the matrix or transposing.
 *
 * @author Barysevich Nikalai
 * @version 1.4 11 June 2018
 */

public class MatrixWorker {

    /**
     * <p>Checks the correctness of gotten matrix.</p>
     * If given matrix is null or it's length equals 0
     * throws an exception.
     */
    public static void validateArguments(int[][] matrix) {
        if (matrix == null) {
            throw new NullPointerException();
        }

        if (matrix.length == 0) {
            throw new ArrayTooSmallLengthException(MatrixInitializer.LENGTH_ERROR + MatrixInitializer.MIN_LENGTH);
        }

        for (int[] ints : matrix) {
            if (ints.length == 0) {
                throw new ArrayTooSmallLengthException(MatrixInitializer.LENGTH_ERROR + MatrixInitializer.MIN_LENGTH);
            }
        }

    }

    /**
     * <p>Finds the minimum element of the matrix.</p>
     *
     * @param matrix the matrix to be checked.
     * @return min element of the matrix.
     * @throws NullPointerException         if {@code matrix == null}
     * @throws ArrayTooSmallLengthException if {@code matrix.length == 0} or {@code ints.length == 0}
     */
    public static int getMinElement(int[][] matrix) {
        validateArguments(matrix);

        int min = matrix[0][0];

        for (int[] ints : matrix) {
            for (int i : ints) {
                if (i < min) {
                    min = i;
                }
            }
        }

        return min;
    }

    /**
     * <p>Finds the minimum element of the matrix.</p>
     *
     * @param matrix the matrix to be checked.
     * @return min element of the matrix.
     * @throws NullPointerException         if {@code matrix == null}
     * @throws ArrayTooSmallLengthException if {@code matrix.length == 0} or {@code ints.length == 0}
     */
    public static int getMaxElement(int[][] matrix) {
        validateArguments(matrix);

        int max = matrix[0][0];

        for (int[] ints : matrix) {
            for (int i : ints) {
                if (i > max) {
                    max = i;
                }
            }
        }

        return max;
    }

    /**
     * <p>Counts the arithmetic mean of the matrix elements.</p>
     *
     * @param matrix the matrix to be checked.
     * @return arithmetic mean of the matrix elements.
     * @throws NullPointerException         if {@code matrix == null}
     * @throws ArrayTooSmallLengthException if {@code matrix.length == 0} or {@code ints.length == 0}
     */
    public static double getArithmeticMean(int[][] matrix) {
        validateArguments(matrix);

        double sum = 0;
        int elementsAmount = 0;

        for (int[] ints : matrix) {
            for (int i : ints) {
                sum += i;
                elementsAmount++;
            }
        }

        return sum / elementsAmount;

    }

    /**
     * <p>Counts the geometric mean of the matrix elements.</p>
     *
     * @param matrix the matrix to be checked.
     * @return geometric mean of the matrix elements,
     * return -1 if matrix contains negative elements.
     * @throws NullPointerException         if {@code matrix == null}
     * @throws ArrayTooSmallLengthException if {@code matrix.length == 0} or {@code ints.length == 0}
     */
    public static double getGeometricMean(int[][] matrix) {
        validateArguments(matrix);

        double product = 1;
        int elementsAmount = 0;

        for (int[] ints : matrix) {
            for (int i : ints) {
                if (i < 0) {
                    return -1;
                }
                product *= i;
                elementsAmount++;
            }
        }

        return Math.exp(Math.log(product) / elementsAmount);

    }

    /**
     * <p>Finds in the matrix the first element that smaller than it's neighbors.</p>
     *
     * @param matrix the matrix to be checked.
     * @return position of first min local element of the matrix
     * if there is no such element return -1, -1.
     * @throws NullPointerException         if {@code matrix == null}
     * @throws ArrayTooSmallLengthException if {@code matrix.length == 0} or {@code ints.length == 0}
     */
    public static int[] findLocalMin(int[][] matrix) {
        validateArguments(matrix);

        int targetI = -1;
        int targetJ = -1;

        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] < matrix[i - 1][j] && matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i + 1][j]
                        && matrix[i][j] < matrix[i][j + 1]) {
                    targetI = i;
                    targetJ = j;
                    break;
                }
            }
        }

        return new int[]{targetI, targetJ};
    }

    /**
     * <p>Finds in the matrix the first element that bigger than it's neighbors.</p>
     *
     * @param matrix the matrix to be checked.
     * @return position of first min local element of the matrix
     * if there is no such element return -1, -1.
     * @throws NullPointerException         if {@code matrix == null}
     * @throws ArrayTooSmallLengthException if {@code matrix.length == 0} or {@code ints.length == 0}
     */
    public static int[] findLocalMax(int[][] matrix) {
        validateArguments(matrix);

        int targetI = -1;
        int targetJ = -1;

        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] > matrix[i - 1][j] && matrix[i][j] > matrix[i][j + 1]
                        && matrix[i][j] > matrix[i + 1][j]
                        && matrix[i][j] > matrix[i][j + 1]) {
                    targetI = i;
                    targetJ = j;
                    break;
                }
            }
        }

        return new int[]{targetI, targetJ};
    }


    /**
     * <p>Transposes the matrix.</p>
     *
     * @param matrix the matrix to be transposed.
     * @return transposed matrix.
     * @throws NullPointerException         if {@code matrix == null}
     * @throws ArrayTooSmallLengthException if {@code matrix.length == 0} or {@code ints.length == 0}
     */
    public static int[][] transposeMatrix(int[][] matrix) {
        validateArguments(matrix);

        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = 0; j < transposedMatrix[i].length; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }

    /**
     * <p>Transposes the square matrix</p>
     *
     * @param squareMatrix the matrix to be transposed.
     * @throws NullPointerException         if {@code squareMatrix == null}
     * @throws ArrayTooSmallLengthException if {@code matrix.length == 0} or {@code ints.length == 0}
     * @throws IllegalArgumentException     if {@code squareMatrix.length != squareMatrix[0].length}
     */
    public static void transposeSquareMatrix(int[][] squareMatrix) {
        validateArguments(squareMatrix);

        for (int[] ints : squareMatrix) {
            if (squareMatrix.length != ints.length) {
                throw new IllegalArgumentException("n != m");
            }
        }

        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = i; j < squareMatrix[i].length; j++) {
                squareMatrix[i][j] ^= squareMatrix[j][i];
                squareMatrix[j][i] ^= squareMatrix[i][j];
                squareMatrix[i][j] ^= squareMatrix[j][i];
            }
        }
    }

}
