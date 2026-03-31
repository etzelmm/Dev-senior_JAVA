package com.devsenior.students.eamolinam;

public class Main {
    public static void main(String[] args) {
        double[] precios = {2500, 3200, 1500, 4000, 1000};

        for(int i = 0; i < precios.length; i++) {
            int producto = i + 1;
            System.out.println("producto numero " + producto + " con valor: " + precios[i]);
        }
    }
}