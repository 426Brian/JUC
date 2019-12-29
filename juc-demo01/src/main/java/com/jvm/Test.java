package com.jvm;

import static java.lang.Integer.MAX_VALUE;

public class Test {
    public static void main(String[] args) {
        System.out.println("******* hello GC ********");
        try {
            Thread.sleep(MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
