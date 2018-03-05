/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganymedesoft.apsms.util;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author UmAir
 */
public class AppUtil {

    public static boolean isEmptyOrNull(String str) {
        return (str == null || "".equals(str.trim()));
    }

    public static String getSafeStr(String s) {
        if (s == null || s.trim().length() == 0) {
            return "";
        }
        return s.trim();
    }

    public static boolean isNotEmpty(String value) {
        return value != null && value.trim().length() > 0;
    }

    public static boolean isEmptyCollection(Collection<?> value) {
        return value == null || value.isEmpty();
    }

    public static boolean isNullOrEmpty(final Map< ?, ?> m) {
        return m == null || m.isEmpty();
    }

    public static boolean isNullOrEmpty(Integer value) {
        return value == null || value == 0;
    }

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean isNotNull(Object obj) {
        return obj != null;
    }

    public static boolean isNotNullAndEmpty(Integer value) {
        return value != null && value > 0;
    }

    public static boolean isTrue(Boolean value) {
        return value != null && value == true;
    }

    public static boolean isNotTrue(Boolean value) {
        return value != null && value == false;
    }

    public static boolean isNotEmptyCollection(Collection<?> value) {
        return value != null && value.size() > 0;
    }
}
