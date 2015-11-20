package com.fudosaninvestor.fudosan.util;

import java.util.regex.Pattern;

/**
 * Created by Shaochen Huang on 11/8/15.
 */
public class LocationUtils {

    private final static Pattern VALID_ZIP_PATTERN = Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$");


    public static boolean isValidZipCode(String zipCode) {
        return VALID_ZIP_PATTERN.matcher(zipCode).matches();
    }

}
