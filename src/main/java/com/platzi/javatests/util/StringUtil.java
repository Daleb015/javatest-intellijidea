package com.platzi.javatests.util;

public class StringUtil {

    public static String repeat(String str, int times) {

        StringBuilder result = new StringBuilder();

        if (times < 0) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < times; i++) {
            result.append(str);
        }

        return result.toString();
    }

    public static Boolean isEmpty(String str) {

        return !(str != null && !str.trim().isEmpty());

    }

}
