/*
 * @(#)Task10.java          1.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 20.06.18 23:41
 */

package com.nickshock.task10.controller;

import com.nickshock.task10.bll.Recursion;

import static com.nickshock.task10.pl.ConsolePrinter.*;

public class Task10 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        print("---Testing class Recursion---\n");

        print("Counting sum of the digits of a number.");
        int n = 12345;
        print("Number is " + n);
        int sum = Recursion.countDigitsSum(n);
        print("Sum is " + sum);

        print("\nRaising number to the power of.");
        double x = 12.5;
        n = 4;
        print("Number to be powered: " + x);
        print("Power: " + n);
        x = Recursion.pow(x, n);
        print("Result is " + x);

        print("\nChecking the equality between" +
                " sum of the digits of the first number with the second number");
        n = 12345;
        int s = 15;
        print("The first number: " + n);
        print("The second number: " + s);
        boolean equality = Recursion.equals(n, s);
        print("Is equals --> " + equality);

        n = 12345;
        s = 32;
        print("The first number: " + n);
        print("The second number: " + s);
        equality = Recursion.equals(n, s);
        print("Is equals --> " + equality);

        print("\nCounting Fibonacci number by the index");

        int index = 9;
        int result = Recursion.getFibByIndex(index);
        print("The index is " + index);
        print("The Fibonacci number: " + result);

        index = 4;
        result = Recursion.getFibByIndex(index);
        print("The index is " + index);
        print("The Fibonacci number: " + result);

        print("\nSolving the tower of hanoi");
        int rings = 3;
        char from = 'A';
        char to = 'B';
        char temp = 'C';
        print("Rings amount: " + rings);
        print("Source pyramid: " + from);
        print("Needed pyramid: " + to);
        print("Temp pyramid: " + temp);
        print("\nSolution: ");
        Recursion.resolveHanoi(rings, from, to, temp);

    }
}
