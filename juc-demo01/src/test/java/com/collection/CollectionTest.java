package com.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class CollectionTest {

    @Test
    public void test() {
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("BB");
        coll.add(121);
        coll.add(new Date());


        System.out.println(coll.size());

    }

}
