package com.devsenior.students.eamolinam.db;
import java.util.Arrays;
import java.util.List;

import com.devsenior.students.eamolinam.model.Categorias;
import com.devsenior.students.eamolinam.model.Plato;
import com.devsenior.students.eamolinam.model.Stand;
public class DataBaseSimulada {
    
    public static List<Plato> getPlatos(){
       
        Stand stand1 = new Stand("Delicias Mexicanas");  
        Stand stand2 = new Stand("Sabor Italiano");
        Stand stand3 = new Stand("Comida China");   
        Stand stand4 = new Stand("Gourmet Vegano");
        Stand stand5 = new Stand("Parrilla Argentina");
        
        return Arrays.asList(
            new Plato("Tacos al Pastor", 50.0, 300, Categorias.BEBIDA, stand1),
            new Plato("Enchiladas Verdes", 70.0, 450, Categorias.PICANTE, stand1),
            new Plato("Pizza Margherita", 80.0, 600, Categorias.TRADICIONAL, stand2),
            new Plato("Spaghetti Carbonara", 90.0, 700, Categorias.TRADICIONAL, stand2),
            new Plato("Arroz Frito", 60.0, 500, Categorias.VEGANO, stand3),
            new Plato("Pollo a la Naranja", 85.0, 650, Categorias.TRADICIONAL, stand3),
            new Plato("Ensalada César Vegana", 75.0, 400, Categorias.VEGANO, stand4),
            new Plato("Hamburguesa Vegana", 95.0, 550, Categorias.VEGANO, stand4),
            new Plato("Bife de Chorizo", 120.0, 800, Categorias.TRADICIONAL, stand5),
            new Plato("Empanadas", 40.0, 350, Categorias.PICANTE, stand5)
        );
        
    }
}
