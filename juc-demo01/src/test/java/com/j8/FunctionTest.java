package com.j8;

import org.junit.Test;

import java.util.function.Function;

public class FunctionTest {

    @Test
    public void composeTest() {
        System.out.println(compute(2, value -> 3 * value, value -> value * value));
        System.out.println(compute2(2, value -> 3 * value, value -> value * value));
    }


    public int compute(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a, Function<Integer, Integer> function1, Function<Integer, Integer> function2) {
        return function1.andThen(function2).apply(a);
    }
}
