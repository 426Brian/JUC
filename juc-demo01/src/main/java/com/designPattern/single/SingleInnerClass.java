package com.designPattern.single;

/**
 * 线程安全, 延迟加载
 */
public class SingleInnerClass {
    private SingleInnerClass() {

    }

    private static class SingleDemo {
        private static final SingleInnerClass instance = new SingleInnerClass();
    }

    public static SingleInnerClass getInstance(){
        return SingleDemo.instance;
    }
}
