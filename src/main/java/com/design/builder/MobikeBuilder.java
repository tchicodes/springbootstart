package com.design.builder;

public class MobikeBuilder extends IBuilder{

    private Bike bike = new Bike();

    @Override
    void buildFrame() {
        bike.setFrame("自行车框架");
    }

    @Override
    void buildSeat() {
        bike.setSeat("自行车座位");
    }

    @Override
    void buildTire() {
        bike.setTire("自行车轮胎");
    }

    @Override
    Bike createBike() {
        return bike;
    }
}
