package com.devsenior.students.emolina.model;

public class Curso {
    private String codCurso;
    private String nombre;
    private Integer cupos;

    public Curso(String codCurso, String nombre, Integer cupos) {
        this.codCurso = codCurso;
        this.nombre = nombre;
        this.cupos = cupos;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCupos() {
        return cupos;
    }

    public void setCupos(Integer cupos) {
        this.cupos = cupos;
    }
    
    public String toString() {
    return "Curso{" +
            "codigo='" + codCurso + '\'' +
            ", nombre='" + nombre +
            ", cupos=" + cupos +
            '}';
    }
    
}
