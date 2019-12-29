package com.jvm;

public class StackOverFlow {
    public static void main(String[] args) {
        sayHello();
    }

    public static void sayHello(){
        sayHello();
    }
}
