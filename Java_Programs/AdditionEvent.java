//wap to accept 2 no. and print Addition
import java.awt.*;
import java.awt.event.*;
class AdditionEvent extends Frame implements ActionListener
{
	Label l1, l2,l3;

	TextField t1,t2;
	Button b1;
	AdditionEvent(){

        setLayout(null);
		setSize(300,300);
		setTitle("Square");
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

    b1 = new Button("Calculate Addition:");
   b1.setBounds(80,150,150,25);
   //register button component with listner
   b1.addActionListener(this);
   add(b1);

   // display SquARE

    l3 = new Label("Addition of 2 No.");
   l3.setBounds(20,200,100,25);
   add(l3);


     }

	public void actionPerformed(ActionEvent ae)
	{
              int num1 = Integer.parseInt(t1.getText());
              //System.out.println("Num "+num1);

              int num2 = Integer.parseInt(t2.getText());

              int add = num1 + num2;
              //overlapp label 2 text as
              l3.setText("Addition: "+add);


	}


	public static void main(String argc[])
	{
		AdditionEvent s =new AdditionEvent();
	}
}