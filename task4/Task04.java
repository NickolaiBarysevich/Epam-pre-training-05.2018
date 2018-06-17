/*
 * @(#)Task04.java                  1.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 05.06.18 1:12
 */

package com.nickshock.task4;

/**
 * This class needs to test all developed tasks
 *
 * @author Barysevich Nikalai
 * @version 1.0 5 June 2018
 */
public class Task04 {

    /**
     * Starting point of the program
     */
    public static void main(String[] args) {
        //test();
        System.out.println(PerfectNumber.isPerfect(28));
    }

    /**
     * Testing tasks
     */
    public static void test() {
        System.out.println("Toss a coin.");
        int throwsAmount = 400;
        int result = CoinToss.tossACoin(throwsAmount);
        System.out.println("Heads: " + result);
        System.out.println("Tails: " + (throwsAmount - result));

        System.out.println("\nFind max digit.");
        int number = 23453473;
        System.out.println("Number: " + number);
        int max = MaxDigit.getMaxDigit(number);
        System.out.println("Max digit: " + max);

        System.out.println("\nIs number a palindrome?");
        boolean res = Palindrome.isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? --> " + res);
        number = 32144123;
        res = Palindrome.isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? --> " + res);

        System.out.println("\nIs number a prime number?");
        res = PrimeNumber.isPrime(number);
        System.out.println("Is " + number + " a prime number? --> " + res);
        number = 11;
        res = PrimeNumber.isPrime(number);
        System.out.println("Is " + number + " a prime number? --> " + res);

        System.out.println("\nFind all prime dividers");
        number = 996;
        System.out.println("Number: " + number);
        String str = PrimeNumber.findPrimeDividers(number);
        System.out.println("Prime dividers: " + str);

        System.out.println("\nFind gcd and lcm");
        int a = 100;
        int b = 64;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int gcd = GcdAndLcm.getGcd(a, b);
        int lcm = GcdAndLcm.getLcm(a, b);
        System.out.println("Gcd: " + gcd);
        System.out.println("Lcm: " + lcm);

        System.out.println("\nFind amount of different digits in number");
        number = 12133228;
        System.out.println("Number: " + number);
        int amount = DifferentDigit.countDifferentDigits(number);
        System.out.println("The amount of different digits: " + amount);

        System.out.println("\nIs number a perfect number?");
        System.out.println("Number: " + number);
        res = PrimeNumber.isPrime(number);
        System.out.println("Is " + number + " a perfect number? --> " + res);
        number = 28;
        res = PrimeNumber.isPrime(number);
        System.out.println("Is " + number + " a perfect number? --> " + res);
    }
}
