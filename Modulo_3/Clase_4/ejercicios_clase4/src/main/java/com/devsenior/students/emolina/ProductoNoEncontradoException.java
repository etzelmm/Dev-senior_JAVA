package com.devsenior.students.emolina;

public class ProductoNoEncontradoException extends RuntimeException {
    
    public ProductoNoEncontradoException (String mensaje) {
        super(mensaje);
    }
}
