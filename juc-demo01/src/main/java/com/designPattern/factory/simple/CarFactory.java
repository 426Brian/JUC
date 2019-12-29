package com.designPattern.factory.simple;


import com.designPattern.factory.assitant.Audi;
import com.designPattern.factory.assitant.Byd;
import com.designPattern.factory.assitant.Car;

public class CarFactory {

    public Car createCar(String type){
        if("audi".equals(type)){
            return new Audi();
        }else if("byd".equals(type)){
                return new Byd();
        }else {
            return null;
        }
    }

}
