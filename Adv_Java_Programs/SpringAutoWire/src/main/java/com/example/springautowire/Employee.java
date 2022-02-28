package com.example.springautowire;

public class Employee {

    int id;
    String name;



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

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
