package com.sls.web.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author sls
 **/
public class SuccessException extends RuntimeException {
    public SuccessException(String message) {
        super(message);
    }
}

@RestControllerAdvice
class DemoExceptionHandler {
    @ExceptionHandler(SuccessException.class)
    public ResponseEntity succ(SuccessException e) {
        return ResponseEntity.ok(e.getMessage());
    }
}
