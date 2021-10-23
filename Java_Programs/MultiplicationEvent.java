//wap to accept a num and print whether it is prime no. or not.

//wap to accept no. and print square of number
import java.awt.*;
import java.awt.event.*;
class MultiplicationEvent extends Frame implements ActionListener
{
	Label l1;
    TextArea l2;
	TextField t1;
	Button b1;
	MultiplicationEvent(){

        setLayout(null);
		setSize(400,400);
		setTitle("Square");
		setVisible(true);

		//Label & TextField

	 l1 = new Label("Enter Number:");
	l1.setBounds(20,50,100,25);
	add(l1);

    t1 = new TextField();
   t1.setBounds(130,50,100,25);
   add(t1);

    b1 = new Button("Multiplication Table");
   b1.setBounds(80,120,120,25);
   //register button component with listner
   b1.addActionListener(this);
   add(b1);

   // display table

    l2 = new TextArea(30,50);
   l2.setBounds(20,180,100,200);
   add(l2);


     }

	public void actionPerformed(ActionEvent ae)
	{
              int num = Integer.parseInt(t1.getText());

              int res = 1;
              int i;

              StringBuilder sb = new StringBuilder();

      // to print list format



          for(i=1;i<=10;i++)
          {

			  res = num * i;

			  sb.append(num+ " * " + i + " = "+res+"\n");

		  }
          l2.setText(sb.toString());


	}


	public static void main(String argc[])
	{
		MultiplicationEvent s =new MultiplicationEvent();
	}
}