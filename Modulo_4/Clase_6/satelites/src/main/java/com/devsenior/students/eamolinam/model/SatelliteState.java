package com.devsenior.students.eamolinam.model;

public enum SatelliteState {
    ACTIVE("Activo"),
    INACTIVE("Inactivo"),
    MAINTENANCE("En Mantenimiento");

    private final String description;

    SatelliteState(String description){
         this.description = description;  
    }

    @Override
    public String toString() {
        return description;
    }

    
}
