package com.fudosaninvestor.service.location;

/**
 * Created by Shaochen Huang on 11/8/15.
 */
public class NoMatchingAddressException extends Exception {

    public NoMatchingAddressException(String address) {
        super("No matching found for address: "+address);
    }
}
