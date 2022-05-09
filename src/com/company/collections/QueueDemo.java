package com.company.collections;

import java.util.*;

public class QueueDemo {
    public static void show(){
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(10);
        queue.offer(30);
        queue.offer(9);
        queue.offer(40);
        queue.offer(5);
//        String peek = queue.poll();
//        System.out.println(peek);
        // z -> y -> b -> a -> c
        // z -> y -> c -> b -> a
//        var remove = queue.element();
//        System.out.println(remove);
//        System.out.println(queue);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
