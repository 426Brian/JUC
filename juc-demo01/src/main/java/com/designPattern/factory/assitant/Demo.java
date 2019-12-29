package com.designPattern.factory.assitant;


public class Demo {
    public static void main(String[] args) {
        Car audi = new Audi();
        Car byd = new Byd();

        audi.run();
        byd.run();
    }
}
