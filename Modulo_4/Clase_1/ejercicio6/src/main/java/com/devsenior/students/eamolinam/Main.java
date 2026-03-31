package com.devsenior.students.eamolinam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] playlist = {"margie", "asia", "soledad", "all my life", "que pena me da", "quiero volar"};

        String cancionBuscada = input.nextLine();

        boolean existe = false;
        for(String cancion : playlist ) {
            if (cancion.equals(cancionBuscada)){
                System.out.println("La cancion esta en la lista");
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("cancion no existe en la lista");
        }
    }

}