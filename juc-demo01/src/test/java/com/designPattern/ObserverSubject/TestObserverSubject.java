package com.designPattern.ObserverSubject;

import org.junit.Before;
import org.junit.Test;

public class TestObserverSubject {
    CurrentCondition currentCondition = new CurrentCondition();
    WeatherData weatherData;

    @Before
    public void initInfo(){

        weatherData = new WeatherData(currentCondition);
    }

    @Test
    public void testWeather(){
        weatherData.setmHumidity(30);
        weatherData.setmPressure(10);
        weatherData.setmTemprature(37);

        weatherData.dataChange();
    }

}
