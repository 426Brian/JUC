package com.algorithms;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{12, 3, 3, 34, 56, 77, 432};

        for (int i = arr.length -1; i >= 0 ; i--) {
            arr[i] = arr[i]/arr[0];
        }
        System.out.println(Arrays.toString(arr));
    }
}
