package com.devsenior.students.emolina;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ClaculadoraTest {
    
    @Test
    void testSuma() {
        Claculadora cal = new Claculadora();
        assertEquals(5, cal.sumar(2, 3));
    }

    @Test
    void testResta() {
        Claculadora cal = new Claculadora();
        assertEquals(6, cal.restar(8, 2));
    }
    
    @Test
    void testMultplica() {
        Claculadora cal = new Claculadora();
        assertEquals(6, cal.multiplicar(2, 3));
    }

    @Test
    void testDivide() {
        Claculadora cal = new Claculadora();
        assertEquals(3, cal.dividir(6, 2));
    }

    @Test
    void testDividePorCero() {
        Claculadora cal = new Claculadora();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cal.dividir(6, 0);
        });
        assertEquals("No es posible dividir por 0" , exception.getMessage());
    }
}
