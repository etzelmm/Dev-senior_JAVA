package com.devsenior.students.emolina.model;

public class Libro {
    private String nombre;
    private String editorial;
    private Integer anio;
    private TipoLibro tipo;
    private Autor autor;
    private Copia[] numeroCopias;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public Integer getAnio() {
        return anio;
    }
    public void setAnio(Integer anio) {
        this.anio = anio;
    }
    public TipoLibro getTipo() {
        return tipo;
    }
    public void setTipo(TipoLibro tipo) {
        this.tipo = tipo;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public Copia[] getNumeroCopias() {
        return numeroCopias;
    }
    public void setNumeroCopias(Copia[] numeroCopias) {
        this.numeroCopias = numeroCopias;
    }
    
}
