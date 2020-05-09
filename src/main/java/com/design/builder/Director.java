package com.design.builder;

public class Director {

    private IBuilder iBuilder;

    public Director(IBuilder iBuilder) {
        this.iBuilder = iBuilder;
    }

    public Bike construct() {
        iBuilder.buildFrame();
        iBuilder.buildSeat();
        iBuilder.buildTire();

        return iBuilder.createBike();
    }

}
