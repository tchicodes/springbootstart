package com.design.builder;

public class OfoBuilder extends IBuilder{
    private Bike bike = new Bike();

    @Override
    void buildFrame() {
        bike.setFrame("ofo自行车框架");
    }

    @Override
    void buildSeat() {
        bike.setSeat("ofo自行车座位");
    }

    @Override
    void buildTire() {
        bike.setTire("ofo自行车轮胎");
    }

    @Override
    Bike createBike() {
        return bike;
    }
}
