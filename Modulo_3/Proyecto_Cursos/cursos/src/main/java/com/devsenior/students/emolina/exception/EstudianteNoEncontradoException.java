package com.devsenior.students.emolina.exception;

public class EstudianteNoEncontradoException extends Exception {
    public EstudianteNoEncontradoException(String mensaje) {
        super(mensaje);
    }
    public EstudianteNoEncontradoException(String mensaje, Throwable causa ) {
        super(mensaje, causa);
    }
}
