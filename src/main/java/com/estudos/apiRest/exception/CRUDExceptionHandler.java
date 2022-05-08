package com.estudos.apiRest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class CRUDExceptionHandler {

    @ExceptionHandler(PersonNotFoundException.class)
    public ResponseEntity<ExceptionResponse> handlePersonNotFoundException(Exception exception, WebRequest request) {
        ExceptionResponse e = new ExceptionResponse(exception.getMessage(), request.getDescription(false));

        return new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
    }
}
