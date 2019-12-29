package com.designPattern.single;

public class SingleLazyNotSafe {
    private static SingleLazyNotSafe instance;

    private SingleLazyNotSafe(){

    }

    public static SingleLazyNotSafe getInstance(){
        if(instance == null){
            instance = new SingleLazyNotSafe();
        }

        return instance;
    }

}
