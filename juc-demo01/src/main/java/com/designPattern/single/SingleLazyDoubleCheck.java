package com.designPattern.single;

public class SingleLazyDoubleCheck {

    private volatile static SingleLazyDoubleCheck instance = null;

    private SingleLazyDoubleCheck() {
    }

    public static SingleLazyDoubleCheck getInstance() {
        if(instance == null){
            synchronized (SingleLazyDoubleCheck.class){
                if(instance == null){
                    instance = new SingleLazyDoubleCheck();
                }
            }
        }
        return instance;
    }
}
