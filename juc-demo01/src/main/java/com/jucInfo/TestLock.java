package com.jucInfo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket, "1号").start();
        new Thread(ticket, "2号").start();
        new Thread(ticket, "3号").start();
    }
}

class Ticket implements Runnable{
    private  int tick = 100;

    private Lock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true){
            // 上锁
            lock.lock();
            if(tick >0){
                try {
                    Thread.sleep(200);
                    System.out.println(Thread.currentThread().getName()+" ** 余票 ** "+ --tick);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }

            }

        }
    }
}