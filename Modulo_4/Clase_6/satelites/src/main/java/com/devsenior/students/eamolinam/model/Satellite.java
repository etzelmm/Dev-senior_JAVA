package com.devsenior.students.eamolinam.model;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Satellite {
    private String id;
    SatelliteState state;
    List<Mesure> mesures = new ArrayList<>();


    public Satellite(String id, SatelliteState state) {
        this.id = id;
        this.state = state;
    }


    public String getId() {
        return id;
    }


    public SatelliteState getState() {
        return state;
    }


    public void setState(SatelliteState state) {
        this.state = state;
    }


    public List<Mesure> getMesures() {
        return mesures;
    }


    public void setMesures(List<Mesure> mesures) {
        this.mesures = mesures;
    }
    
    @Override
    public String toString() {
        return "Satelite:  " + this.id + "\n"
        + "Estado: " + this.state + "\n"
        + "Medidas: [" + mesures + "]";
    }

}
