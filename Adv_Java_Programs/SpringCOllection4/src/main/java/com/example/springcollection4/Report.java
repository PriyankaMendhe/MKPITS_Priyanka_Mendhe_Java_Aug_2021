package com.example.springcollection4;

import java.util.Properties;

public class Report {

    Properties listemp;

    public Properties getListemp() {
        return listemp;
    }

    public void setListemp(Properties listemp) {
        this.listemp = listemp;
    }

    @Override
    public String toString() {
        return "Report{" +
                "listemp=" + listemp +
                '}';
    }
}
