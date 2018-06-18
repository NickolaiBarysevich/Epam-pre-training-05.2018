/*
 * @(#)Task03.java          1.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 19.06.18 0:59
 */

package com.nickshock.task3;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Random rnd = new Random();

        System.out.println("---Testing class Triangle---\n");
        int xA = rnd.nextInt(11);
        int yA = rnd.nextInt(25);
        int xB = rnd.nextInt(20);
        int yB = rnd.nextInt(50);
        int xC = rnd.nextInt(30);
        int yC = rnd.nextInt(34);
        System.out.println("Point A(" + xA + "; " + yA + ")");
        System.out.println("Point B(" + xB + "; " + yB + ")");
        System.out.println("Point C(" + xC + "; " + yC + ")");

        double a = Triangle.getSide(xA, yA, xB, yB);
        double b = Triangle.getSide(xA, yA, xC, yC);
        double c = Triangle.getSide(xC, yC, xB, yB);

        System.out.println("Distance between A and B = " + a);
        System.out.println("Distance between A and c = " + b);
        System.out.println("Distance between C and B = " + c);

        boolean isTriangle = Triangle.isTriangle(a, b, c);
        System.out.println("Can Triangle exist with this point --> " + isTriangle);
        if (isTriangle) {
            boolean isRect = Triangle.isRectangular(a, b, c);
            System.out.println("Is triangle rectangular --> " + isRect);
        }

        System.out.println("\n---Testing class Dragon---\n");
        int dragonsAge = rnd.nextInt(101);
        System.out.println("Dragon's age is " + dragonsAge);
        int heads = Dragon.countHeads(dragonsAge);
        int eyes = Dragon.getEyes(heads);
        System.out.println("This dragon has " + heads + " heads with " + eyes + " eyes");
        System.out.println();

        dragonsAge = rnd.nextInt(300 - 101 + 1) + 101;
        System.out.println("Dragon's age is " + dragonsAge);
        heads = Dragon.countHeads(dragonsAge);
        eyes = Dragon.getEyes(heads);
        System.out.println("This dragon has " + heads + " heads with " + eyes + " eyes");
        System.out.println();

        dragonsAge = rnd.nextInt(2000 - 301 + 1) + 301;
        System.out.println("Dragon's age is " + dragonsAge);
        heads = Dragon.countHeads(dragonsAge);
        eyes = Dragon.getEyes(heads);
        System.out.println("This dragon has " + heads + " heads with " + eyes + " eyes");

        System.out.println("\n---Testing class Vowel---\n");

        char symbol = 'y';
        boolean isVowel = Vowel.isVowel(symbol);
        System.out.println("Is symbol " + symbol + " vowel --> " + isVowel);

        symbol = 'O';
        isVowel = Vowel.isVowel(symbol);
        System.out.println("Is symbol " + symbol + " vowel --> " + isVowel);

        symbol = (char) rnd.nextInt();
        isVowel = Vowel.isVowel(symbol);
        System.out.println("Is symbol " + symbol + " vowel --> " + isVowel);

        System.out.println("\n---Testing class MoodSensor---\n");

        String mood = MoodSensor.getMood();
        System.out.println("Your mood is " + mood);

        System.out.println("\n---Testing class Calendar---\n");

        int day = rnd.nextInt(Calendar.MONTH_WITH_31_DAYS) + 1;
        int month = new Random().nextInt(Calendar.MONTHS) + 1;
        int year = new Random().nextInt(2018)  + 1;

        System.out.println("Random date is: " + day + "." + month + "." + year);
        String nextDate = Calendar.getNextDate(day, month, year);
        System.out.println("The next date is: " + nextDate);

    }
}
