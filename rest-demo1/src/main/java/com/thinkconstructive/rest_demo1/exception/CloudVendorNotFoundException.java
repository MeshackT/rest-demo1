package com.thinkconstructive.rest_demo1.exception;

public class CloudVendorNotFoundException extends RuntimeException{
    
//    message
    public CloudVendorNotFoundException(String message){
        super(message);
    }
   
//    message and cause
    public CloudVendorNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}
