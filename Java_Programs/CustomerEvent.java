//wap to accept customername, productname ,product price , quantity and then display total amount.

import java.awt.*;
import java.awt.event.*;
class CustomerEvent extends Frame implements ActionListener
{
	Label l1,l2,l3,l4,l5;
    TextField t1,t2,t3,t4;
	Button b1;
	CustomerEvent(){

        setLayout(null);
		setSize(400,400);
		setTitle("Customer Info");
		setVisible(true);

		//Label & TextField for Customer Name.

	l1 = new Label("Customer Name");
	l1.setBounds(20,50,100,25);
	add(l1);

   t1 = new TextField();
   t1.setBounds(180,50,100,25);
   add(t1);

   	//Label & TextField for Product Name

   	 l2 = new Label("Product Name:");
   	l2.setBounds(20,80,135,25);
   	add(l2);

     t2 = new TextField();
     t2.setBounds(180,80,100,25);
     add(t2);



   	//Label & TextField for Product Price

   	 l3 = new Label("Product price:");
   	l3.setBounds(20,110,140,25);
   	add(l3);

       t3 = new TextField();
      t3.setBounds(180,110,100,25);
   add(t3);

   	//Label & TextField for Product Quantity

      	 l4 = new Label("Product price:");
      	l4.setBounds(20,140,140,25);
      	add(l4);

          t4 = new TextField();
         t4.setBounds(180,140,100,25);
      add(t4);


// calculate Bonus
    b1 = new Button("Calculate Total Amount");
   b1.setBounds(80,180,150,25);
   //register button component with listner
   b1.addActionListener(this);
   add(b1);

// display Bonus

l5 = new Label("Total Amount");
l5.setBounds(60,220,180,30);
add(l5);

     }

	public void actionPerformed(ActionEvent ae)
	{
              int price = Integer.parseInt(t3.getText());

              int quantity = Integer.parseInt(t4.getText());

              int total = price * quantity;



         l5.setText("Total Amount: "+total);




	}


	public static void main(String argc[])
	{
		CustomerEvent s =new CustomerEvent();
	}
}