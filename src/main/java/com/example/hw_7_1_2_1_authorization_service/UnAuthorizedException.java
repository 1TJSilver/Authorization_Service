package com.example.hw_7_1_2_1_authorization_service;

public class UnAuthorizedException extends RuntimeException{
    public UnAuthorizedException(String message){
        super(message);
    }
}