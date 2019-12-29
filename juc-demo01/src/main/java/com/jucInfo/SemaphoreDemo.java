package com.jucInfo;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);// 模拟三个停车位

        // 模拟6 辆车
        for (int i = 1; i <= 6; i++) {
            new Thread(()->{
                try {
                    semaphore.acquire();

                    System.out.println(Thread.currentThread().getName()+"\t 抢到车位");

                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(Thread.currentThread().getName()+"\t 停车3秒后离开车位");

                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    semaphore.release();
                }
            }, String.valueOf(i)).start();
        }
    }
}
