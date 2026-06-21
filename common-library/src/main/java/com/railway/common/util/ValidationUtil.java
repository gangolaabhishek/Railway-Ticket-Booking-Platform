package com.railway.common.util;

public final class ValidationUtil {

    private ValidationUtil() {
        // Private constructor to prevent instantiation
    }

    public static boolean isValidMobile(String mobile){
        return mobile != null && mobile.matches("\\d{10}");
    }
    
}
