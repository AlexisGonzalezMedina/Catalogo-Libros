package com.ids.catalogo.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class LibroNotFoundException {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleAllErrors(Exception ex) {
        Map<String, String> error = new HashMap<>();
        error.put("mensaje", "Libro no encontrado o error de solicitud");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}
