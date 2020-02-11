package com.proxy;


import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human {
    String belief();

    void eat(String food);
}

public class ProxyTest {
    @Test
    public void test(){
        Human human = (Human) ProxyFactory.getProxy(new SuperMan());

        String belief = human.belief();
        System.out.println(belief);
    }

}

class SuperMan implements Human {
    @Override
    public String belief() {
        return "I believe i can fly.";
    }

    @Override
    public void eat(String food) {
        System.out.println("eat food is == " + food);
    }
}

class ProxyFactory {
    public static Object getProxy(Object obj) {
        MyHandler myHandler = new MyHandler(obj);
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                myHandler
        );
    }
}

class MyHandler implements InvocationHandler {
    // 被代理对象
    private Object obj;

    public MyHandler(Object obj) {
        this.obj = obj;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnVal = method.invoke(obj, args);
        return returnVal;
    }
}