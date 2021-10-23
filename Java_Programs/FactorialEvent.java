//wap to accept no. and print square of number
import java.awt.*;
import java.awt.event.*;
class FactorialEvent extends Frame implements ActionListener
{
	Label l1, l2;

	TextField t1;
	Button b1;
	FactorialEvent(){

        setLayout(null);
		setSize(300,300);
		setTitle("Square");
		setVisible(true);

		//Label & TextField

	 l1 = new Label("Enter Number:");
	l1.setBounds(20,50,100,25);
	add(l1);

    t1 = new TextField();
   t1.setBounds(130,50,100,25);
   add(t1);

    b1 = new Button("Calculate Factorial:");
   b1.setBounds(80,120,120,25);
   //register button component with listner
   b1.addActionListener(this);
   add(b1);

   // display SquARE

    l2 = new Label("Factorial");
   l2.setBounds(20,200,100,30);
   add(l2);


     }

	public void actionPerformed(ActionEvent ae)
	{
              int num1 = Integer.parseInt(t1.getText());
              System.out.println("Num "+num1);

              int fact=1;

              while(num1>=1)
              {
				 fact = num1 * fact;
				  num1--;
		      }
              //overlapp label 2 text as
              l2.setText("Factorial : "+fact);


	}


	public static void main(String argc[])
	{
		FactorialEvent s =new FactorialEvent();
	}
}