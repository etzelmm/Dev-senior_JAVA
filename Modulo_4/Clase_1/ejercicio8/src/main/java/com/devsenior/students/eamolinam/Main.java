package com.devsenior.students.eamolinam;

public class Main {
    public static void main(String[] args) {
        int[][] tabla = new int[5][5];

        for(int i = 0; i < tabla.length; i++) {
            for(int j = 0; j < tabla[i].length; j++){
                tabla[i][j] = (i+1) * (j+1);
            }
        }

        for(int i = 0; i < tabla.length; i++) {
            for(int j = 0; j < tabla[i].length; j++){
                System.out.print("[" + tabla[i][j] + "]");
            }
            System.out.println();
        }

    }
}