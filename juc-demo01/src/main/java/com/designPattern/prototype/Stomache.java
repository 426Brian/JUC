package com.designPattern.prototype;

import java.io.Serializable;

public class Stomache implements Cloneable, Serializable {
    private String name;
    private int length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Stomache() {
        
    }
    public Stomache(String name, int length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Stomache{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
