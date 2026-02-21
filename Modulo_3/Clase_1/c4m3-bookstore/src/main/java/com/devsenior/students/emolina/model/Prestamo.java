package com.devsenior.students.emolina.model;

import java.time.LocalDate;

public class Prestamo {
    private Lector usuario;
    private Copia copia;
    private LocalDate fechaPrestamo;
    
    public Lector getUsuario() {
        return usuario;
    }
    public void setUsuario(Lector usuario) {
        this.usuario = usuario;
    }
    public Copia getCopia() {
        return copia;
    }
    public void setCopia(Copia copia) {
        this.copia = copia;
    }
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    
}
