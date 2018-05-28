/*
 * @(#)Main.java      1.2 24/05/18
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task2;

/**
 * The main class, which is the starting point of
 * the program.
 *
 * @version          1.2 25 May 2018
 * @author           Barysevich Nikalai
 */

public class Main {

    /** Runs program*/
    public static void main(String[] args) {
        int a = 41;
        int b = 41;
        int c = 41;

        System.out.println("======= Checking equality of 3 variables =======");
        boolean bool = EqualLogic.checkEquality(a, b, c);
        System.out.println("is " + a + " = " + b + " = " + c + " --> " + bool);
        b = 53;
        bool = EqualLogic.checkEquality(a, b, c);
        System.out.println("is " + a + " = " + b + " = " + c + " --> " + bool);

        System.out.println("\n======= Calculating kilograms in milligrams, grams and tons =======");
        c = DinosaurMass.toMilligrams(b);
        System.out.println(b + " kilograms = " + c + " milligrams");

        c = DinosaurMass.toGrams(b);
        System.out.println(b + " kilograms = " + c + " grams");

        double d = DinosaurMass.toTons(b);
        System.out.println(b + " kilograms = " + d + " tons");

        System.out.println("\n======= Calculating ring area =======");
        d = Ring.ringArea(b, a);
        System.out.println("Ring area with r1 = " + b + " and r2 = " + a + " --> " + d);

        System.out.println("\n======= Is number increasing or decreasing sequence =======");
        a = 1236;
        bool = Sequence.isIncreasingSequence(a);
        System.out.println("is " + a + " increasing sequence --> " + bool);

        a = 6321;
        bool = Sequence.isDecreasingSequence(a);
        System.out.println("is " + a + " decreasing sequence --> " + bool);

        System.out.println("\n======= Arithmetic and geometric means =======");
        a = 523423;
        System.out.println("a = " + a);

        d = AverageMean.arithmeticMean(a);
        System.out.println("arithmetic mean of " + a + " = " + d);

        d = AverageMean.geometricMean(a);
        System.out.println("geometric mean of " + a + " = " + d);

        System.out.println("\n======= Reversing =======");
        a = a + 1_000_000;
        System.out.println("a = " + a);

        c = Reverse.reverse(a);
        System.out.println("Reversed " + a + " = " + c);

        System.out.println("\n======= Changing values of 2 variables =======");
        ValueChange.change(a, b);
    }
}
