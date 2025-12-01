package edu.gestion_usuarios.model;

public enum Role {
    ADMINISTRATOR("Administrador") , 
    STANDAR("Estandar");

    private String roleName;

    Role(String roleName) {
        this.roleName = roleName;
    }
}
