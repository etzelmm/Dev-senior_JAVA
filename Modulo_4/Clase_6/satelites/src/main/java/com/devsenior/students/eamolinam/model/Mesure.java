package com.devsenior.students.eamolinam.model;

public class Mesure {
    private double radiationLevel;

    public Mesure(double radiationLevel) {
        this.radiationLevel = radiationLevel;
    }

    public double getRadiationLevel() {
        return radiationLevel;
    }

    @Override
    public String toString() {
        return "{" + radiationLevel + "}";
    }
    
}