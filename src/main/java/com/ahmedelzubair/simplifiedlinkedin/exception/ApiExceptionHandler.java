package com.ahmedelzubair.simplifiedlinkedin.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {EntityNotSavedException.class})
    public ResponseEntity<Object> handleEntityNotSavedException(EntityNotSavedException ex) {
        ApiExceptionResponse apiExceptionResponse =
                new ApiExceptionResponse(ex.getMessage(), HttpStatus.BAD_REQUEST.value(), ex);

        return new ResponseEntity<>(apiExceptionResponse, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(value = {EntityNotFoundException.class})
    public ResponseEntity<Object> handleNotFoundException(EntityNotFoundException ex) {
        ApiExceptionResponse apiExceptionResponse =
                new ApiExceptionResponse(ex.getMessage(), HttpStatus.NOT_FOUND.value(), ex);

        return new ResponseEntity<>(apiExceptionResponse, HttpStatus.NOT_FOUND);
    }
}