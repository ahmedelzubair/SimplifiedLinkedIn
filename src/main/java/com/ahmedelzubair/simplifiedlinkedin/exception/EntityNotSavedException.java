package com.ahmedelzubair.simplifiedlinkedin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EntityNotSavedException extends RuntimeException {

    public EntityNotSavedException(String message) {
        super(message);
    }
}
