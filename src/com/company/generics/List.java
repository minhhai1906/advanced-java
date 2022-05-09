package com.company.generics;

public class List {
    private int[] items = new int[10];
    private int count;

    public void add(int n){
        items[count++] = n;
    }
    public int get(int index){
        return items[index];
    }
}
