package com.posgraduacao.backendproject2.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("User "+id+" Not Found");
    }
    
}
