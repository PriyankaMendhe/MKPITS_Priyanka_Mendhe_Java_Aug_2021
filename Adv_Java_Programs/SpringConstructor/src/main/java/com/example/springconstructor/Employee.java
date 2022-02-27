package com.example.springconstructor;

public class Employee {

    int id;
    String name;

    Account aob;

    public Account getAob() {
        return aob;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display()
    {
        System.out.println("Id is :"+getId()+"Name is : "+getName());

    }
}
