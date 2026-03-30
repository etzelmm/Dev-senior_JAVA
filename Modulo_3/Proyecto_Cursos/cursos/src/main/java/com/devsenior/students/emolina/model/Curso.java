package com.devsenior.students.emolina.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codCurso;
    private String nombre;
    private Integer cupos;
    private List <Estudiante> estudiantesInscritos;

    public Curso(String codCurso, String nombre, Integer cupos) {
        this.codCurso = codCurso;
        this.nombre = nombre;
        this.cupos = cupos;
        this.estudiantesInscritos = new ArrayList<>();
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
    
    public List<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(List<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantesInscritos.add(estudiante);
    }

    public boolean cursoLLeno(){
        if(estudiantesInscritos.size() >= cupos){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
    return "Curso{" +
            "codigo='" + codCurso + '\'' +
            ", nombre='" + nombre +
            ", cupos=" + cupos +
            '}';
    }
    
}
