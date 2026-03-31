package com.devsenior.students.eamolinam;

public class Main {
    public static void main(String[] args) {
        double[][] notas = {{3.0, 5.0, 2.4, 3.9},
                            {4.5, 3.6, 1.2, 2.9},
                            {3.7, 3.5, 3.1, 4.3}};

        for(int i = 0; i < notas.length; i++){
            double suma = 0;
            int estudiante = i+1;
            for(int j = 0; j < notas[i].length; j++){
                suma += notas[i][j];
            }
            double promedio = suma/notas[i].length;
            System.out.println("Estudiante: " + estudiante + " promedio= " + promedio);
        }
    }
}