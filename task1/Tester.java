/*
 * @(#)Tester.java      1.4 21/05/21
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task1;

/**
 * This class is used to test all available operations with primitive types
 * and two reference types (String, Student).
 * It contains 10 static methods for testing types.
 *
 * @version          1.4 21 May 2018
 * @author           Barysevich Nikalai
 */

public class Tester {

    /** Tests byte type. */
    public static void testByte() {
        byte a = 12;
        byte b = 42;
        byte c;

        System.out.println("------- Arithmetical Operators with \"byte\" type -------");

        //addition
        c = (byte) (a + b);
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = (byte) (a - b);
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = (byte) (a * b);
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = (byte) (a / b);
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = (byte) (a % b);
        System.out.println(a + " % " + b + " = " + c);

        //unary minus
        c = (byte) -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = (byte) +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 6;
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 6;
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 6;
        System.out.println(a + "-- = " + a--);

        System.out.println("------- Bitwise Operators with \"byte\" type -------");

        //bitwise and
        c = (byte) (a & b);
        System.out.println(a + " & " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c)+ "\n");
        //bitwise OR
        c = (byte) (a | b);
        System.out.println(a + " | " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " | " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise xor
        c = (byte) (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " ^ " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise unary compliment
        c = (byte) ~a;
        System.out.println("~" + a + " = " + c);
        System.out.println("Binary form:");
        System.out.println("~" + Integer.toBinaryString(a) + " = " + Integer.toBinaryString(c) + "\n");
        //left shift
        c = (byte) (a << 1);
        System.out.println(a + " << 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " << 1 = " + Integer.toBinaryString(c) + "\n");
        //right shift
        a = -58;
        c = (byte) (a >> 1);
        System.out.println(a + " >> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = 58;
        c = (byte) (a >>> 1);
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = -58;
        c = (byte) (a >>> 1);
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");

        System.out.println("------- Assignment Operators with \"byte\" type -------");

        c = 54;
        System.out.println(c + " += " + a + " --> c = " + (c += a));
        System.out.println(c + " -= " + a + " --> c = " + (c -= a));
        System.out.println(c + " *= " + a + " --> c = " + (c *= a));
        System.out.println(c + " /= " + a + " --> c = " + (c /= a));
        System.out.println(c + " %= " + a + " --> c = " + (c %= a));
        System.out.println(c + " |= " + a + " --> c = " + (c |= a));
        System.out.println(c + " &= " + a + " --> c = " + (c &= a));
        c = 54;
        System.out.println(c + " ^= " + a + " --> c = " + (c ^= a));
        System.out.println(c + " >>= " + a + " --> c = " + (c >>= a));
        System.out.println(c + " <<= " + a + " --> c = " + (c <<= a));
        System.out.println(c + " >>>= " + a + " --> c = " + (c >>>= a));


        System.out.println("------- Relational Operators with \"byte\" type -------");

        //greater than
        System.out.println(a + " > " + b + " --> " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " --> " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " --> " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " --> " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " --> " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " --> " + (a != b));

        System.out.println("------- Logical Operations with \"byte\" type -------");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") --> " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") --> " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") --> " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") --> " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") --> " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") --> " + !(a >= b));

        System.out.println("------- Misc Operators with \"byte\" type -------");

        System.out.println("\nCondition operator:");

        System.out.println(a + " > " + b + " ? " + a + " : " + b + " --> " + (a > b ? a : b));

        System.out.println("\nType cast operator:");

        short sh = 27500;
        char ch = '\u0042';
        int i = 1998904;
        long l = 3540000000000L;
        float f = 410.13f;
        double d = 7045.8;
        boolean bool = false;
        String str = "string";
        Student stud = new Student("Fedor Fedorov", 8);

        c = (byte) sh;
        System.out.println("byte = short: c = (byte) " + sh + " --> c = " + c);
        c = (byte) ch;
        System.out.println("byte = char: c = (byte) " + ch + " --> c = " + c);
        c = (byte) i;
        System.out.println("byte = int: c = (byte) " + i + " --> c = " + c);
        c = (byte) l;
        System.out.println("byte = long: c = (byte) " + l + " --> c = " + c);
        c = (byte) f;
        System.out.println("byte = float: c = (byte) " + f + " --> c = " + c);
        c = (byte) d;
        System.out.println("byte = double: c = (byte) " + d + " --> c = " + c);
        //c = (byte) bool;
        System.out.println("byte = boolean: c = (byte) " + bool + " --> c = compile error");
        //c = (byte) str;
        System.out.println("byte = String: c = (byte) " + str + " --> c = compile error");
        //c = (byte) stud;
        System.out.println("byte = Student: c = (byte) " + stud + " --> c = compile error");
    }

    /** Tests short type. */
    public static void testShort() {
        short a = 1542;
        short b = 980;
        short c;

        System.out.println("------- Arithmetical Operators with \"short\" type -------");

        //addition
        c = (short) (a + b);
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = (short) (a - b);
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = (short) (a * b);
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = (short) (a / b);
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = (short) (a % b);
        System.out.println(a + " % " + b + " = " + c);

        //unary minus
        c = (short) -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = (short) +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 1542;
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 1542;
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 1542;
        System.out.println(a + "-- = " + a--);


        System.out.println("------- Bitwise Operators with \"short\" type -------");

        //bitwise and
        c = (short) (a & b);
        System.out.println(a + " & " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c)+ "\n");
        //bitwise OR
        c = (short) (a | b);
        System.out.println(a + " | " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " | " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise xor
        c = (short) (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " ^ " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise unary compliment
        c = (short) ~a;
        System.out.println("~" + a + " = " + c);
        System.out.println("Binary form:");
        System.out.println("~" + Integer.toBinaryString(a) + " = " + Integer.toBinaryString(c) + "\n");
        //left shift
        c = (short) (a << 1);
        System.out.println(a + " << 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " << 1 = " + Integer.toBinaryString(c) + "\n");
        //right shift
        a = -342;
        c = (short) (a >> 1);
        System.out.println(a + " >> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = 342;
        c = (short) (a >>> 1);
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = -342;
        c = (short) (a >>> 1);
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");

        System.out.println("------- Assignment Operators with \"short\" type -------");

        c = 32423;
        System.out.println(c + " += " + a + " --> c = " + (c += a));
        System.out.println(c + " -= " + a + " --> c = " + (c -= a));
        System.out.println(c + " *= " + a + " --> c = " + (c *= a));
        System.out.println(c + " /= " + a + " --> c = " + (c /= a));
        System.out.println(c + " %= " + a + " --> c = " + (c %= a));
        System.out.println(c + " |= " + a + " --> c = " + (c |= a));
        System.out.println(c + " &= " + a + " --> c = " + (c &= a));
        c = 32423;
        System.out.println(c + " ^= " + a + " --> c = " + (c ^= a));
        System.out.println(c + " >>= " + a + " --> c = " + (c >>= a));
        System.out.println(c + " <<= " + a + " --> c = " + (c <<= a));
        System.out.println(c + " >>>= " + a + " --> c = " + (c >>>= a));

        System.out.println("------- Relational Operators with \"short\" type -------");

        //greater than
        System.out.println(a + " > " + b + " --> " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " --> " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " --> " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " --> " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " --> " + (a == b));
        //not equal to
        System.out.println(a + " !=" + b + " --> " + (a != b));

        System.out.println("------- Logical Operations with \"short\" type -------");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") --> " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") --> " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") --> " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") --> " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") --> " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") --> " + !(a >= b));

        System.out.println("------- Misc Operators with \"short\" type -------");

        System.out.println("\nCondition operator:");

        System.out.println(a + " > " + b + " ? " + a + " : " + b + " --> " + (a > b ? a : b));

        System.out.println("\nType cast operator:");

        byte bt = 120;
        char ch = '\u0072';
        int i = 1234504;
        long l = 230000454353243240L;
        float f = 152.5432f;
        double d = 12332.2134;
        boolean bool = false;
        String str = "string";
        Student stud = new Student("Fedor Fedorov", 8);

        c = bt;
        System.out.println("short = byte: c = " + bt + " --> c = " + c);
        c = (short) ch;
        System.out.println("short = char: c = " + ch + " --> c = " + c);
        c = (short) i;
        System.out.println("short = int: c = " + i + " --> c = " + c);
        c = (short) l;
        System.out.println("short = long: c = (short) " + l + " --> c = " + c);
        c = (short) f;
        System.out.println("short = float: c = (short) " + f + " --> c = " + c);
        c = (short) d;
        System.out.println("short = double: c = (short) " + d + " --> c = " + c);
        //c = (byte) bool;
        System.out.println("short = boolean: c = (short) " + bool + " --> c = compile error");
        //c = (short) str;
        System.out.println("short = String: c = (short) " + str + " --> c = compile error");
        //c = (short) stud;
        System.out.println("short = Student: c = (short) " + stud + " --> c = compile error");
    }

    /** Tests char type. */
    public static void testChar() {
        char a = 'h';
        char b = '\u0132';
        char c;

        System.out.println("------- Arithmetical Operators with \"char\" type -------");

        //addition
        c = (char) (a + b);
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = (char) (a - b);
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = (char) (a * b);
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = (char) (a / b);
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = (char) (a % b);
        System.out.println(a + " % " + b + " = " + c);

        //unary minus
        c = (char) -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = (char) +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 'h';
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 'h';
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 'h';
        System.out.println(a + "-- = " + a--);


        System.out.println("------- Bitwise Operators with \"char\" type -------");

        //bitwise and
        c = (char) (a & b);
        System.out.println(a + " & " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c)+ "\n");
        //bitwise OR
        c = (char) (a | b);
        System.out.println(a + " | " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " | " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise xor
        c = (char) (a ^ b);
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " ^ " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise unary compliment
        c = (char) ~a;
        System.out.println("~" + a + " = " + c);
        System.out.println("Binary form:");
        System.out.println("~" + Integer.toBinaryString(a) + " = " + Integer.toBinaryString(c) + "\n");
        //left shift
        c = (char) (a << 1);
        System.out.println(a + " << 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " << 1 = " + Integer.toBinaryString(c) + "\n");
        //right shift
        a = '\123';
        c = (char) (a >> 1);
        System.out.println(a + " >> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = '\321';
        c = (char) (a >>> 1);
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        System.out.println("------- Assignment Operators with \"char\" type -------");

        c = '_';
        System.out.println(c + " += " + a + " --> c = " + (c += a));
        System.out.println(c + " -= " + a + " --> c = " + (c -= a));
        System.out.println(c + " *= " + a + " --> c = " + (c *= a));
        System.out.println(c + " /= " + a + " --> c = " + (c /= a));
        System.out.println(c + " %= " + a + " --> c = " + (c %= a));
        System.out.println(c + " |= " + a + " --> c = " + (c |= a));
        System.out.println(c + " &= " + a + " --> c = " + (c &= a));
        c = '_';
        System.out.println(c + " ^= " + a + " --> c = " + (c ^= a));
        c = '_';
        System.out.println(c + " >>= " + a + " --> c = " + (c >>= a));
        c = '_';
        System.out.println(c + " <<= " + a + " --> c = " + (c <<= a));
        c = '_';
        System.out.println(c + " >>>= " + a + " --> c = " + (c >>>= a));

        System.out.println("------- Relational Operators with \"char\" type -------");

        //greater than
        System.out.println(a + " > " + b + " --> " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " --> " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " --> " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " --> " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " --> " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " --> " + (a != b));

        System.out.println("------- Logical Operations with \"char\" type -------");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") --> " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") --> " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") --> " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") --> " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") --> " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") --> " + !(a >= b));

        System.out.println("------- Misc Operators with \"char\" type -------");

        System.out.println("\nCondition operator:");

        System.out.println(a + " > " + b + " ? " + a + " : " + b + " --> " + (a > b ? a : b));

        System.out.println("\nType cast operator:");

        byte bt = -43;
        short sh = 6000;
        int i = 65234233;
        long l = 65087000000000L;
        float f = 531.23f;
        double d = 1343242.124;
        boolean bool = false;
        String str = "string of something";
        Student stud = new Student("student", 7);

        c = (char) bt;
        System.out.println("char = byte: c = (char) " + bt + " --> c = " + c);
        c = (char) sh;
        System.out.println("char = short: c = (char) " + sh + " --> c = " + c);
        c = (char) i;
        System.out.println("char = int: c = (char) " + i + " --> c = " + c);
        c = (char) l;
        System.out.println("char = long: c = (char) " + l + " --> c = " + c);
        c = (char) f;
        System.out.println("char = float: c = (char) " + f + " --> c = " + c);
        c = (char) d;
        System.out.println("char = double: c = (char) " + d + " --> c = " + c);
        //c = (byte) bool;
        System.out.println("char = boolean: c = (char) " + bool + " --> c = compile error");
        //c = (char) str;
        System.out.println("char = String: c = (char) " + str + " --> c = compile error");
        //c = (char) stud;
        System.out.println("char = Student: c = (char) " + stud + " --> c = compile error");
    }

    /** Tests int type. */
    public static void testInt() {
        int a = 56554465;
        int b = 798876542;
        int c;

        System.out.println("------- Arithmetical Operators with \"int\" type -------");

        //addition
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);

        //unary minus
        c = -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        a = 56554465;
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 56554465;
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 56554465;
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 56554465;
        System.out.println(a + "-- = " + a--);

        System.out.println("------- Bitwise Operators with \"int\" type -------");
        //bitwise and
        c = a & b;
        System.out.println(a + " & " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " & " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c)+ "\n");
        //bitwise OR
        c = a | b;
        System.out.println(a + " | " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " | " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise xor
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " ^ " + Integer.toBinaryString(b) + " = " + Integer.toBinaryString(c) + "\n");
        //bitwise unary compliment
        c = ~a;
        System.out.println("~" + a + " = " + c);
        System.out.println("Binary form:");
        System.out.println("~" + Integer.toBinaryString(a) + " = " + Integer.toBinaryString(c) + "\n");
        //left shift
        c = a << 1;
        System.out.println(a + " << 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " << 1 = " + Integer.toBinaryString(c) + "\n");
        //right shift
        a = -56554465;
        c = a >> 1;
        System.out.println(a + " >> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = 56554465;
        c = a >>> 1;
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");
        //zero fill right shift
        a = -56554465;
        c = a >>> 1;
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Integer.toBinaryString(a) + " >>> 1 = " + Integer.toBinaryString(c) + "\n");

        System.out.println("------- Assignment Operators with \"int\" type -------");

        c = 536734641;
        System.out.println(c + " += " + a + " --> c = " + (c += a));
        System.out.println(c + " -= " + a + " --> c = " + (c -= a));
        System.out.println(c + " *= " + a + " --> c = " + (c *= a));
        System.out.println(c + " /= " + a + " --> c = " + (c /= a));
        System.out.println(c + " %= " + a + " --> c = " + (c %= a));
        System.out.println(c + " |= " + a + " --> c = " + (c |= a));
        System.out.println(c + " &= " + a + " --> c = " + (c &= a));
        System.out.println(c + " ^= " + a + " --> c = " + (c ^= a));
        System.out.println(c + " >>= " + a + " --> c = " + (c >>= a));
        System.out.println(c + " <<= " + a + " --> c = " + (c <<= a));
        System.out.println(c + " >>>= " + a + " --> c = " + (c >>>= a));

        System.out.println("------- Relational Operators with \"int\" type -------");

        //greater than
        System.out.println(a + " > " + b + " --> " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " --> " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " --> " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " --> " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " --> " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " --> " + (a != b));

        System.out.println("------- Logical Operations with \"int\" type -------");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") --> " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") --> " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") --> " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") --> " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") --> " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") --> " + !(a >= b));

        System.out.println("------- Misc Operators with \"int\" type -------");

        System.out.println("\nCondition operator:");

        System.out.println(a + " > " + b + " ? " + a + " : " + b + " --> " + (a > b ? a : b));

        System.out.println("\nType cast operator:");

        byte bt = 5;
        short sh = 12000;
        char ch = '\u0032';
        long l = 23000000000000L;
        float f = 4.7f;
        double d = 1343242.124;
        boolean bool = false;
        String str = "String - reference type";
        Student stud = new Student("Nick Barysevich", 8.5);

        c = bt;
        System.out.println("int = byte: c = " + bt + " --> c = " + c);
        c = sh;
        System.out.println("int = short: c = " + sh + " --> c = " + c);
        c = ch;
        System.out.println("int = char: c = " + ch + " --> c = " + c);
        c = (int) l;
        System.out.println("int = long: c = (int) " + l + " --> c = " + c);
        c = (int) f;
        System.out.println("int = float: c = (int) " + f + " --> c = " + c);
        c = (int) d;
        System.out.println("int = double: c = (int) " + d + " --> c = " + c);
        //c = (byte) bool;
        System.out.println("int = boolean: c = (int) " + bool + " --> c = compile error");
        //c = (int) str;
        System.out.println("int = String: c = (int) " + str + " --> c = compile error");
        //c = (int) stud;
        System.out.println("int = Student: c = (int) " + stud + " --> c = compile error");
    }

    /** Tests long type. */
    public static void testLong() {
        long a = 2343243424234L;
        long b = 989823437274732L;
        long c;

        System.out.println("------- Arithmetical Operators with \"long\" type -------");

        //addition
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);

        //unary minus
        c = -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        a = 2343243424234L;
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 2343243424234L;
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 2343243424234L;
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 2343243424234L;
        System.out.println(a + "-- = " + a--);

        System.out.println("------- Bitwise Operators with \"long\" type -------");
        //bitwise and
        c = a & b;
        System.out.println(a + " & " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " & " + Long.toBinaryString(b) + " = " + Long.toBinaryString(c)+ "\n");
        //bitwise OR
        c = a | b;
        System.out.println(a + " | " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " | " + Long.toBinaryString(b) + " = " + Long.toBinaryString(c) + "\n");
        //bitwise xor
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " ^ " + Long.toBinaryString(b) + " = " + Long.toBinaryString(c) + "\n");
        //bitwise unary compliment
        c = ~a;
        System.out.println("~" + a + " = " + c);
        System.out.println("Binary form:");
        System.out.println("~" + Long.toBinaryString(a) + " = " + Long.toBinaryString(c) + "\n");
        //left shift
        c = a << 1;
        System.out.println(a + " << 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " << 1 = " + Long.toBinaryString(c) + "\n");
        //right shift
        a = -2343243424234L;
        c = a >> 1;
        System.out.println(a + " >> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " >> 1 = " + Long.toBinaryString(c) + "\n");
        //zero fill right shift
        a = 2343243424234L;
        c = a >>> 1;
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " >>> 1 = " + Long.toBinaryString(c) + "\n");
        //zero fill right shift
        a = -2343243424234L;
        c = a >>> 1;
        System.out.println(a + " >>> 1 = " + c);
        System.out.println("Binary form:");
        System.out.println(Long.toBinaryString(a) + " >>> 1 = " + Long.toBinaryString(c) + "\n");

        System.out.println("------- Assignment Operators with \"long\" type -------");

        a = -2343243424234L;
        System.out.println(c + " += " + a + " --> c = " + (c += a));
        System.out.println(c + " -= " + a + " --> c = " + (c -= a));
        System.out.println(c + " *= " + a + " --> c = " + (c *= a));
        System.out.println(c + " /= " + a + " --> c = " + (c /= a));
        System.out.println(c + " %= " + a + " --> c = " + (c %= a));
        System.out.println(c + " |= " + a + " --> c = " + (c |= a));
        System.out.println(c + " &= " + a + " --> c = " + (c &= a));
        System.out.println(c + " ^= " + a + " --> c = " + (c ^= a));
        c = -2343243424234L;
        System.out.println(c + " >>= " + a + " --> c = " + (c >>= a));
        System.out.println(c + " <<= " + a + " --> c = " + (c <<= a));
        System.out.println(c + " >>>= " + a + " --> c = " + (c >>>= a));

        System.out.println("------- Relational Operators with \"long\" type -------");

        //greater than
        System.out.println(a + " > " + b + " --> " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " --> " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " --> " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " --> " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " --> " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " --> " + (a != b));

        System.out.println("------- Logical Operations with \"long\" type -------");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") --> " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") --> " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") --> " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") --> " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") --> " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") --> " + !(a >= b));

        System.out.println("------- Misc Operators with \"long\" type -------");

        System.out.println("\nCondition operator:");

        System.out.println(a + " > " + b + " ? " + a + " : " + b + " --> " + (a > b ? a : b));

        System.out.println("\nType cast operator:");

        byte bt = 64;
        short sh = 21000;
        char ch = '\u2343';
        int i = 1244324432;
        float f = 534543.32f;
        double d = 2344.98;
        boolean bool = false;
        String str = "the best string ever";
        Student stud = new Student("Best student", 10);

        c = bt;
        System.out.println("long = byte: c = " + bt + " --> c = " + c);
        c = sh;
        System.out.println("long = short: c = " + sh + " --> c = " + c);
        c = ch;
        System.out.println("long = char: c = " + ch + " --> c = " + c);
        c = i;
        System.out.println("long = int: c = " + i + " --> c = " + c);
        c = (long) f;
        System.out.println("long = float: c = (long) " + f + " --> c = " + c);
        c = (long) d;
        System.out.println("long = double: c = (long) " + d + " --> c = " + c);
        //c = (byte) bool;
        System.out.println("long = boolean: c = (long) " + bool + " --> c = compile error");
        //c = (long) str;
        System.out.println("long = String: c = (long) " + str + " --> c = compile error");
        //c = (long) stud;
        System.out.println("long = Student: c = (long) " + stud + " --> c = compile error");
    }

    /** Tests float type. */
    public static void testFloat() {
        float a = 324.134f;
        float b = 123.543f;
        float c;

        System.out.println("------- Arithmetical Operators with \"float\" type -------");

        //addition
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);

        //unary minus
        c = -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        a = 324.134f;
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 324.134f;
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 324.134f;
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 324.134f;
        System.out.println(a + "-- = " + a--);

        System.out.println("------- Bitwise Operators with \"float\" type -------");

        System.out.println("\nThere are no bitwise operators that can be used with the \"float\" type.\n");

        System.out.println("------- Assignment Operators with \"float\" type -------");

        c = 9923.2332f;
        System.out.println(c + " += " + a + " --> c = " + (c += a));
        System.out.println(c + " -= " + a + " --> c = " + (c -= a));
        System.out.println(c + " *= " + a + " --> c = " + (c *= a));
        System.out.println(c + " /= " + a + " --> c = " + (c /= a));
        System.out.println(c + " %= " + a + " --> c = " + (c %= a));

        System.out.println("\nAssignment operators that is not allowed to use with \"float\" type:");
        System.out.println("|=;" +
                "\n&=" +
                "\n^=;" +
                "\n>>=;" +
                "\n<<=;" +
                "\n>>>=.");

        System.out.println("------- Relational Operators with \"float\" type -------");

        //greater than
        System.out.println(a + " > " + b + " --> " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " --> " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " --> " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " --> " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " --> " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " --> " + (a != b));

        System.out.println("------- Logical Operations with \"float\" type -------");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") --> " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") --> " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") --> " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") --> " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") --> " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") --> " + !(a >= b));

        System.out.println("------- Misc Operators with \"float\" type -------");

        System.out.println("\nCondition operator:");

        System.out.println(a + " > " + b + " ? " + a + " : " + b + " --> " + (a > b ? a : b));

        System.out.println("\nType cast operator:");

        byte bt = 123;
        short sh = -7650;
        char ch = '\u9763';
        int i = 234234324;
        long l = 6552543243242353L;
        double d = 1343242.124;
        boolean bool = false;
        String str = "worst string";
        Student stud = new Student("Worst student", 1);

        c = bt;
        System.out.println("float = byte: c = " + bt + " --> c = " + c);
        c = sh;
        System.out.println("float = short: c = " + sh + " --> c = " + c);
        c = ch;
        System.out.println("float = char: c = " + ch + " --> c = " + c);
        c = i;
        System.out.println("float = int: c = " + i + " --> c = " + c);
        c = l;
        System.out.println("float = long: c =  " + l + " --> c = " + c);
        c = (float) d;
        System.out.println("float = double: c = (float) " + d + " --> c = " + c);
        //c = (byte) bool;
        System.out.println("float = boolean: c = (float) " + bool + " --> c = compile error");
        //c = (float) str;
        System.out.println("float = String: c = (float) " + str + " --> c = compile error");
        //c = (float) stud;
        System.out.println("float = Student: c = (float) " + stud + " --> c = compile error");
    }

    /** Tests double type. */
    public static void testDouble() {
        double a = 3244.123;
        double b = 543.645;
        double c;

        System.out.println("------- Arithmetical Operators with \"double\" type -------");

        //addition
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);
        //subtraction
        c = a - b;
        System.out.println(a + " - " + b + " = " + c);
        //multiplication
        c = a * b;
        System.out.println(a + " * " + b + " = " + c);
        //division
        c = a / b;
        System.out.println(a + " / " + b + " = " + c);
        //modulus
        c = a % b;
        System.out.println(a + " % " + b + " = " + c);

        //unary minus
        c = -a;
        System.out.println("-" + a + " = " + c);
        //unary plus
        c = +a;
        System.out.println("+" + a + " = " + c);
        //prefix increment
        a = 3244.123;
        System.out.println("++" + a + " = " + ++a );
        //postfix increment
        a = 3244.123;
        System.out.println(a + "++ = " + a++);
        //prefix decrement
        a = 3244.123;
        System.out.println("--" + a + " = " + --a );
        //postfix decrement
        a = 3244.123;
        System.out.println(a + "-- = " + a--);

        System.out.println("------- Bitwise Operators with \"double\" type -------");

        System.out.println("\nThere are no bitwise operators that can be used with the \"double\" type.\n");

        System.out.println("------- Assignment Operators with \"double\" type -------");

        c = 2433.656;
        System.out.println(c + " += " + a + " --> c = " + (c += a));
        System.out.println(c + " -= " + a + " --> c = " + (c -= a));
        System.out.println(c + " *= " + a + " --> c = " + (c *= a));
        System.out.println(c + " /= " + a + " --> c = " + (c /= a));
        System.out.println(c + " %= " + a + " --> c = " + (c %= a));
        System.out.println("\nAssignment operators that is not allowed to use with \"double\" type:");
        System.out.println("|=;" +
                "\n&=" +
                "\n^=;" +
                "\n>>=;" +
                "\n<<=;" +
                "\n>>>=.");

        System.out.println("------- Relational Operators with \"double\" type -------");

        //greater than
        System.out.println(a + " > " + b + " --> " + (a > b));
        //greater than or equal to
        System.out.println(a + " >= " + b + " --> " + (a >= b));
        //less than
        System.out.println(a + " < " + b + " --> " + (a < b));
        //less than or equal to
        System.out.println(a + " <= " + b + " --> " + (a <= b));
        //equal to
        System.out.println(a + " == " + b + " --> " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " --> " + (a != b));

        System.out.println("------- Logical Operations with \"double\" type -------");

        //logical and
        System.out.println("(" + a + " > " + b + ") && (" + a + " > " + 0 + ") --> " + ((a > b) && (a > 0)));
        //bitwise logical and
        System.out.println("(" + a + " > " + b + ") & (" + a + " > " + 0 + ") --> " + ((a > b) & (a > 0)));
        //logical or
        System.out.println("(" + a + " >= " + b + ") || (" + a + " != " + 0 + ") --> " + ((a >= b) || (a != 0)));
        //bitwise logical or
        System.out.println("(" + a + " >= " + b + ") | (" + a + " != " + 0 + ") --> " + ((a >= b) | (a != 0)));
        //logical xor
        System.out.println("(" + a + " >= " + b + ") ^ (" + a + " != " + 0 + ") --> " + ((a >= b) ^ (a != 0)));
        //logical not
        System.out.println("!(" + a + " >= " + b + ") --> " + !(a >= b));

        System.out.println("------- Misc Operators with \"double\" type -------");

        System.out.println("\nCondition operator:");

        System.out.println(a + " > " + b + " ? " + a + " : " + b + " --> " + (a > b ? a : b));

        System.out.println("\nType cast operator:");

        byte bt = 5;
        short sh = 12000;
        char ch = '\u0032';
        int i = 123412332;
        long l = 23000000000000L;
        float f = 54.123f;
        boolean bool = false;
        String str = "middle string";
        Student stud = new Student("Not the best student", 7);

        c = bt;
        System.out.println("double = byte: c = " + bt + " --> c = " + c);
        c = sh;
        System.out.println("double = short: c = " + sh + " --> c = " + c);
        c = ch;
        System.out.println("double = char: c = " + ch + " --> c = " + c);
        c = i;
        System.out.println("double = int: c = " + i + " --> c = " + c);
        c = l;
        System.out.println("double = long: c =  " + l + " --> c = " + c);
        c = f;
        System.out.println("double = float: c =  " + f + " --> c = " + c);
        //c = (byte) bool;
        System.out.println("double = boolean: c = (double) " + bool + " --> c = compile error");
        //c = (double) str;
        System.out.println("double = String: c = (double) " + str + " --> c = compile error");
        //c = (double) stud;
        System.out.println("double = Student: c = (double) " + stud + " --> c = compile error");
    }

    /** Tests boolean type. */
    public static void testBoolean() {
        boolean a = true;
        boolean b = false;
        boolean c;

        System.out.println("------- Arithmetical operators with \"boolean\" type -------");

        System.out.println("\nNo arithmetical operators for \"boolean\" type");

        System.out.println("\n------- Bitwise operators with \"boolean\" type -------");
        //bitwise and
        c = a & b;
        System.out.println(a + " & " + b + " = " + c);
        //bitwise or
        c = a | b;
        System.out.println(a + " | " + b + " = " + c);
        //bitwise xor
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);

        System.out.println("Operators ~, <<, >>, >>> cannot be used with \"boolean\" type");

        System.out.println("\n------- Assignment operators with \"boolean\" type -------");

        System.out.println("There's only 3 assignment operators that could be used with \"boolean\" type:");
        System.out.println(c + " |= " + a + " --> c = " + (c |= a));
        System.out.println(c + " &= " + a + " --> c = " + (c &= a));
        System.out.println(c + " ^= " + a + " --> c = " + (c ^= a));

        System.out.println("------- Relational Operators with \"boolean\" type -------");

        //equal to
        System.out.println(a + " == " + b + " --> " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " --> " + (a != b));

        System.out.println("Operators >, >=, <, <= cannot be used with \"boolean\" type");

        System.out.println("------- Logical Operations with \"boolean\" type -------");

        //logical and
        c = a && b;
        System.out.println(a + " && " + a + " = " + c);
        //logical or
        c = a || b;
        System.out.println(a + " || " + a + " = " + c);
        //logical xor
        c = a && b;
        System.out.println(a + " ^ " + a + " = " + c);
        //logical not
        System.out.println("!" + a + " --> " + !a);

        System.out.println("------- Misc Operators with \"boolean\" type -------");

        System.out.println("\nConditional Operator:");

        System.out.println(c + " ? " + a + " : " + b + " --> " +(c ? a : b));

        System.out.println("\nType cast operator cannot be used with \"boolean\" type");

        System.out.println("A value of type boolean cannot be converted to any other type, nor can it be obtained from any other type.");
    }

    /** Tests String reference type*/
    public static void testString() {
        String a = "string A";
        String b = "string B";
        String c;

        System.out.println("------- Arithmetical Operators with \"String\" reference type -------");

        //addition
        c = a + b;
        System.out.println(a + " + " + b + " = " + c);

        System.out.println("\nArithmetical operators that cannot be used with the \"String\" reference type:");
        System.out.println("-;" +
                "\n*;" +
                "\n/;" +
                "\n%;" +
                "\n-a;" +
                "\n+a;" +
                "\n++a;" +
                "\na++;" +
                "\n--a;" +
                "\na--.");

        System.out.println("------- Bitwise Operators with \"String\" reference type -------");

        System.out.println("\nThere are no bitwise operators that can be used with the \"String\" reference type.\n");

        System.out.println("------- Assignment Operators with \"String\" reference type -------");

        System.out.println(c + " += " + a + " --> c = " + (c += a));

        System.out.println("\nAssignment operators that cannot be used with the \"String\" reference type:");
        System.out.println("-=;" +
                "\n*=;" +
                "\n/=;" +
                "\n%=;" +
                "\n|=;" +
                "\n&=;" +
                "\n^=;" +
                "\n>>=;" +
                "\n<<=;" +
                "\n>>>=.");

        System.out.println("------- Relational Operators with \"String\" reference type -------");

        //equal to
        System.out.println(a + " == " + b + " --> " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " --> " + (a != b));

        System.out.println("\nRelational operators that cannot be used with the \"String\" reference type:");
        System.out.println(">;" +
                "\n>=;" +
                "\n<;" +
                "\n<=.");

        System.out.println("------- Logical Operations with \"String\" reference type -------");

        //logical and
        System.out.println("(" + a + " == " + b + ") && (" + a + " != " + 0 + ") --> " + ((a == b) && (a != "0")));
        //bitwise logical and
        System.out.println("(" + a + " == " + b + ") & (" + a + " != " + 0 + ") --> " + ((a == b) & (a != "0")));
        //logical or
        System.out.println("(" + a + " == " + b + ") || (" + a + " != " + 0 + ") --> " + ((a == b) || (a != "0")));
        //bitwise logical or
        System.out.println("(" + a + " == " + b + ") | (" + a + " != " + 0 + ") --> " + ((a == b) | (a != "0")));
        //logical xor
        System.out.println("(" + a + " == " + b + ") ^ (" + a + " != " + 0 + ") --> " + ((a == b) ^ (a != "0")));
        //logical not
        System.out.println("!(" + a + " == " + b + ") --> " + !(a == b));

        System.out.println("------- Misc Operators with \"String\" reference type -------");

        System.out.println("\nCondition operator:");

        System.out.println(a + " == " + b + " ? " + a + " : " + b + " --> " + (a == b ? a : b));

        System.out.println("\nType cast operator:");

        byte bt = 5;
        short sh = 12000;
        char ch = '\u0032';
        int i = 145234432;
        long l = 23000000000000L;
        float f = 4.7f;
        double d = 1343242.124;
        boolean bool = false;
        Student stud = new Student("name", 10);

        //c = (String) bt;
        System.out.println("String = byte: c = (String) " + bt + " --> c = compile error");
        //c = (String) sh;
        System.out.println("String = short: c = (String) " + sh + " --> c = compile error");
        //c = (String) ch;
        System.out.println("String = char: c = (String) " + ch + " --> c = compile error");
        //c = (String) i;
        System.out.println("String = int: c = (String) " + i + " --> c = compile error");
        //c = (String) l;
        System.out.println("String = long: c = (String) " + l + " --> c = compile error");
        //c = (String) f;
        System.out.println("String = float: c = (String) " + f + " --> c = compile error");
        //c = (String) d;
        System.out.println("String = double: c = (String) " + d + " --> c = compile error");
        //c = (byte) bool;
        System.out.println("String = boolean: c = (String) " + bool + " --> c = compile error");
        //c = (String) stud;
        System.out.println("String = Student: c = (String) " + stud + " --> c = compile error");

        System.out.println("\ninstanceof operator:");

        bool = a instanceof String;
        System.out.println(a + " instanceof String --> " + bool);
        //bool = a instanceof Student;
        System.out.println(a + " instanceof Student --> compile error");

    }

    /** Tests Student reference type*/
    public static void testStudent() {
        Student a = new Student("student 1", 5);
        Student b = new Student("student 2", 8);
        Student c;

        System.out.println("------- Arithmetical Operators with \"Student\" reference type -------");

        System.out.println("\nArithmetical operators cannot be used with \"Student\" reference type\n");

        System.out.println("------- Assignment Operators with \"Student\" reference type -------");

        System.out.println("\nAssignment operators cannot be used with \"Student\" reference type\n");


        System.out.println("------- Relational Operators with \"Student\" reference type -------");

        System.out.println(a + " == " + b + " --> " + (a == b));
        //not equal to
        System.out.println(a + " != " + b + " --> " + (a != b));

        System.out.println("\nRelational operators that cannot be used with the \"Student\" reference type:");
        System.out.println(">;" +
                "\n>=;" +
                "\n<;" +
                "\n<=.");

        System.out.println("------- Logical Operations with \"Student\" reference type -------");

        //logical and
        System.out.println("(" + a + " == " + b + ") && (" + a + " != " + 0 + ") --> " + ((a == b) && (a != null)));
        //bitwise logical and
        System.out.println("(" + a + " == " + b + ") & (" + a + " != " + 0 + ") --> " + ((a == b) & (a != null)));
        //logical or
        System.out.println("(" + a + " == " + b + ") || (" + a + " != " + 0 + ") --> " + ((a == b) || (a != null)));
        //bitwise logical or
        System.out.println("(" + a + " != " + b + ") | (" + a + " == " + 0 + ") --> " + ((a != null) | (a == b)));
        //logical xor
        System.out.println("(" + a + " != " + b + ") ^ (" + a + " == " + 0 + ") --> " + ((a != null) ^ (a == b)));
        //logical not
        System.out.println("!(" + a + " == " + b + ") --> " + !(a == b));

        System.out.println("------- Misc Operators with \"Student\" type -------");

        System.out.println("\nCondition operator:");

        System.out.println(a + " == " + b + " ? " + a + " : " + b + " --> " + (a == b ? a : b));

        System.out.println("\nType cast operator:");

        byte bt = 5;
        short sh = 12000;
        char ch = '\u0032';
        int i = 324234324;
        long l = 23000000000000L;
        float f = 4.7f;
        double d = 1343242.124;
        boolean bool = false;
        String str = "String - the most popular class";

        //c = (Student) bt;
        System.out.println("Student = byte: c = (Student) " + bt + " --> c = compile error");
        //c = (Student) sh;
        System.out.println("Student = short: c = (Student) " + sh + " --> c = compile error");
        //c = (Student) ch;
        System.out.println("Student = char: c = (Student) " + ch + " --> c = compile error");
        //c = (Student) i;
        System.out.println("Student = int: c = (Student) " + i + " --> c = compile error");
        //c = (Student) l;
        System.out.println("Student = long: c = (Student) " + l + " --> c = compile error");
        //c = (Student) f;
        System.out.println("Student = float: c = (Student) " + f + " --> c = compile error");
        //c = (Student) d;
        System.out.println("Student = double: c = (Student) " + d + " --> c = compile error");
        //c = (byte) bool;
        System.out.println("Student = boolean: c = (Student) " + bool + " --> c = compile error");
        //c = (Student) str;
        System.out.println("Student = String: c = (Student) " + str + " --> c = compile error");

        System.out.println("\ninstanceof operator:");

        bool = a instanceof Student;
        System.out.println(a + " instanceof Student --> " + bool);
        //bool = a instanceof String;
        System.out.println(a + " instanceof String --> compile error");

    }

}