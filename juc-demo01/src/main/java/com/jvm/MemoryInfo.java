package com.jvm;

public class MemoryInfo {
    public static void main(String[] args) {
        long totalMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();

        System.out.println("totalMemory == "+totalMemory/1024/1024+"MB"
                +" maxMemory == "+maxMemory/1024/1024+"MB");
    }
}
