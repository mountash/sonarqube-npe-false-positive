package com.example.sonar.util;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/**
 * zolotov on 28.02.2018.
 */
public class Util {

    private Util(){}

    public static boolean isEmpty(final Object obj) {
        if (obj == null) {
            return true;
        } else if (obj instanceof Collection<?>) {
            return ((Collection<?>) obj).isEmpty();
        } else if (obj instanceof Map<?, ?>) {
            return ((Map<?, ?>) obj).isEmpty();
        } else if (obj.getClass().isArray()) {
            return Array.getLength(obj) == 0;
        } else {
            return false;
        }
    }

    public static boolean isNotEmpty(final Object obj) {
        return !isEmpty(obj);
    }
}
