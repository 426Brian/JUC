package com.j8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * java 内置四大核心函数式接口
 * 消费型 Consumer<T>      void accept(T t)
 * 供给型 Supplier<T>      T get();
 * 函数型 Function<T,      R apply(T t)
 * 断定型 Predicate<T>     boolean test(T t)
 */
public class LambdaTestPackage {

    @Test
    public void test() {
        happyTime(500, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("学习太累了, 去天上人间买了瓶矿泉水, 消费了" + aDouble);
            }
        });

        happyTime(1500, money -> {
            System.out.println("学习太累了, 去天上人间买了瓶矿泉水, 消费了" + money + "RMB, 好贵的水");
        });

    }

    public void happyTime(double money, Consumer<Double> con) {
        con.accept(money);
    }

    @Test
    public void test2() {
        List<String> list = Arrays.asList("北京", "南京", "天津", "东京", "西京", "普京");

         list = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s != null && s.contains("京")) {
                    return true;
                } else {
                    return false;
                }

            }
        });

        System.out.println(list);

        list = filterString(list, str-> str.contains("京"));

        System.out.println(list);
    }

    // 根据给定的规则, 过滤List 中的字符串
    public List filterString(List<String> list, Predicate<String> pre) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (String str : list) {
            if(pre.test(str)){
                arrayList.add(str);
            }
        }

        return arrayList;
    }
}
