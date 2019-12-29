package com.designPattern.ObserverSubject;

public class WeatherData {

    private float mTemprature;
    private float mPressure;
    private float mHumidity;

    // 依赖入
    private CurrentCondition mCurrentCondition;
    public WeatherData() {
    }

    public WeatherData(CurrentCondition mCurrentCondition) {
        this.mCurrentCondition = mCurrentCondition;
    }

    public WeatherData(float mTemprature, float mPressure, float mHumidity) {
        this.mTemprature = mTemprature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
    }

    public float getmTemprature() {
        return mTemprature;
    }

    public void setmTemprature(float mTemprature) {
        this.mTemprature = mTemprature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public void setmPressure(float mPressure) {
        this.mPressure = mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void setmHumidity(float mHumidity) {
        this.mHumidity = mHumidity;
    }

    public void dataChange(){
        mCurrentCondition.update(mTemprature, mPressure, mHumidity);
    }

}
