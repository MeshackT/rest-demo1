/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thinkconstructive.rest_demo1.exception;

import org.springframework.http.HttpStatus;

/**
 *
 * @author Templeton
 */
public class CloudVendorException {
    private final String message;
    private final Throwable cause;
    private final HttpStatus httpStatus;

    public CloudVendorException(String message, Throwable cause, HttpStatus httpStatus) {
        this.message = message;
        this.cause = cause;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getCause() {
        return cause;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
    
  
}
