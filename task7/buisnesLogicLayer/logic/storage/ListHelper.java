/*
 * @(#)ListHelper.java          1.0 2018
 *
 * Copyright 1995-1999 Sun Microsystems, Inc.
 * All rights reserved. Used by permission
 *
 * Last modified: 19.06.18 0:46
 */

package com.nickshock.task7.buisnesLogicLayer.logic.storage;

/**
 * Util class that helps to do some operations on lists.
 *
 * @author Barysevich Nikalai
 * @version 1.2 16 June 2018
 */
public class ListHelper {

    /**
     * Represents list into string form.
     *
     * @param list list to be represented to string.
     * @return list into string form.
     */
    public static String listToString(ListBehavior<?> list) {
        if (list == null) {
            return "null";
        }

        if (list.isEmpty()) {
            return "empty";
        }

        StringBuilder builder = new StringBuilder();
        builder.append("{\n");
        for (int i = 0; i < list.getSize(); i++) {
            builder.append(list.getElement(i));
            builder.append("\n");
        }
        builder.append("}");

        return builder.toString();
    }

}
