package com.algorithms;

public class FibonacciDemo {
    public static void main(String[] args) {
        int result = add(6);
        System.out.println(result);
    }

    public static int add(int n) {
        if (n < 1) {
            throw new RuntimeException("invalid num");

        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return add(n - 1) + add(n - 2);
        }

    }
}
