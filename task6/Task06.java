/*
 * @(#)Task06.java          1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 09.06.18 2:40
 */

package com.nickshock.task6;

import java.util.Arrays;

/**
 * This class tests operations on the matrix from the class MatrixWorker.
 *
 * @author Barysevich Nikalai
 * @version 1.1 9 June 2018
 */

public class Task06 {

    public static int[][] matrix = {{12, 21, 9, 2},
                                    {13, 25, 1, 7},
                                    {11, 20, 19, 3}};

    public static void main(String[] args) {
       test();
    }

    public static void test() {
        System.out.println("Matrix: ");
        String matrixStr = MatrixInitializer.toString(matrix);
        System.out.println(matrixStr);

        testFindMinMaxElement();
        testMeans();
        testLocals();
        testTransposing();
    }

    public static void testFindMinMaxElement() {
        System.out.println("---Find min and max elements of the matrix---");
        int min = MatrixWorker.getMinElement(matrix);
        int max = MatrixWorker.getMaxElement(matrix);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static void testMeans(){
        System.out.println("\n---Calculate arithmetic and geometric mean---");
        double arithmetic = MatrixWorker.getArithmeticMean(matrix);
        double geometric = MatrixWorker.getGeometricMean(matrix);
        System.out.println("Arithmetic: " + arithmetic);
        System.out.println("Geometric: " + geometric);
    }

    public static void testLocals(){
        System.out.println("\n---Find local min and max---");
        int[] min = MatrixWorker.findLocalMin(matrix);
        int[] max = MatrixWorker.findLocalMax(matrix);

        String minStr = min[0] != -1 ? "Minimum: " + Arrays.toString(min)
                : "There is no local min in this matrix";

        String maxStr = max[0] != -1 ? "Maximum: " + Arrays.toString(max)
                : "There is no local max in this matrix";

        System.out.println(minStr);
        System.out.println(maxStr);
    }

    public static void testTransposing() {
        System.out.println("\n---Transpose matrix---");
        System.out.println("Matrix: ");
        String matrixStr = MatrixInitializer.toString(matrix);
        System.out.println(matrixStr);

        matrix = MatrixWorker.transposeMatrix(matrix);
        System.out.println("Transposed Matrix: ");
        String transposedMatrix = MatrixInitializer.toString(matrix);
        System.out.println(transposedMatrix);

        System.out.println("Square matrix");
        int[][] squareMatrix = new int[4][4];
        MatrixInitializer.initRandom(squareMatrix, -30, 30);
        MatrixWorker.transposeSquareMatrix(squareMatrix);
        matrixStr = MatrixInitializer.toString(squareMatrix);
        System.out.println(matrixStr);

        MatrixWorker.transposeSquareMatrix(squareMatrix);
        System.out.println("Transposed square Matrix: ");
        transposedMatrix = MatrixInitializer.toString(squareMatrix);
        System.out.println(transposedMatrix);

    }
}
