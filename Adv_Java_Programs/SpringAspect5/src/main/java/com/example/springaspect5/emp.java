package com.example.springaspect5;

public class emp {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printThowsException()
    {
        System.out.println("Exception Raised");

        throw new IllegalArgumentException();

    }
}
