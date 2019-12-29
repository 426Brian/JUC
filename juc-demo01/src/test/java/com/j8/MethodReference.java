package com.j8;

import com.entity.Employee;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用：
 * 1. 使用场景：当要传递的Lambda 体的操作, 已经有实现方法了, 可以使用方法引用
 * 2. 方法引用, 本质上就是Lambda 表达式, 而Lambda 表达式作为函数式接口的实例,
 * 所以方法引用也是函数式接口的实例。
 * 3. 使用格式： 类(或对象):: 方法名
 * 4. 具体
 * 对象:: 非静态方法
 * 类:: 静态方法
 * <p>
 * 类:: 非静态方法
 * 5. 方法引用的要求, 要求抽象接口中的方法的形参类别和返回值类型和方法引用的形参列表和返回值类型一致。
 */
public class MethodReference {

    /**
     * 1. 对象调用实例方法
     */
    @Test
    public void test() {
        Consumer<String> consumer = s -> {
            System.out.println();
        };

        PrintStream ps = System.out;

        Consumer<String> consumer1 = ps::println;
        consumer1.accept("method reference");
    }

    @Test
    public void test2() {
        Employee emp = new Employee(1001, "马化腾", 34, 6000.38);
        Supplier<String> supplier = () -> emp.getName();

    }

    /**
     *
     */
    @Test
    public void test3() {
        Comparator<Integer> com = (o1, o2) -> Integer.compare(o1, o2);
        com.compare(12, 21);

        Comparator<Integer> com2 = Integer::compare;
        com2.compare(12, 21);

    }

    /**
     * 2. 类的静态方法
     * Function<T, R>   R get(T, R)
     * Math             Long round(Double d)
     */
    @Test
    public void test4() {
        Function<Double, Long> function = d -> Math.round(d);
        Function<Double, Long> function2 = Math::round;
        System.out.println(function2.apply(12.6));
    }

    /**
     * 3. 类的实例方法
     * Comparator<Integer>
     */
    @Test
    public void test5() {
        Comparator<String> comp1 = (s1, s2) -> s1.compareTo(s2);

        Comparator<String> com2 = String::compareTo;
        System.out.println(com2.compare("abd", "abm"));
    }

    @Test
    public void test6() {
        BiPredicate<String, String> pre1 = (s1, s2) -> s1.equals(s2);

        BiPredicate<String, String> pre2 = String::equals;
        System.out.println(pre2.test("abc", "abc"));

    }

    @Test
    public void test7() {
        Function<Employee, String> function = Employee::getName;
        Employee emp = new Employee(1001, "马化腾", 34, 6000.38);

        System.out.println(function.apply(emp));
    }
}
