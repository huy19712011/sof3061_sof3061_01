package org.example.sof3061_sof3061_01.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message) {

        super(message);
    }
}
