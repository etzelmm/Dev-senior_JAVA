package com.devsenior.students.emolina.model;

public class Lector {
    private String nombre;
    private Integer diasMulta;
    private Prestamo[] pretsmos;
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getDiasMulta() {
        return diasMulta;
    }
    public void setDiasMulta(Integer diasMulta) {
        this.diasMulta = diasMulta;
    }
    public Prestamo[] getPretsmos() {
        return pretsmos;
    }
    public void setPretsmos(Prestamo[] pretsmos) {
        this.pretsmos = pretsmos;
    }
    
}
