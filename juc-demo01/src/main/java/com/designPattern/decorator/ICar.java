package com.designPattern.decorator;

import javax.swing.*;

public interface ICar {
    void move();
}

class Car implements ICar{
    @Override
    public void move() {
        System.out.println("** 陆地上跑");
    }
}

class SuperCar implements ICar{
    private ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("*** 天上飞 ***");
    }
    public void move(){
        super.move();
        fly();
    }
}