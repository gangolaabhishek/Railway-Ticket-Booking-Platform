package com.railway.common.util;

import java.time.LocalDateTime;

public class DateUtil {

    private DateUtil() {
        // Private constructor to prevent instantiation
    }

     public static LocalDateTime now() {
        return LocalDateTime.now();
    }
    
}
