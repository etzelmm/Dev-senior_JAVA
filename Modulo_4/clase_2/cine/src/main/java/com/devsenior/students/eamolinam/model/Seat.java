package com.devsenior.students.eamolinam.model;

public class Seat {
    private SeatState state;

    public Seat() {
        this.state = SeatState.AVIABLE;
    }

    public SeatState getState() {
        return state;
    }

    public void setState(SeatState state) {
        this.state = state;
    }
    
    @Override
    public String toString() {
        return getState().getDescripcion();
    }

}
