package com.collection;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class NotSecurityArrayList {
    public static void main(String[] args) {
        // ArrayList 未加锁 多线程并发出错 java.util.ConcurrentModificationException
//        arrayListTest();

        // Vector 加锁线程安全, 并发不出错, 但是性能低下
//        vectorTest();

//        hashSetTest();

        hashMapTest();
    }
    public static void arrayListTest(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0, 8));

                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }

    public static void vectorTest(){
        List<String> list = new Vector<>();
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0, 8));

                System.out.println(list);
            }, String.valueOf(i)).start();
        }
    }

    public static void hashSetTest(){
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0, 8));

                System.out.println(set);
            }, String.valueOf(i)).start();
        }
    }

    public static void hashMapTest(){
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                map.put(Thread.currentThread().getName(),
                        UUID.randomUUID().toString().substring(0, 8));

                System.out.println(map);
            }, String.valueOf(i)).start();
        }
    }
}
