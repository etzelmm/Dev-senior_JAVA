package com.devsenior.students.emolina.exception;

public class CursoLlenoException extends RuntimeException{
    public CursoLlenoException(String mensaje) {
        super(mensaje);
    }

    public CursoLlenoException(String message, Throwable cause) {
        super(message, cause);
    }
}
