package com.jucInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyOnWriteArrayList {
    public static void main(String[] args) {
        HelloThread helloThread = new HelloThread();
        for (int i = 0; i < 10; i++) {
            new Thread(helloThread).start();
        }
    }
}

class HelloThread implements Runnable {
//    private static List<String> list = Collections.synchronizedList(new ArrayList<String>());

    private static CopyOnWriteArrayList list = new CopyOnWriteArrayList();

    static {
        list.add("AA");
        list.add("BB");
        list.add("CC");
    }


    @Override
    public void run() {

        Iterator<String> it = list.iterator();

            while (it.hasNext()) {
            System.out.println(it.next());
            list.add("AA");
        }
    }
}
