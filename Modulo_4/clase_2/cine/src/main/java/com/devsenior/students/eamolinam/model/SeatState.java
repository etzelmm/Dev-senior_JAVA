package com.devsenior.students.eamolinam.model;

public enum SeatState {
    AVIABLE("Libre"), 
    RESERVED("Reservado");

    private final String descripcion;

    SeatState(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
