package com.devsenior.students.eamolinam;

public class Main {
    public static void main(String[] args) {
        Character[][] cine = {{'L','L','L','L','L'},
                              {'L','L','L','L','L'},
                              {'L','L','L','L','L'},
                              {'L','L','L','L','L'},
                              {'L','L','L','L','L'}};
                              
        cine[2][1] = 'X';
        cine[2][2] = 'X';
        cine[3][3] = 'X';
        cine[3][4] = 'X';
        cine[4][0] = 'X';
        cine[4][1] = 'X';


        for(int i = 0; i < cine.length; i++) {
            for( int j = 0; j < cine[i].length; j++){
                System.out.print("[" + cine[i][j] + "]");
            }
            System.out.println(",");
        }
    }
}