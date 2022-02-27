package com.example.springdemo3;

public class Vehicle<get> {

    int id;
    String vname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public void vehicleName()
    {
        System.out.println("KIA: other details are "+getVname()+getId());
    }


}
