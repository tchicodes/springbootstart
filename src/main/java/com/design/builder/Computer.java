package com.design.builder;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Computer {

    private String cpu;
    private String screen;
    private String memory;
    private String mainBoard;

}
