package com.designPattern.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy {
    public static void main(String[] args) {
        Computer computer = new ComputerImpl();

        ClassLoader loader = computer.getClass().getClassLoader();
        Class<?>[] interfaces = computer.getClass().getInterfaces();
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = method.invoke(computer, args);
                System.out.println(" result *** " + result);
                return result;
            }
        };


        Computer computerProxy = (Computer) Proxy.newProxyInstance(loader, interfaces, handler);

        computerProxy.add(1, 2);
    }

}
