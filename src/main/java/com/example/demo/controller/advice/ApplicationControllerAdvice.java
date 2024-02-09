package com.example.demo.controller.advice;

import com.example.demo.exception.AccommodationException;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestControllerAdvice
public class ApplicationControllerAdvice {


@ResponseStatus(NOT_FOUND)
@ExceptionHandler(AccommodationException.class)
    public ProblemDetail accommodationNotFoundException(AccommodationException accommodationException) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(NOT_FOUND);
        problemDetail.setTitle("Not found");
        problemDetail.setDetail(accommodationException.getMessage());
        return problemDetail;
    }
}