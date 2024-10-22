package com.onceagain.bboteca.common.http_errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.onceagain.bboteca.domain.exception.ResourceNotFoundException;

@ControllerAdvice
public class ApiExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler({
            ResourceNotFoundException.class
    })
    @ResponseBody
    public ErrorMessage notFoundRequest(ResourceNotFoundException exception) {
        return new ErrorMessage(exception, HttpStatus.NOT_FOUND.value());
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ErrorMessage handleGeneralException(Exception exception) {
        return new ErrorMessage(exception, HttpStatus.INTERNAL_SERVER_ERROR.value());
    }
}
