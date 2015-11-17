package com.fudosaninvestor.fudosan.location;

/**
 * Multiple address matching given input exception.
 * <p/>
 * Created by Shaochen Huang on 11/8/15.
 */
public class AmbiguousAddressException extends Exception {
    public AmbiguousAddressException(String message) {
        super(message);
    }
}
