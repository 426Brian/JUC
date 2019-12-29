package com.jucInfo;

public class TestAtomicDemo {
    public static void main(String[] args) {
        AtomicDemo atomicDemo = new AtomicDemo();

        for (int i = 0; i < 10; i++) {
            new Thread(atomicDemo).start();
        }

    }
}

class AtomicDemo implements Runnable {
    private int serialNumber = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+" ** "+getSerialNumber());

    }

    public int getSerialNumber(){
        return serialNumber++;
    }
}
