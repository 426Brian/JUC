package com.algorithms;

import java.io.PrintStream;

public class Test {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a, b);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }

    private static void method(int a, int b) {
        System.out.println("a=100");
        System.out.println("b=200");
        System.exit(1);
    }

    private static void method(int a, int b, String... str) {
        PrintStream printStream = new PrintStream(System.out){
            @Override
            public void println(String x) {

                if("a=10".equals(x)){
                    x = "a=100";
                }else if("b=20".equals(x)){
                    x = "b=200";
                }

                super.println(x);
            }

        };

        System.setOut(printStream);
    }
}
