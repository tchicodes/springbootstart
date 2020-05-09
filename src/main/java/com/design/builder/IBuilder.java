package com.design.builder;

public abstract class IBuilder {

    abstract void buildFrame();
    abstract void buildSeat();
    abstract void buildTire();

    abstract Bike createBike();

}
