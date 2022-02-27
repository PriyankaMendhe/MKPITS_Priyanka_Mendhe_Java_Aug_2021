package com.example.springconstructor;

public class Account {

    Employee e1;

    public Employee getE1() {
        return e1;
    }

    public Account(Employee e1) {
        this.e1 = e1;
    }

    void trans()
    {

        System.out.println("For EMployee name"+e1.getName()+"with id"+e1.getId()+"Successfully transfer");


    }
}
