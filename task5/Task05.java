/*
 * @(#)Task05.java                  1.1 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 05.06.18 15:47
 */

package com.nickshock.task5;

import java.util.Arrays;

/**
 * This class tests operations on array
 *
 * @author Barysevich Nikalai
 * @version 1.1 5 June 2018
 */

public class Task05 {

    /**
     * Starting point of the program
     */
    public static void main(String[] args) {
        test();
    }

    /**
     * Tests operations on array
     */
    public static void test() {
        int[] array = new int[10];
        ArrayInitializer.initRandom(array, 20, 0);

        String arr = Arrays.toString(array);
        System.out.println("Array: " + arr);

        System.out.println("\n---Find min and max element---");
        int min = ArrayOperations.getMinElement(array);
        System.out.println("Min: " + min);
        int max = ArrayOperations.getMaxElement(array);
        System.out.println("Max: " + max);

        System.out.println("\n---Find arithmetic and geometric means---");
        double mean = ArrayOperations.getArithmeticMean(array);
        System.out.println("Arithmetic: " + mean);
        mean = ArrayOperations.getGeometricMean(array);
        System.out.println("Geometric: " + mean);

        System.out.println("\n---Is array sorted?---");
        Arrays.sort(array);
        arr = Arrays.toString(array);
        System.out.println("Sorted array: " + arr);
        boolean isSorted = ArrayOperations.isSortedInAscendingOrder(array);
        System.out.println("In ascending order --> " + isSorted);
        ArrayOperations.reverseArray(array);
        arr = Arrays.toString(array);
        System.out.println("Sorted array: " + arr);
        isSorted = ArrayOperations.isSortedInDescendingOrder(array);
        System.out.println("In descending order --> " + isSorted);

        System.out.println("\n---Find position of first local min or max---");
        ArrayInitializer.initRandom(array, 20, 0);
        arr = Arrays.toString(array);
        System.out.println("New array: " + arr);
        min = ArrayOperations.getLocalMinPosition(array);
        System.out.println("Position of local min: " + min);
        max = ArrayOperations.getLocalMaxPosition(array);
        System.out.println("Position of local max: " + max);

        System.out.println("\n---Reverse array---");
        System.out.println("Before: " + arr);
        ArrayOperations.reverseArray(array);
        arr = Arrays.toString(array);
        System.out.println("After: " + arr);
    }
}
