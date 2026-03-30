# Proyecto de Cierre: Plataforma de Gestión de Cursos en Línea

## Enunciado del Proyecto

El objetivo de este proyecto es desarrollar una **Plataforma de Gestión
de Cursos en Línea** utilizando **Java** y aplicando los conceptos
aprendidos durante el curso: **POO, manejo de excepciones, propagación
de errores, logging con Log4j 2 y pruebas unitarias con JUnit**.

### Requerimientos del proyecto:

1.  **Gestión de Cursos:**

    -   Crear cursos con código, nombre y capacidad máxima de
        estudiantes.
    -   Listar todos los cursos disponibles.
    -   Buscar cursos por código.

2.  **Gestión de Estudiantes:**

    -   Crear estudiantes con ID, nombre y correo.

3.  **Gestión de Inscripciones:**

    -   Inscribir estudiantes a cursos.
    -   Controlar la capacidad máxima de los cursos.
    -   Listar inscripciones por estudiante.

4.  **Manejo de Excepciones Personalizadas:**

    -   `CursoLlenoException`: cuando un curso no tiene cupos
        disponibles.
    -   `EstudianteNoEncontradoException`: cuando un estudiante no tiene
        inscripciones o no se encuentra.

5.  **Logging con Log4j 2:**

    -   Registrar eventos importantes: creación de cursos, inscripciones
        exitosas, errores, advertencias.

6.  **Pruebas Unitarias con JUnit 5:**

    -   Validar la creación de cursos, inscripciones y manejo de
        excepciones.

### Requisitos técnicos:

-   Utilizar **Java 17** o la versión usada en clase.
-   Proyecto **Maven** sin archetype.
-   Evitar el uso de streams para que los estudiantes practiquen **POO y
    estructuras básicas**.