package com.transportation.metrobas.exception;

public class EmailAlreadyExist extends RuntimeException{
    public EmailAlreadyExist(String message) {
        super(message);
    }
}
