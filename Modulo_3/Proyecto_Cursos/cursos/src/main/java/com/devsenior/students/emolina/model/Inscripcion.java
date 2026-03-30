package com.devsenior.students.emolina.model;

import java.time.LocalDate;

public class Inscripcion {
    private Estudiante estadiante;
    private Curso curso;
    private LocalDate fechaInscripcion;

    public Inscripcion(Estudiante estadiante, Curso curso) {
        this.estadiante = estadiante;
        this.curso = curso;
        this.fechaInscripcion = LocalDate.now();
    }

    public Estudiante getEstadiante() {
        return estadiante;
    }

    public void setEstadiante(Estudiante estadiante) {
        this.estadiante = estadiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    @Override
    public String toString() {
        return "inscripcion{" + 
        "Estudiante=" + estadiante +
        ", Curso=" + curso +
        ", Fecha de Incripcion=" + fechaInscripcion +
        "}";
    }
    
}
