package com.devsenior.students.emolina.exception;

public class CursoNoEncontrado extends RuntimeException {
    public CursoNoEncontrado() {
        super("El curso no existe");
    }
}
