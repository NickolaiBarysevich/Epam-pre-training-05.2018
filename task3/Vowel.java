/*
 * @(#)Vowel.java            1.4 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 27.05.18 23:30
 */

package com.nickshock.task3;

/**
 * This class defines whether transmitted symbol is a vowel
 *
 * @version          1.4 27 May 2018
 * @author           Barysevich Nikalai
 */

public class Vowel {

    //public final static String VOWEL = "eyuioaEYUIOA";

    /** Defines symbol*/
    public static boolean isVowel(char symbol) {
        return symbol == 'e' || symbol == 'y' || symbol == 'u' || symbol == 'i'
                || symbol == 'o' || symbol == 'a' || symbol == 'E' || symbol == 'Y'
                || symbol == 'U' || symbol == 'I' || symbol == 'O' || symbol == 'A';
    }

//    public static boolean isVowel(char symbol) {
//        if (symbol == 'e'){
//            return true;
//        } else if (symbol == 'y'){
//            return true;
//        } else if (symbol == 'u') {
//            return true;
//        } else if (symbol == 'i') {
//            return true;
//        } else if (symbol == 'o') {
//            return true;
//        } else if (symbol == 'a') {
//            return true;
//        } else if (symbol == 'E') {
//            return true;
//        } else if (symbol == 'Y') {
//            return true;
//        } else if (symbol == 'U') {
//            return true;
//        } else if (symbol == 'I') {
//            return true;
//        } else if (symbol == 'O') {
//            return true;
//        } else if (symbol == 'A') {
//            return true;
//        }
//        return false;
//    }

//    public static boolean isVowel(char symbol) {
//        return !VOWEL.replace(symbol, ' ').equals(VOWEL);
//    }
//
//    public static boolean isVowel(char symbol) {
//        switch (symbol) {
//            case 'e':
//            case 'y':
//            case 'u':
//            case 'i':
//            case 'o':
//            case 'a':
//            case 'E':
//            case 'Y':
//            case 'U':
//            case 'I':
//            case 'O':
//            case 'A':
//                return true;
//            default:
//                return false;
//        }
//    }

//    public static boolean isVowel(char symbol) {
//        return VOWEL.contains(symbol + "");
//    }
}
