//another program to accept 2 no. from the user and display the additon of 2 no.

import java.util.*;
import java.awt.*;
import java.awt.event.*;
//annoymus class
class AnnEventAddition extends Frame
{
	Label l1, l2;
	TextField t1, t2,t3;
	Button b1;
      AnnEventAddition()
      {
		  l1 = new Label("Enter Number 1 :");
		  l1.setBounds(25,50,100,25);
		  add(l1);

		   l2 = new Label("Enter Number 2 :");
		   l2.setBounds(25,90,100,25);
		  add(l2);

       t1 = new TextField();
       t1.setBounds(130,50,100,25);
       add(t1);

       t2 = new TextField();
       t2.setBounds(130,90,100,25);
       add(t2);

       b1 = new Button("Calculate");
       b1.setBounds(50,150,100,25);

       t3 = new TextField();
       t3.setBounds(50,200,100,25);
       add(t3);




     //ActionListner

    b1.addActionListener(new ActionListener(){


		public void actionPerformed(ActionEvent ae){

		double num1 = Double.parseDouble(t1.getText());

		double num2 = Double.parseDouble(t2.getText());



		t3.setText("Addition is "+(num1+num2));

}});
       add(b1);





		 //set title, layout, visiblity,size

		 setSize(400,400);
		 setLayout(null);
		 setVisible(true);
		 setTitle("Addition");


	  }

	public static void main(String argc[])
	{
		AnnEventAddition a = new AnnEventAddition();

	}
}