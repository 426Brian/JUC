package com.j8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class LambdaTest {

    /**
     * 1. 无参数, 无返回值
     */
    @Test
    public void test1() {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable test");
            }
        };
        runnable1.run();

        Runnable runnable = () -> {
            System.out.println("runnable lamda test");
        };
        runnable.run();
    }


    /**
     * 2. 一个参数, 无返回值
     */
    @Test
    public void test2() {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumer.accept("谎言和誓言的区别是什么");

        Consumer<String> consumer1 = (String s) -> {
            System.out.println(s);
        };

        consumer1.accept("一个是说的人当真了, 一个是听得人当真了");
    }

    /**
     * 3. 数据类型可以推断, 由编译器推断
     */
    @Test
    public void test3() {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        consumer.accept("谎言和誓言的区别是什么");

        Consumer<String> consumer1 = (s) -> {
            System.out.println(s);
        };

        consumer1.accept("一个是说的人当真了, 一个是听得人当真了");
    }


    /**
     * 4. 数据类型可以推断, 由编译器推断
     */
    @Test
    public void test4() {
        ArrayList<String> list = new ArrayList<>();

        int[] arr = new int[]{1, 2, 3};
        int[] arr2 = {1, 2, 3};
    }

    /**
     * 5. 有一个参数() 可以省
     */
    @Test
    public void test5() {
        Consumer<String> consumer1 = s -> {
            System.out.println(s);
        };

        consumer1.accept("一个是说的人当真了, 一个是听得人当真了");
    }

    /**
     * 6. 两个以上参数, 多条语句, 有返回值
     */
    @Test
    public void test6() {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        Comparator<Integer> comparator1 = (o1, o2) -> {
            return o1.compareTo(o2);
        };


    }

    /**
     * 6. 两个以上参数, 多条语句, 有返回值
     */
    @Test
    public void test7() {
        Comparator<Integer> comparator2 = (o1, o2) -> Integer.compare(o1, o2);
        comparator2.compare(12, 21);
    }

    /**
     * 总结：
     * Lamda 左边：形参列表可以省略, 如果只有一个参数, () 可以省略, 参数两个或以上() 不能省略。
     *       右边：如果只有一条语句, return 可以省略。 多条语句需要{};
     */
}
