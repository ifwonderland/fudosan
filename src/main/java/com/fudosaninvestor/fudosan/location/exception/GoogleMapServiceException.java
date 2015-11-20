package com.fudosaninvestor.fudosan.location.exception;

/**
 * Created by Shaochen Huang on 11/8/15.
 */
public class GoogleMapServiceException extends Exception {

    public GoogleMapServiceException(Throwable cause) {
        super("Google map API call service error. ", cause);
    }
}
