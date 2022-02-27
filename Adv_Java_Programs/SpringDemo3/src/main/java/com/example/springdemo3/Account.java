package com.example.springdemo3;

public class Account {

    Vehicle vob;

    public Vehicle getVob() {
        return vob;
    }

    public void setVob(Vehicle vob) {
        this.vob = vob;
    }

    void trans()
    {
        System.out.println("For vehicle name"+vob.getVname()+"with id"+vob.getId()+"Successfully transfer");

    }
}
