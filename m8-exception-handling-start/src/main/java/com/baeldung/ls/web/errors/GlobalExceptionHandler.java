package com.baeldung.ls.web.errors;


import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

// cu @Controllerdvice folosim suportul spring pt a face aceasta clasa un global exception handler
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    // ResponseEntityExceptionHandler ne ofera niste default-uri ajutatoare

    // It also offers a number of protected methods to allow us customize the default behavior

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<String> handleEmptyResultDataAccessException(EmptyResultDataAccessException ex){
        return new ResponseEntity<>("Exception retrieving data: "+ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    /*
    Maparea fiecarei exceptii e un proces lung. Pt simplificare, putem sa mapam mai multe exceptii/familii de exceptii in acelasi mod

    De ex, in cazul nostru putem gestiona parintele exceptiei EmptyResultDataAccessException, adica DataRetrievalFailureException


    *  */
}
