package com.devsenior.students.eamolinam.service;

import com.devsenior.students.eamolinam.exceptions.AviableSeatException;
import com.devsenior.students.eamolinam.exceptions.InvalidSeatException;
import com.devsenior.students.eamolinam.exceptions.ReservedSeatException;
import com.devsenior.students.eamolinam.model.Seat;
import com.devsenior.students.eamolinam.model.SeatState;

public class Cinema {
    private Seat[][] seats = new Seat[10][6];

    public Cinema(){
        for(int i = 0; i < this.seats.length; i++){
            for(int j = 0; j < this.seats[i].length; j++){
                seats[i][j] = new Seat();
            }
        }
    }

    //mostrar los asientos en consola
    public void viewSeats(){
        for(int i = 0; i < this.seats.length; i++){
            for(int j = 0; j < this.seats[i].length; j++){
                System.out.print("[" + seats[i][j] + "]");
            }
            System.out.println();
        }
    }

    //convierte el char en integer correspondiente a la columna para trabajarlo como un index
    public Integer colomToInteger(char colum) throws InvalidSeatException{
        Integer columInteger;
        switch (Character.toLowerCase(colum)) {
            case 'a':
                return columInteger = 1;
            case 'b':
                return columInteger = 2;               
            case 'c':
                return columInteger = 3;              
            case 'd':
                return columInteger = 4;             
            case 'e':
                return columInteger = 5;           
            case 'f':
                return columInteger = 6;           
            default:
                throw new InvalidSeatException("La columna no existe, ingrese un asiento valido");
        }
    }

    public boolean isValidSeat(Integer row, Integer columInteger) throws InvalidSeatException{
        if (row > seats.length && row < 1 && columInteger > seats[row].length && columInteger < 1) {
            throw new InvalidSeatException("El asiento a reservar no existe, ingrese un asiento valido");
        }
        return true;
    }

    public boolean isReserved( Integer row, Integer columInteger) throws InvalidSeatException{
        if(seats[row-1][columInteger-1].getState() == SeatState.RESERVED){
            return true;
        }
        return false;
    }

    public void reserveSeat( Integer row, char colum) throws InvalidSeatException{
        Integer columInteger = colomToInteger(colum);
        if(isValidSeat( row, columInteger)){
            if(isReserved( row, columInteger)){
                throw new ReservedSeatException("El asiento ya esta reservado, porfavor elija otro");
            }
            seats[row-1][columInteger-1].setState(SeatState.RESERVED);  
        }

    }

    public void cancelSeat( Integer row, char colum) throws InvalidSeatException{
        Integer columInteger = colomToInteger(colum);
        if(isValidSeat(row, colomToInteger(colum))){
            if(!isReserved(row, colomToInteger(colum))){
                throw new AviableSeatException("El asiento que quiere cancelar no esta reservado, porfavor elija una opcion valida");
            }
            seats[row-1][columInteger-1].setState(SeatState.AVIABLE);
        }
    }

    public String calculateSeat() throws InvalidSeatException{
        Integer seatReserve = 0;
        Integer seatAviable = 0;
        Integer totalSeat = 0;
        for(int i = 0; i < this.seats.length; i++){
            for(int j = 0; j < this.seats[i].length; j++){
                if (isReserved(i+1 , j+1)) {
                    seatReserve +=1;
                }
                if (!isReserved( i+1, j+1)) {
                    seatAviable +=1;
                }
                totalSeat +=1;
            }
        }

        double reservePercentage = ((double) seatReserve / totalSeat) * 100;
        double aviablePercentage = 100 - reservePercentage;

        return "Hay un total de " + totalSeat + " asientos\n" +
       "asientos libres: " + seatAviable + "\n" +
       "asientos reservados: " + seatReserve + "\n" +
       "porcentaje reservados: " + reservePercentage + "\n" +
       "porcentaje libres: " + aviablePercentage;
    }

}


