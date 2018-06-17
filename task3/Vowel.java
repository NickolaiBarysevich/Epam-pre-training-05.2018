/*
 * @(#)Vowel.java          1.6 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 17.06.18 1:07
 */

package com.nickshock.task3;

/**
 * This class defines whether transmitted symbol is a vowel.
 *
 * @author Barysevich Nikalai
 * @version 1.6 17 June 2018
 */
public class Vowel {

    //public final static String VOWEL = "eyuioa";

    /**
     * Defines whether the gotten symbol is vowel.
     *
     * @param symbol symbol to be checked.
     * @return true if symbol is a vowel.
     */
    public static boolean isVowel(char symbol) {
        symbol = Character.toLowerCase(symbol);
        return symbol == 'e' || symbol == 'y' || symbol == 'u' || symbol == 'i'
                || symbol == 'o' || symbol == 'a';
    }

//    public static boolean isVowel(char symbol) {
//        symbol = Character.toLowerCase(symbol);
//        if (symbol == 'e') {
//            return true;
//        } else if (symbol == 'y') {
//            return true;
//        } else if (symbol == 'u') {
//            return true;
//        } else if (symbol == 'i') {
//            return true;
//        } else if (symbol == 'o') {
//            return true;
//        } else if (symbol == 'a') {
//            return true;
//        }
//        return false;
//    }

//    public static boolean isVowel(char symbol) {
//        symbol = Character.toLowerCase(symbol);
//        return !VOWEL.replace(symbol, ' ').equals(VOWEL);
//    }
//
//    public static boolean isVowel(char symbol) {
//        symbol = Character.toLowerCase(symbol);
//        switch (symbol) {
//            case 'e':
//            case 'y':
//            case 'u':
//            case 'i':
//            case 'o':
//            case 'a':
//                return true;
//            default:
//                return false;
//        }
//    }

//    public static boolean isVowel(char symbol) {
//        symbol = Character.toLowerCase(symbol);
//        return VOWEL.contains(symbol + "");
//    }
}
