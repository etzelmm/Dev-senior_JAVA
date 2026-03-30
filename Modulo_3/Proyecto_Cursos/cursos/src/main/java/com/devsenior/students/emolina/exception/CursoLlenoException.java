package com.devsenior.students.emolina.exception;

public class CursoLlenoException extends RuntimeException{
    public CursoLlenoException() {
        super("EL curso no cuenta con cupos");
    }
}
