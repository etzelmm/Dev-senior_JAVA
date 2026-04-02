package com.devsenior.students.eamolinam.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.devsenior.students.eamolinam.model.Categorias;
import com.devsenior.students.eamolinam.model.Plato;

public class PlatoServicio {
    private List<Plato> platos;

    public PlatoServicio(List<Plato> platos){
        this.platos = platos;
    }

    //Filtrar por precios y categorias
    public List<Plato> filtrarPlatos(Double presupuesto, Categorias categoria){
        return platos.stream().filter(plato -> plato.getPrecio() <= presupuesto && categoria == plato.getCategoria())
        .collect(Collectors.toList());
    }

    //Ordenar y mostrar los 3 con menos calorias
    public List<Plato> menosCalorias(){
        return platos.stream().sorted((p1,p2) -> Integer.compare(p1.getCalorias(), p2.getCalorias())) // ordena por calorias de menos a mayor
        .limit(3) // toma solo los 3 primeros
        .collect(Collectors.toList()); // lo devuelve como lista
    }

    public Map<Categorias, List<Plato>> agruparCategoria(){
        return platos.stream().collect(Collectors.groupingBy(plato -> plato.getCategoria()));
    }
}
