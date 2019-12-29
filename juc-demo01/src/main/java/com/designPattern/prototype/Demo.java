package com.designPattern.prototype;

import java.io.*;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws Exception {
        Sheep sheep1  = new Sheep("duoli", new Date());
        Stomache stomache = new Stomache("sheep1", 12);
        sheep1.setStomache(stomache);

        Sheep sheep2 = (Sheep)sheep1.clone();

        stomache.setName("sheep1_copy");
        sheep2.setName("duoli_copy");

        System.out.println("sheep1 -->"+sheep1);
        System.out.println("sheep2 -->"+sheep2);

        System.out.println("*********************************");
        // 以上为浅克隆，以下通过序列化和反序列化进行深克隆

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream objectOs = new ObjectOutputStream(bos);

        objectOs.writeObject(sheep1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream objIs = new ObjectInputStream(bis);

        Sheep sheep3 = (Sheep) objIs.readObject();
        System.out.println("sheep3 -->"+sheep3);


    }
}
