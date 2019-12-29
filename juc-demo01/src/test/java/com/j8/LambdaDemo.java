package com.j8;

import org.junit.Test;

import java.util.Comparator;

public class LambdaDemo {

    @Test
    public void test1(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable test");
            }
        };

        runnable.run();
        System.out.println("****************************");

        Runnable runnable1 = ()->{ System.out.println("runnable lamda");};
        runnable1.run();
    }

    @Test
    public void test2(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(comparator.compare(12, 21));

        System.out.println("****************************");

        Comparator<Integer> comparator2 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(comparator2.compare(12, 21));

        System.out.println("****************************");

        Comparator<Integer> comparator3 = Integer::compare;
        System.out.println(comparator3.compare(12, 21));
    }
}
