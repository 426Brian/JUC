package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class PrimeDemo {
    public static void main(String[] args) {
//        prime();
        primePlus2();

    }

    public static void prime() {
        boolean flag = true;

        for (int i = 2; i <= 100; i++) {

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");

            }
            flag = true;

        }

    }

    public static void primePlus() {
        boolean flag = true;
        for (int i = 2; i <= 100; i++) {

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");

            }
            flag = true;

        }

    }

    public static void primePlus2() {

        label: for (int i = 2; i <= 100; i++) {

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue label;
                }
            }

            System.out.print(i+ " ");

        }

    }
}
