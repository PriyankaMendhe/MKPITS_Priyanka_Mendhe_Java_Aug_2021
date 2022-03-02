package com.example.springautowireandqualifireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Account {

    Employee eob;

    public Employee getEob() {
        return eob;
    }


    @Autowired
    @Qualifier("MYBEAN")
    public void setEob(Employee eob) {
        this.eob = eob;
    }

   

    @Override
    public String toString() {
        return "Account{" +
                "eob=" + eob +
                '}';
    }
}
