package com.devsenior.students.eamolinam.model;

public class Plato {
    private String nombre;
    private Double precio;
    private Integer calorias;
    private Categorias categoria;
    private Stand stand;

    public Plato(String nombre, Double precio, Integer calorias, Categorias categoria, Stand stand) {
        this.nombre = nombre;
        this.precio = precio;
        this.calorias = calorias;
        this.categoria = categoria;
        this.stand = stand;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    @Override
    public String toString() {
        return "El plato: " + nombre + 
        "\nCuesta: " + precio +
        "\nCalorias: " + calorias +
        "\nCategoria: " + categoria +
        "\nStand: " + stand;
    }
    
}
