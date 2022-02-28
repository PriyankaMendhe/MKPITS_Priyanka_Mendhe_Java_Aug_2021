package com.example.springcollection3;

public class Employee {

    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
