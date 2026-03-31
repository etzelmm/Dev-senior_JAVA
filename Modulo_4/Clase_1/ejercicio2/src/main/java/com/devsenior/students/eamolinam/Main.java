package com.devsenior.students.eamolinam;

public class Main {
    public static void main(String[] args) {
        int[] puntajes = {10, 20, 30, 40, 50};

        System.out.println(puntajes[0]);
        puntajes[2] = 100;
        for(int puntaje : puntajes) {
            System.out.println(puntaje);
        }
    }
}