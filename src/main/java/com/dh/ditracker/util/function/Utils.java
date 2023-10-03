package com.dh.ditracker.util.function;

public class Utils {
    public static boolean isNull(Object value) {
        return value == null;
    }

    public static <T> T nvl(T value, T defaultValue) {
        return Utils.isNull(value) ? defaultValue : value;
    }
}
