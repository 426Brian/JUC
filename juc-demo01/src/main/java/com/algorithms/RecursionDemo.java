package com.algorithms;

public class RecursionDemo {
    public static void main(String[] args) {
        int result = add(100);

        System.out.println(result);
    }

    public static int add(int num){
        if(num == 1){
            return 1;
        }else{
            return num+add(num-1);
        }


    }
}
