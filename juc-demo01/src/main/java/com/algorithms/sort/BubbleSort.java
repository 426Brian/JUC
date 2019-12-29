package com.algorithms.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        reverseBubble();

    }

    /**
     * 冒泡法两两比较, 将大的依次往后排
     */
    public static void bubble() {
        int[] arr = new int[]{43, 32, 7, -89, 0, 64, 33, -21, 99, 32};


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    /**
     * 反冒泡法两两比较, 将小的依次往前排
     */
    public static void reverseBubble() {
        int[] arr = new int[]{43, 32, 7, -89, 0, 64, 33, -21, 99, 32};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }


}
