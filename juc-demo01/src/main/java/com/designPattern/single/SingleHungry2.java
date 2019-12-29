package com.designPattern.single;

/**
 * 线程安全, 不能延时加载
 */
public class SingleHungry2 {
    private static final SingleHungry2 INSTANCE;

    static {
        INSTANCE = new SingleHungry2();
    }

    public static SingleHungry2 getInstance(){
        return INSTANCE;
    }
}
