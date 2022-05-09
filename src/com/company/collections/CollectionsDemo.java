package com.company.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        Collections.addAll(collection, "x", "y", "z");
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection.equals(other));
        System.out.println(other);
    }
}


