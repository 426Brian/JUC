package com.designPattern.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ChildClaz implements MethodInterceptor {
    @Override
    public Object intercept(Object sub, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        Object result = methodProxy.invokeSuper(sub, args);
        System.out.println("intercept *** "+result);
        return result;
    }
}
