package com.designPattern.factory;


import com.designPattern.factory.assitant.Car;
import com.designPattern.factory.simple.CarFactory;

public class Demo {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car audi = carFactory.createCar("audi");
        Car byd = carFactory.createCar("byd");

        audi.run();
        byd.run();

    }
}
