package com.jucInfo;

import java.util.concurrent.atomic.AtomicReference;

public class ReferenceDemo {
    public static void main(String[] args) {
        User z3 = new User("z3", 22);
        User l4 = new User("l4", 25);

        AtomicReference<User> atomicReference = new AtomicReference<>();
        atomicReference.set(z3);

        System.out.println(atomicReference.compareAndSet(z3, l4) + "\t " + atomicReference.get().toString());
        System.out.println(atomicReference.compareAndSet(z3, l4) + "\t " + atomicReference.get().toString());
    }
}


class User {
    String userName;
    int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
}