package com.designPattern.build;

public class BrianAirShipBuilder implements AirShipBuilder{
    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("*** 构建 轨道舱");
        return new OrbitalModule("*** Brian 轨道舱");
    }

    @Override
    public Engine buildEngine() {
        System.out.println("*** 构建 发动机");
        return new Engine("*** Brian 发动机");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("*** 构建 逃逸塔");
        return new EscapeTower("*** Brian 逃逸塔");
    }
}

