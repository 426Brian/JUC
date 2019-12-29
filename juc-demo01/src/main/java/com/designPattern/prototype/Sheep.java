package com.designPattern.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 克隆羊 多利
 */
public class Sheep implements Cloneable, Serializable {
    private String name;
    private Date birthday;
    private Stomache stomache;

    public Stomache getStomache() {
        return stomache;
    }

    public void setStomache(Stomache stomache) {
        this.stomache = stomache;
    }

    public Sheep() {
    }

    public Sheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    protected Object clone() {
        // 仅仅浅复制
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // 要深克隆只能通过反序列化的方式在需要的时机进行
        return clone;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", stomache=" + stomache +
                '}';
    }
}
