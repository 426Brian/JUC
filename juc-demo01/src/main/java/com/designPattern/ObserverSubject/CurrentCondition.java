package com.designPattern.ObserverSubject;

public class CurrentCondition {

    private float mTemprature;
    private float mPressure;
    private float mHumidity;

    public void update(float mTemprature, float mPressure, float mHumidity) {
        this.mTemprature = mTemprature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;

        display();
    }

    public void display(){
        System.out.println("*** 温度 *** "+mTemprature);
        System.out.println("*** 压力 *** "+mPressure);
        System.out.println("*** 湿度 *** "+mHumidity);
    }
}
