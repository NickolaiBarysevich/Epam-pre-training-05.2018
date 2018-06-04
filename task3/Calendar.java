/*
 * @(#)Calendar.java                  1.4 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 04.06.18 23:52
 */

package com.nickshock.task3;

/**
 * This class get date and returns the date that goes after
 *
 * @author Barysevich Nikalai
 * @version 1.4 4 June 2018
 */

public class Calendar {

    public static final int DAYS_31 = 31;
    public static final int DAYS_30 = 30;
    public static final int FEBRUARY_DAYS_NORMAL = 28;
    public static final int FEBRUARY_DAYS_LEAP = 29;
    public static final int MONTHS = 12;

    /**
     * Counts the next date
     */
    public static String getNextDate(int day, int month, int year) {
        String result = "invalid date";
        if (day > DAYS_31 || day < 1 || month > MONTHS || month < 1 || year < 1) {
            return result;
        }

        boolean currentYear = isLeapYear(year);

        int maxDay;
        switch (month) {
            case 2:
                maxDay = FEBRUARY_DAYS_NORMAL;
                if (currentYear) maxDay = FEBRUARY_DAYS_LEAP;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = DAYS_30;
                break;
            default:
                maxDay = DAYS_31;
        }

        if (day > maxDay) {
            return result;
        }

        day++;
        if (day > maxDay) {
            day = 1;
            month++;
            if (month > MONTHS) {
                month = 1;
                year++;
            }
        }

        result = day + "." + month + "." + year;

        return result;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
