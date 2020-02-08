package com.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {

    @Test
    public void test1() {
        Person person = new Person("Tom", 12);
        person.age = 11;
        System.out.println(person.toString());

        person.show();
    }

    @Test
    public void test2() {
        Class<Person> clazz = Person.class;
        Constructor<Person> cons = null;
        Person tom = null;
        try {
            cons = clazz.getConstructor(String.class, int.class);
            tom = cons.newInstance("Tom", 12);
            System.out.println(tom);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Field[] fields = clazz.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }
    }
}
