package com.company.collections;

public class Customer implements Comparable<Customer>{
    private String name, email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Customer o) {
        return this.name.compareTo(o.name);
    }

    public String getEmail() {
        return email;
    }
}
