/*
 * @(#)Student.java      1.2 18/05/21
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission.
 */

package com.nickshock.task1;

/**
 * Creates an student with name and mark.
 *
 * @version          1.2 21 May 2018
 * @author           Barysevich Nikalai
 */

public class Student {

    public String name;
    public double mark;

    /**
     * Creates a student with name and mark.
     *
     * @param name student's name
     * @param mark student's mark
     */
    public Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + ": " + mark;
    }
}
