package com.devsenior.students.emolina;


public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        try {
            inventario.agregarProducto("Jabon", 5);
            inventario.agregarProducto("Papel", 15);
            inventario.agregarProducto("Cuaderno", 8);
        } catch (CantidadInvalidaException e) {
            System.out.println(e.getMessage());
        }

        try {
            Integer cantidad = inventario.buscarProducto("Papel");
            System.out.println("La cantidad del Papel que hay es de: " + cantidad);
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            inventario.actualizarCantidad("Papel", 0);
        } catch (CantidadInvalidaException e) {
            System.out.println(e.getMessage());
        }

        try {
            Integer cantidad = inventario.buscarProducto("Papel");
            System.out.println("La cantidad del Papel que hay es de: " + cantidad);
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        try {
            inventario.eliminarProducto("Papel");
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }

        
        try {
            Integer cantidad = inventario.buscarProducto("Papel");
            System.out.println("La cantidad del Papel que hay es de: " + cantidad);
        } catch (ProductoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }


        

    }



}