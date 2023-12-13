package com.altimetrik.tms.exception;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> handleMethodInvalidException(
            ConstraintViolationException ex, WebRequest wq
            ){
        StringBuilder sb=new StringBuilder();
        sb.append(ex.getLocalizedMessage());
        sb.append(wq.getContextPath());
        sb.append(wq.getParameter("id"));
        return new ResponseEntity<String>(sb.toString(), HttpStatus.BAD_REQUEST);

    }
}
