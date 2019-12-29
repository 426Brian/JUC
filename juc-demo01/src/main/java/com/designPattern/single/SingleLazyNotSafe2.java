package com.designPattern.single;

public class SingleLazyNotSafe2 {
    private static SingleLazyNotSafe2 instance;

    private SingleLazyNotSafe2() {

    }

    public static SingleLazyNotSafe2 getInstance() {
        if (instance == null) {
            synchronized (SingleLazyNotSafe2.class) {
                instance = new SingleLazyNotSafe2();
            }

        }

        return instance;
    }

}
