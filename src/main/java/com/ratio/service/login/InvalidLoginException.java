package com.ratio.service.login;

/**
 * Created by user on 10/26/14.
 */
public class InvalidLoginException extends RuntimeException {
    public InvalidLoginException(String message) {
        super(message);
    }
}
