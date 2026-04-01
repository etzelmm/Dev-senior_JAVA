package com.devsenior.students.eamolinam.service;

import java.util.HashMap;
import java.util.Map;

import com.devsenior.students.eamolinam.exceptions.IdAlreadyExist;
import com.devsenior.students.eamolinam.exceptions.InavidMesureException;
import com.devsenior.students.eamolinam.exceptions.InvalidStateException;
import com.devsenior.students.eamolinam.model.Mesure;
import com.devsenior.students.eamolinam.model.Satellite;
import com.devsenior.students.eamolinam.model.SatelliteState;

public class SatelliteService {
    Map<String, Satellite> satellites = new HashMap<>();

    public Boolean idExist(String id){
        if (satellites.containsKey(id)) {
            return true;
        }
        return false;
    }

    public Satellite getSatellite(String id){ 
        if(!idExist(id)){
            throw new IdAlreadyExist("No existe el satelite con id: " + id);
        }
        return satellites.get(id);
    }

    public void addSatellite(String id, String state){
        SatelliteState satelliteState = SatelliteState.ACTIVE;
        if (idExist(id)) {
            throw new IdAlreadyExist("Error al agregar satelite, id ya existe");
        }

        if (state.equals(SatelliteState.ACTIVE.toString())) {
            satelliteState = SatelliteState.ACTIVE;
        }else if(state.equals(SatelliteState.INACTIVE.toString())){
            satelliteState = SatelliteState.INACTIVE;
        } else if(state.equals(SatelliteState.MAINTENANCE.toString())){
            satelliteState = SatelliteState.MAINTENANCE;
        } else{
            throw new InvalidStateException("Error al agregar satelite, estado no valido");
        }

        satellites.put(id, new Satellite(id, satelliteState));
    }

    public void showState(String id){
        try { 
            System.out.println(getSatellite(id).getState());
        } catch (IdAlreadyExist e) {
            System.out.println("No fue posible mostrar el satelite ya que: " + e);
        }
        
    }

    public void addMesure(String id, Double radiationLevel){
        if(radiationLevel < 0){
            throw new InavidMesureException("No es podible tener niveles de radiacion negativos");
        }
        try {
            getSatellite(id).getMesures().add(new Mesure(radiationLevel));
        } catch (IdAlreadyExist e) {
            System.out.println("No se agrego medicion ya que: " + e);
        }
    }

    public void showMesures(String id){
        try {
            Satellite satellite = getSatellite(id);
            for(Mesure mesure: satellite.getMesures()) {
                System.out.println(mesure);
            }
        } catch (IdAlreadyExist e) {
            System.out.println("No se pueden mostrar medidas ya que: " + e);
        }
    }

    public void changestate(String id, SatelliteState state){
        try {
            getSatellite(id).setState(state);
        } catch (IdAlreadyExist e) {
            System.out.println("No es posible cambiar el estado ya qu: " + e);
        }
    }
}
