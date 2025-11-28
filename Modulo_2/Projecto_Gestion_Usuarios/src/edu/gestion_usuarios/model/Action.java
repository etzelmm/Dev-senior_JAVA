package edu.gestion_usuarios.model;

import java.time.LocalDateTime;

public class Action {

    private String description;
    private LocalDateTime date;

    public Action(String description, LocalDateTime date) {
        this.description = description;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("Accion: %s%nfecha: %s%n", getDescription(), getDate().toString());
    }
}
