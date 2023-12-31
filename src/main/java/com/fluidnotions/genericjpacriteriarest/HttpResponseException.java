package com.fluidnotions.genericjpacriteriarest;

import org.springframework.http.HttpStatus;

public class HttpResponseException extends Exception {
    private final String message;
    private final HttpStatus httpStatus;

    public HttpResponseException(String message, HttpStatus httpStatus) {
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

