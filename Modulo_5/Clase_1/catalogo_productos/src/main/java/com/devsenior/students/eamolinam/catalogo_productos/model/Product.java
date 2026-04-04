package com.devsenior.students.eamolinam.catalogo_productos.model;

public class Product {
    private Long id;
    private String nombre;
    private double precio;

    public Product(){
    }

    public Product(Long id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("Producto = [ID: %d; Nombre: %s Precio: %.2f}", id, nombre, precio );
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
