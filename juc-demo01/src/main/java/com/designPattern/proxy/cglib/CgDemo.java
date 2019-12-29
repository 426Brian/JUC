package com.designPattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

public class CgDemo {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SubClaz.class);

        ChildClaz childClaz = new ChildClaz();
        enhancer.setCallback(childClaz);

        SubClaz subProxy = (SubClaz) enhancer.create();
        subProxy.say();
    }
}
