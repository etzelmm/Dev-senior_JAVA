package com.devsenior.students.eamolinam;

public class Main {
    public static void main(String[] args) {
        double[] notas = {3, 4, 5, 2, 5};

        System.out.println("su promedio es " + promedio(notas));

    }

    public static double suma(double[] notas) {
        double suma = 0;
        for(double nota : notas) {
            suma += nota;
        }
        return suma;
    }

    public static double promedio(double[] notas) {
        return suma(notas) / notas.length; 
    }
}