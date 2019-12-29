package com.algorithms;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {-89, -21, 0, 7, 32, 32, 33, 43, 64, 99};

        int start = 0;
        int end = arr.length;

        int num = 43;

        while (start <= end) {
            int mid = (start + end) >>> 1;

            if(num > arr[mid]){
                start = mid+1;
            }else if(num < arr[mid]){
                end = mid -1;
            }else {
                System.out.println(mid);
                break;
            }
        }

    }
}
