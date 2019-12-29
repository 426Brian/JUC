package com.j8;

import com.entity.Employee;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReference {

    @Test
    public void test() {
        Supplier<Employee> supplier = () -> new Employee();

        Supplier<Employee> supplier2 = Employee::new;

        System.out.println(supplier.get());
    }

    @Test
    public void test2() {
        Function<Integer, Employee> function = id -> new Employee(id);

        Employee emp = function.apply(1);
        System.out.println(emp);
    }

    @Test
    public void test3() {
        Function<Integer, String[]> function = length -> new String[length];
        String[] arr = function.apply(5);

        Function<Integer, String[]> function1 = String[]::new;

        System.out.println(Arrays.asList(function1.apply(7)));
    }
}
