package com.borala.api.src.exceptions;

public class UserConflictException extends RuntimeException {
    public UserConflictException(String message){
        super(message);
    }
}


