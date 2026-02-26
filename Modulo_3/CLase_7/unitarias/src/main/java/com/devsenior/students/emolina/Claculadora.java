package com.devsenior.students.emolina;

public class Claculadora {
    
    public int sumar (int a, int b) {
        return a + b;
    }

    public int restar (int a, int b) {
        return a - b;
    }

    public int multiplicar (int a, int b) {
        return a * b;
    }

    public int dividir (int a, int b) {
        
        if (b == 0) {
            throw new IllegalArgumentException("No es posible dividir por 0");
        }
        return a/b;
    }
}
