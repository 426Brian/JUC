package com.designPattern.single;

public class SingleLazySafe {
    private static SingleLazySafe instance;

    private SingleLazySafe(){

    }

    public synchronized static SingleLazySafe getInstance(){
        if(instance == null){
            instance = new SingleLazySafe();
        }

        return instance;
    }

}
