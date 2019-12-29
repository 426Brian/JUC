package com.jucInfo;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(6);

        for (int i = 1; i <= 6; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"\t 国被灭");
                latch.countDown();
            }, CountryEnum.forEach_CountEnum(i).getRetMessage()).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"\t 秦国一统华夏");
    }

    public static void closeDoor() {
        CountDownLatch latch = new CountDownLatch(6);

        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"\t 上完自习, 离开教室");
                latch.countDown();
            }, String.valueOf(i)).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"\t 关门走人");
    }
}
