package com.jucInfo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class TestCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadCall threadCall = new ThreadCall();
        FutureTask<Integer> result = new FutureTask<>(threadCall);

        new Thread(result).start();

        Integer out = result.get();
        System.out.println(out);

    }
}

class ThreadCall implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100000; i++) {
            System.out.println("i ** = " + i);
            sum += i;
        }
        return sum;
    }
}