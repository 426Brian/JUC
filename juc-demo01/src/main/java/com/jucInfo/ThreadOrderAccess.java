package com.jucInfo;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 多线程实现A -> B —> C
 * AA 打印 5 次, BB 打印 10 次, CC 打印 15 次
 * 接着AA 打印 5 次, BB 打印 10 次, CC 打印 15 次
 * 来 10 轮……
 */
public class ThreadOrderAccess {
    public static void main(String[] args) {
        ShareSource shareSource = new ShareSource();

        new Thread(()->{
            shareSource.print5();
        }, "A").start();

        new Thread(()->{
            shareSource.print10();
        }, "B").start();

        new Thread(()->{
            shareSource.print15();
        }, "C").start();
    }

}

class ShareSource {
    private  int number = 1;
    private Lock lock = new ReentrantLock();
    private Condition condition1 = lock.newCondition();
    private Condition condition2 = lock.newCondition();
    private Condition condition3 = lock.newCondition();


    public void print5()  {
        lock.lock();

        try{
            // 判断
            while (number != 1){
                try {
                    condition1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 执行
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }

            // 通知
            number = 2;
            condition2.signal();

        }finally {
            lock.unlock();
        }
    }

    public void print10() {
        lock.lock();

        try{
            // 判断
            while (number != 2){
                try {
                    condition1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // 执行
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }

            // 通知
            number = 3;
            condition3.signal();

        }finally {
            lock.unlock();
        }
    }

    public void print15() {
        lock.lock();

        try{
            // 判断
            while (number != 3){
                condition3.await();
            }

            // 执行
            for (int i = 0; i < 15; i++) {
                System.out.println(Thread.currentThread().getName()+"\t"+i);
            }

            // 通知
            number = 1;
            condition1.signal();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
