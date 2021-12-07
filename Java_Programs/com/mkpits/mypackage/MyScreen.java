package com.mkpits.mypackage;
import customers.customer;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyScreen extends JFrame {
   public MyScreen()
    {

         JButton jb1 = new JButton("OK");
         jb1.setBounds(20,50,50,50);
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
    public static void main()
    {

        MyScreen m = new MyScreen();

    }
}
