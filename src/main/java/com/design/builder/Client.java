package com.design.builder;

import org.junit.Test;

public class Client {

    @Test
    public void test0() {
        Director director = new Director(new OfoBuilder());

        Bike bike = director.construct();

        System.out.println(bike);
    }

    @Test
    public void test1() {
        Computer computer = Computer.builder().build();
        System.out.println(computer);

        Computer computer1 = Computer.builder()
                .cpu("inter core 5")
                .mainBoard("技嘉")
                .memory("镁光 16G 2666HMZ")
                .screen("三星")
                .build();

        System.out.println(computer1);
    }
}
