package com.jucInfo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程交替， 变量初始值为0, 一个线程加, 另一个线程减
 */
public class ThreadNotify {
    public static void main(String[] args) {
        Source source = new Source();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    source.increacement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    source.decreacement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    source.increacement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "C").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    source.decreacement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "D").start();
    }
}

class Source {
    private volatile int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

   /* public synchronized void increacement() throws InterruptedException {
        // 判断 防止虚假唤醒, 只能用while 不能用if
        while (number != 0) {
            this.wait();
        }

        // 执行
        number++;
        System.out.println(Thread.currentThread().getName() + "\t" + number);

        // 通知
        this.notifyAll();
    }

    public synchronized void decreacement() throws InterruptedException {
        // 判断 防止虚假唤醒, 只能用while 不能用if
        while (number != 1) {
            this.wait();
        }

        // 执行
        number--;
        System.out.println(Thread.currentThread().getName() + "\t" + number);

        // 通知
        this.notifyAll();
    }*/

    public void increacement() throws InterruptedException {
        // 判断 防止虚假唤醒, 只能用while 不能用if
        lock.lock();
        try{
            while (number != 0) {
                condition.await();
            }

            // 执行
            number++;
            System.out.println(Thread.currentThread().getName() + "\t" + number);

            // 通知
            condition.signalAll();
        }finally {
            lock.unlock();
        }

    }

    public void decreacement() throws InterruptedException {
        // 判断 防止虚假唤醒, 只能用while 不能用if
        lock.lock();
        try{
            while (number != 1) {
                condition.await();
            }

            // 执行
            number--;
            System.out.println(Thread.currentThread().getName() + "\t" + number);

            // 通知
            condition.signalAll();
        }finally {
            lock.unlock();
        }

    }
}

