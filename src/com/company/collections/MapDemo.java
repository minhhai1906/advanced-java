package com.company.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){
        Map<String, Customer> map = new HashMap<>();

        var customer1 = new Customer("a", "e1");
        var customer2 = new Customer("b", "e2");

        map.put(customer1.getEmail(), customer1);
        map.put(customer2.getEmail(), customer2);

        for(var customer: map.values())
            System.out.println(customer);
    }
}
