package com.devsenior.students.emolina.service;

import java.util.ArrayList;
import java.util.List;

import com.devsenior.students.emolina.exception.CursosNull;
import com.devsenior.students.emolina.model.Curso;

public class GestionCursos {
    private List<Curso> cursos = new ArrayList<>();

    public void crearCurso(String codCurso, String nombre, Integer cupos) {
        cursos.add(new Curso(codCurso, nombre, cupos));
    }

    public List getCursos() throws CursosNull {
        if (cursos.isEmpty()) {
            throw new CursosNull();
        }
        return cursos;
    }

    public Curso buscarCurso(String noombre) {
        for(int i = 0; i <= cursos.size(); i++ ) {
            
        }
    }


}
