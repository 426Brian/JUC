package com.jvm;

import java.util.Random;

public class OutOfMemoryHeap {
    public static void main(String[] args) {
        String str = "hellodemo";
        while (true) {
            str += str;
        }

    }
}
