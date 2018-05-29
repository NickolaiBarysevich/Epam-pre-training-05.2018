/*
 * @(#)Calendar.java            1.3 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 29.05.18 16:33 
 */

package com.nickshock.task3;

/**
 * This class get date and returns the date that goes after
 *
 * @version          1.3 29 May 2018
 * @author           Barysevich Nikalai
 */

public class Calendar {

    public static final int DAYS_31 = 31;
    public static final int DAYS_30 = 30;
    public static final int FEBRUARY_DAYS_NORMAL = 28;
    public static final int FEBRUARY_DAYS_LEAP = 29;
    public static final int MONTHS = 12;

    /** Counts the next date*/
    public static String getNextDate(int day, int month, int year) {
        String result = "invalid date";
        if (day > DAYS_31 || day < 1 || month > MONTHS || month < 1 || year < 1) {
            return result;
        }

        boolean currentYear = isLeapYear(year);

        int maxDay;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = DAYS_30;
                break;
            case 2:
                maxDay = FEBRUARY_DAYS_NORMAL;
                if (currentYear) maxDay = FEBRUARY_DAYS_LEAP;
                break;
            default:
                maxDay = DAYS_31;
        }

        if (day > maxDay) {
            result = "invalid date";
            return result;
        }

        day += 1;
        if (day > maxDay) {
            day = 1;
            month += 1;
            if (month > MONTHS) {
                month = 1;
                year += 1;
            }
        }

        result = day + "." + month + "." + year;

        return result;
    }

    public static boolean isLeapYear(int year) {
        boolean flag = false;

        if (year % 4 == 0 & year % 100 == 0 & year % 400 == 0) flag = true;
        else if (year % 4 == 0 & year % 100 == 0) ;
        else if (year % 4 == 0) flag = true;

        return flag;
    }
}
