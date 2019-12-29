package com.algorithms.sort;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{43, 32, 7, -89, 0, 64, 33, -21, 99, 32};

        int[] arrOriginal = Arrays.copyOf(arr, arr.length);

        insert_index(arr, 2, 22);

        delete_index(arrOriginal, 3);
    }

    public static int insert_index(int[] arr, int index, int target) {
        int[] arrOriginal = Arrays.copyOf(arr, arr.length);

        if (index < 0 || index > arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = arr.length - 1; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            int tmp = arr[index];
            arr[index] = target;

            System.out.println("insert_index original arr  " + Arrays.toString(arrOriginal));
            System.out.println("insert_index new arr       " + Arrays.toString(arr));
            // 返回被覆盖的值
            return tmp;
        }

    }

    public static int delete_index(int[] arr, int index) {
        int[] arrOriginal = Arrays.copyOf(arr, arr.length);
        if (index < 0 || index > arr.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            System.out.println("delete_index original arr  " + Arrays.toString(arrOriginal));
            System.out.println("delete_index new arr       " + Arrays.toString(arr));
            // 返回被覆盖的值
            return arr[index];
        }
    }
}
