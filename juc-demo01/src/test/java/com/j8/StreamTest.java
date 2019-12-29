package com.j8;

import com.entity.EmployeData;
import com.entity.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 1. Stream 关注数据的运算, 与CPU 打交道
 * 集合关注的是数据的存储, 与内存打交道
 * 2.
 */
public class StreamTest {

    @Test
    public void test() {
        List<Employee> list = EmployeData.getEmployees();

        // 顺序流
        Stream<Employee> stream = list.stream();

        // 并行流
        Stream<Employee> parralleStream = list.parallelStream();
    }


    @Test
    public void test2() {
        int[] ints = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(ints);

        Employee e1 = new Employee(1001, "Tom");
        Employee e2 = new Employee(1001, "Jerry");
        Employee[] empArr = new Employee[]{e1, e2};

        Stream<Employee> stream1 = Arrays.stream(empArr);
    }

    @Test
    public void test3() {

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void test4() {
        Stream.iterate(0, t -> t + 2).limit(10).forEach(System.out::println);

        System.out.println("***************");

        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
