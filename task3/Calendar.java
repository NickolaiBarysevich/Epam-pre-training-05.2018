/*
 * @(#)Calendar.java          1.5 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 17.06.18 0:52
 */

package com.nickshock.task3;

/**
 * This class get date and returns the date that goes after.
 *
 * @author Barysevich Nikalai
 * @version 1.5 17 June 2018
 */
public class Calendar {

    public static final int MONTH_WITH_31_DAYS = 31;
    public static final int MONTH_WITH_30_DAYS = 30;
    public static final int FEBRUARY_DAYS_NORMAL = 28;
    public static final int FEBRUARY_DAYS_LEAP = 29;
    public static final int MONTHS = 12;

    /**
     * Counts the next date.
     *
     * @param day   day of gotten date.
     * @param month month of gotten date.
     * @param year  year of gotten date.
     * @return the next date.
     */
    public static String getNextDate(int day, int month, int year) {
        String result = "invalid date";

        if (day > MONTH_WITH_31_DAYS || day < 1 || month > MONTHS || month < 1 || year < 1) {
            return result;
        }

        boolean currentYear = isLeapYear(year);
        int maxDay;
        switch (month) {
            case 2:
                if (!currentYear) maxDay = FEBRUARY_DAYS_NORMAL;
                else maxDay = FEBRUARY_DAYS_LEAP;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = MONTH_WITH_30_DAYS;
                break;
            default:
                maxDay = MONTH_WITH_31_DAYS;
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

    /**
     * Defines whether the gotten year is leap-year.
     *
     * @param year year to be checked.
     * @return true if year is leap.
     */
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
