package com.j8;

public class LamdaDemo {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable test");
            }
        };

        runnable.run();
        System.out.println("****************************");

        Runnable runnable2 = ()->{System.out.println("runnable lamada test");};
        runnable2.run();


    }
}
