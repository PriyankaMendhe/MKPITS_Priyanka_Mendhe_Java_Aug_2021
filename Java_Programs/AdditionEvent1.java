//wap to accept 2 no. and create buttons for  addtion , substraction and multiplication using button


import java.awt.*;
import java.awt.event.*;
class AdditionEvent1 extends Frame implements ActionListener
{
	Label l1, l2,l3;

	TextField t1,t2;
	Button b1,b2,b3;
	AdditionEvent1(){

        setLayout(null);
		setSize(300,300);
		setTitle("Basic Calculation");
		setVisible(true);

		//Label & TextField

	 l1 = new Label("Enter Number1:");
	l1.setBounds(20,50,100,25);
	add(l1);

    t1 = new TextField();
   t1.setBounds(130,50,100,25);
   add(t1);

    l2 = new Label("Enter Number2:");
   	l2.setBounds(20,110,100,25);
   	add(l2);

       t2 = new TextField();
      t2.setBounds(130,110,100,25);
   add(t2);

    b1 = new Button("+");
   b1.setBounds(20,150,60,25);
   //register button component with listner
   b1.addActionListener(this);
   add(b1);

   b2 = new Button("-");
      b2.setBounds(90,150,60,25);
      //register button component with listner
      b2.addActionListener(this);
   add(b2);

   b3 = new Button("*");
      b3.setBounds(160,150,60,25);
      //register button component with listner
      b3.addActionListener(this);
   add(b3);

   // display SquARE

    l3 = new Label("Result");
   l3.setBounds(20,200,100,25);
   add(l3);


     }

	public void actionPerformed(ActionEvent ae)
	{
              int num1 = Integer.parseInt(t1.getText());
              //System.out.println("Num "+num1);

              int num2 = Integer.parseInt(t2.getText());

      if(ae.getSource()==b1){
              int add = num1 + num2;
              //overlapp label 2 text as
              l3.setText("Addition: "+add);
      }
      if(ae.getSource()==b2){
	                int add = num1 - num2;
	                //overlapp label 2 text as
	                l3.setText("Substraction: "+add);
	  }
	  if(ae.getSource()==b3){
	                int add = num1 * num2;
	                //overlapp label 2 text as
	                l3.setText("Multiplication: "+add);
	  }



	}


	public static void main(String argc[])
	{
		AdditionEvent1 s =new AdditionEvent1();
	}
}