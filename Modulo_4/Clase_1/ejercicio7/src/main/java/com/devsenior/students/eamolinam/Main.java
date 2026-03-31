package com.devsenior.students.eamolinam;

public class Main {
    public static void main(String[] args) {
        double[] temperaturas = {30, 32, 28, 31, 29, 33, 27};
        int i = 0;

        while (i < temperaturas.length) {
            int dia = i + 1;
            System.out.println("Dia: " + dia + " temperatura: " + temperaturas[i] );
            i++;
        }
    }
}