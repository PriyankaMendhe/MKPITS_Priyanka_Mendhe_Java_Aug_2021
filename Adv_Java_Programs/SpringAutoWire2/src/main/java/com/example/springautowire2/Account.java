package com.example.springautowire2;

public class Account {

    Employee eob;

//    constructor type autoWire/ injection
//    public Account(Employee eob) {
//        this.eob = eob;
//    }


    // byname and byType autowire
    public Employee getEob() {
        return eob;
    }

    public void setEob(Employee eob) {
        this.eob = eob;
    }



    void trans()
    {
        System.out.println(eob.getName());

    }
}
