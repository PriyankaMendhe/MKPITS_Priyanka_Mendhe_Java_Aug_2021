package com.example.springautowire2;

public class Employee {

    private String name;

    private int id;

    Account aob;

    public Account getAob() {
        return aob;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }


    void display()
    {
        System.out.println(getName());

    }
}
