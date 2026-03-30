package com.devsenior.students.emolina.service;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.*;

import com.devsenior.students.emolina.exception.CursoLlenoException;
import com.devsenior.students.emolina.exception.EstudianteNoEncontradoException;
import com.devsenior.students.emolina.model.Curso;
import com.devsenior.students.emolina.model.Estudiante;
import com.devsenior.students.emolina.model.Inscripcion;

public class InscripcionService {
    private static final Logger logger = LogManager.getLogger(InscripcionService.class);

    private List<Inscripcion> inscripciones;

    public InscripcionService() {
        this.inscripciones = new ArrayList<>();
    }

    public void inscribirEstudiante(Curso curso, Estudiante estudiante) {
        if (curso.cursoLLeno()) {
            logger.error("Intento de inscrpcion fallido: curso {} lleno", curso.getNombre());
            throw new CursoLlenoException("El curso: "+ curso.getNombre() +" esta lleno");

        }

        curso.agregarEstudiante(estudiante);
        estudiante.agregarCurso(curso);
        Inscripcion inscripcion = new Inscripcion(estudiante, curso);
        inscripciones.add(inscripcion);
        logger.info("Se agrega estudiante {} al curso {}", estudiante.getNombre(), curso.getNombre());
    }

    public List<Curso> inscripcionesPorEstudiante(Estudiante estudiante) throws EstudianteNoEncontradoException {
        for(Inscripcion inscripcion : inscripciones) {
            if(inscripcion.getEstadiante().getId().equals(estudiante.getId())) {
                logger.info("se ha encontrado el estudiante {}, sus cursos son: {}", estudiante.getNombre(), estudiante.getCursosInscritos());
                if (estudiante.getCursosInscritos().isEmpty()) {
                    logger.warn("El estudiante no tiene cursos inscritos");
                }
                return inscripcion.getEstadiante().getCursosInscritos();
            }
        }
        logger.error("Intento de buisquedafallido: estudiante no encontrado");
        throw new EstudianteNoEncontradoException("El estudiante con id:"+ estudiante.getId() +" no existe");
    }


}
