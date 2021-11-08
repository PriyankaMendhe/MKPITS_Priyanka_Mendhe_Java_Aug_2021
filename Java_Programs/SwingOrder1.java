//Order

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class SwingOrder1 extends JFrame implements ActionListener{

	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;

	JTextField t1,t2,t3,t4;

	JButton b1;

	JComboBox jb1;

SwingOrder1(){

//Customer Name

l1 = new JLabel("Customer Name :");
l1.setBounds(20,40,120,25);
add(l1);

t1 = new JTextField();
t1.setBounds(150,40,200,25);
add(t1);

//Product Name
l2 = new JLabel("Product Name :");
l2.setBounds(20,70,120,25);
add(l2);

String pname [] ={"Dosa","Idli","Samosa","Dhokla","Sandwitch"};

jb1 = new JComboBox(pname);
jb1.setBounds(150,70,200,25);
add(jb1);

//Product Rate
l4 = new JLabel("Product Rate :");
l4.setBounds(20,100,120,25);
add(l4);

t2 = new JTextField();
t2.setBounds(150,100,200,25);
add(t2);

//Product Quantity
l5 = new JLabel("Product Quantity :");
l5.setBounds(20,130,120,25);
add(l5);

t3 = new JTextField();
t3.setBounds(150,130,200,25);
add(t3);

//Button

b1 = new JButton("Order");
b1.setBounds(100,180,200,25);
b1.addActionListener(this);
add(b1);


// Order Status

l6 = new JLabel("::Order Status::");
l6.setBounds(20,210,200,25);
add(l6);

//display Customer Name, Product Name, Rate and Quantity

l7 = new JLabel("Customer Name :");
l7.setBounds(20,240,200,25);
add(l7);

l8 = new JLabel("Product Name :");
l8.setBounds(20,270,200,25);
add(l8);

l9 = new JLabel("Product Rate :");
l9.setBounds(20,300,120,25);
add(l9);

l10 = new JLabel("Product Quantity :");
l10.setBounds(20,330,120,25);
add(l10);

l11 = new JLabel("Total Amount:");
l11.setBounds(20,360,120,25);
add(l11);


	//set size , layout,title

	setTitle("Order");
	setSize(400,500);
	setLayout(null);
	setVisible(true);


}

public void actionPerformed(ActionEvent ae)
   {
      StringBuilder sb1 = new StringBuilder();

    l7.setText("Customer Name :"+t1.getText());
    sb1.append("Customer Name :"+t1.getText()+"\n");

    l8.setText("Product Name :"+jb1.getItemAt(jb1.getSelectedIndex()));

    sb1.append("Product Name :"+jb1.getItemAt(jb1.getSelectedIndex())+"\n");

    l9.setText("Product Rate :"+t2.getText());
    sb1.append("Product Rate :"+t2.getText()+"\n");

    l10.setText("Product Quantity :"+t3.getText());

    sb1.append("Product Quantity :"+t3.getText()+"\n");

    int rate =Integer.parseInt(t2.getText());

    int qu =Integer.parseInt( t3.getText());

    int total = rate * qu;

    l11.setText("Total Amount: "+total);

    sb1.append("Total Amount: "+total);

StringBuilder sb = new StringBuilder();

sb.append(sb1.toString());
JOptionPane.showMessageDialog(this ,sb.toString());

   }


public static void main(String args[])
{

SwingOrder1 s1 = new SwingOrder1();





}

}