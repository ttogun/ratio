package com.ratio.service;

import java.net.UnknownHostException;

/**
 * Created by user on 10/11/14.
 */
public class MongoConfigurationException extends RuntimeException {
    public MongoConfigurationException(String message, Exception ex) {
        super(message, ex);
    }
}
