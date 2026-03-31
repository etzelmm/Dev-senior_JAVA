package com.devsenior.students.eamolinam.ui;

import java.util.Scanner;

import com.devsenior.students.eamolinam.exceptions.AviableSeatException;
import com.devsenior.students.eamolinam.exceptions.InvalidSeatException;
import com.devsenior.students.eamolinam.exceptions.ReservedSeatException;
import com.devsenior.students.eamolinam.service.Cinema;

public class Menu {
    private Scanner input = new Scanner(System.in);;
    private Cinema cinema = new Cinema();

    public void showMenu(){
        System.out.println("""
                ======= MENU GESTION DE RESERVAS =======

                [1]. MOSTRAR MAPA DE ASIENTOS
                [2]. RESERVAR ASIENTO
                [3]. CANCELAR RESERVA
                [4]. CONSULTAR ESTADOS
                [5]. SALIR

                """);
    }

    public void execute() {
        Integer opc;
        do {
            showMenu();
            opc = input.nextInt();
            input.nextLine();
            switch (opc) {
                case 1:
                    cinema.viewSeats();
                    break;
                case 2:
                    try {
                        System.out.print("Ingrese el numero de la fila: ");
                        Integer row = input.nextInt();
                        input.nextLine();
                        System.out.print("Ingrese La letra de la columna: ");
                        char colum = input.nextLine().charAt(0);
                        input.nextLine();
                        cinema.reserveSeat(row, colum);
                    } catch (InvalidSeatException e) {
                        System.out.println("no fue posible reservar por: " + e);
                    } catch (ReservedSeatException e) {
                        System.out.println("no fue posible reservar por: " + e);
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Ingrese el numero de la fila: ");
                        Integer row = input.nextInt();
                        input.nextLine();
                        System.out.print("Ingrese La letra de la columna: ");
                        char colum = input.nextLine().charAt(0);
                        input.nextLine();
                        cinema.cancelSeat(row, colum);
                    } catch (InvalidSeatException e) {
                        System.out.println("no fue posible cancelar la reserva por: " + e);
                    } catch (AviableSeatException e) {
                        System.out.println("no fue posible cancelar la reserva por: " + e);
                    }
                    break;
                case 4:
                    try {
                        System.out.println(cinema.calculateSeat());
                    } catch (InvalidSeatException e) {
                        System.out.println("no fue posible calcular la reserva por: " + e);
                    }
                    break;
                case 5:
                    System.out.println("ADIOS!!");
                    break;
                default:
                    input.nextLine();
                    System.out.print("Ingrese una opcion valida: ");
                    opc = input.nextInt();
                    break;
            }
        } while (opc != 5);
        input.close();
    }
}
