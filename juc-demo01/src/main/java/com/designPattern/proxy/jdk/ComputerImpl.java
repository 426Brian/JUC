package com.designPattern.proxy.jdk;

public class ComputerImpl implements Computer {
    @Override
    public int add(int a, int b) {
        System.out.println(a+" + "+b+" = "+(a+b));
        return a + b;
    }
}
