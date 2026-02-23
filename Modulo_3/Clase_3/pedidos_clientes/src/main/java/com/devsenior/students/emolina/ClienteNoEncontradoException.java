package com.devsenior.students.emolina;

public class ClienteNoEncontradoException extends RuntimeException {
    public ClienteNoEncontradoException (String mensaje) {
        super(mensaje);
    }
}
