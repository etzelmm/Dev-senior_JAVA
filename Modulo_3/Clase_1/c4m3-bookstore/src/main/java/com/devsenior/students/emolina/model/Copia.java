package com.devsenior.students.emolina.model;

public class Copia {
    private Integer id;
    private Estado estado;
    private Libro libro;

    public Libro getLibro() {
        return libro;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
