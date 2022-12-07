package com.example.hw_7_1_2_1_authorization_service.Exceptions;

public class UnAuthorizedException extends RuntimeException{
    public UnAuthorizedException(String message){
        super(message);
    }
}