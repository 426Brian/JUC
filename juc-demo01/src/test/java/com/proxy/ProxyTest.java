package com.proxy;

import org.junit.Test;

import java.io.ObjectInputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human {
    String getBelief();

    void eat(String food);
}

public class ProxyTest {
    @Test
    public void test() {

        Human proxy = (Human) ProxyFactory.getProxy(new SuperMan());

        String belief = proxy.getBelief();
        System.out.println(belief);
    }
}

class SuperMan implements Human {
    @Override
    public String getBelief() {
        return "I believe i can fly.";
    }

    @Override
    public void eat(String food) {
        System.out.println("eat + " + food);
    }
}

class ProxyFactory {
    public static Object getProxy(Object obj) {
        MyHandler myHandler = new MyHandler();
        myHandler.bind(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), myHandler);
    }
}

class MyHandler implements InvocationHandler {
    private Object obj;

    public void bind(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnVal = method.invoke(obj, args);
        return returnVal;
    }
}