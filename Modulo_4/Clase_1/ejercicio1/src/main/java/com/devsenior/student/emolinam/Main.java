package com.devsenior.student.emolinam;

public class Main {
    public static void main(String[] args) {
        String[] canciones;
        canciones = new String[5];

        // Si ya declare implicitamente el array solo puedo llenar datos uno por uno
        canciones[0] = "margie";
        canciones[1] = "asia";
        canciones[2] = "soledad";
        canciones[3] = "all my life";
        canciones[4] = "que pena me da";


        // declaracion explicita si puedo meter todo de una
        String[] canciones2 = {"margie", "asia", "soledad", "all my life", "que pena me da"};

        for(String cancion : canciones){
            System.out.println(cancion);
        }

        System.out.println("------ opcion2 -------"); 
        
        for(int i = 0; i < canciones.length; i++) {
            System.out.println(canciones[i]);
        }
    }
}