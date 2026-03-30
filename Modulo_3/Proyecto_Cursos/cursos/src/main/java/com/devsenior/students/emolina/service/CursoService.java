package com.devsenior.students.emolina.service;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.*;

import com.devsenior.students.emolina.exception.CursoNoEncontradoException;
import com.devsenior.students.emolina.model.Curso;

public class CursoService {
    private static final Logger logger = LogManager.getLogger(CursoService.class);

    private List<Curso> cursos;

    public CursoService () {
        this.cursos = new ArrayList<>();
    }

    //agregar un curso
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        logger.info("curso agregado: " + curso.getNombre());
    }

    //listar todos los cursos 
    public List<Curso> listarCursos() {
        return cursos;
    }

    //buscar curso por codigo
    public Curso buscarCursoPorCodigo(String codCurso) throws CursoNoEncontradoException {

        for (Curso curso : cursos) {
            if (curso.getCodCurso().equals(codCurso)) {
                return curso;
            }
        }

        logger.warn("Curso no encontrado " + codCurso);
        throw new CursoNoEncontradoException("curso con el codigo: " + codCurso + " no encontrado");
    }

    



}
