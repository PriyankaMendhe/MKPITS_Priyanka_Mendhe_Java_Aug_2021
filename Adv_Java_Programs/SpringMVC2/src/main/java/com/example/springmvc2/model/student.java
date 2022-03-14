package com.example.springmvc2.model;

import javax.persistence.*;

@Entity
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    private String sname;
    private String lastname;
    private String addr;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
