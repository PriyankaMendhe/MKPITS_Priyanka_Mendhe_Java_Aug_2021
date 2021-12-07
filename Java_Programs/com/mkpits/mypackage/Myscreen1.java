package com.mkpits.mypackage;
import customers.customer;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyScreen1 extends JFrame {

    MyScreen1()
    {

        JButton jb1 = new JButton("OK");
        jb1.setBounds(20,50,100,50);
        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                customer c = new customer();
                c.display();

            }
        });
        add(jb1);
        setSize(400,400);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String args[])
    {

        MyScreen1 m = new MyScreen1();

    }
}
