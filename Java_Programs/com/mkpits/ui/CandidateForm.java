package com.mkpits.ui;
import com.mkpits.service.CandidateService;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CandidateForm extends JFrame {

    JLabel l1,l2,l3;
    JTextField t1, t2,t3;
    JButton b1;

    public CandidateForm()
    {

         l1 = new JLabel("Firstname");
         l1.setBounds(10,20,100,30);
         add(l1);

         t1= new JTextField();
         t1.setBounds(130,20,100,30);
         add(t1);

         l2 = new JLabel("Lastname");
         l2.setBounds(10,90,100,30);
         add(l2);

        t2= new JTextField();
        t2.setBounds(130,90,100,30);
        add(t2);

         b1 = new JButton("Save");
         b1.setBounds(130,200,100,30);
         b1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                 CandidateService cs = new CandidateService();

                 String res = cs.insertCandidate(t1.getText(),t2.getText());
                 l3.setText(res);
             }
         });
         add(b1);

         l3 = new JLabel("Info");
         l3.setBounds(10,300,200,30);
         add(l3);

         setSize(400,400);
         setLayout(null);
         setVisible(true);


    }
    public static void main(String args[])
    {
        CandidateForm c = new CandidateForm();

    }





}



