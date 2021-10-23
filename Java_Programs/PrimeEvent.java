//wap to accept a num and print whether it is prime no. or not.

//wap to accept no. and print square of number
import java.awt.*;
import java.awt.event.*;
class PrimeEvent extends Frame implements ActionListener
{
	Label l1, l2;

	TextField t1;
	Button b1;
	PrimeEvent(){

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

    b1 = new Button("Check Prime or not");
   b1.setBounds(80,120,120,25);
   //register button component with listner
   b1.addActionListener(this);
   add(b1);

   // display SquARE

    l2 = new Label("Result");
   l2.setBounds(20,200,200,30);
   add(l2);


     }

	public void actionPerformed(ActionEvent ae)
	{
              int num = Integer.parseInt(t1.getText());


           int i;

           for(i=2;i<num;i++)
           {

              if(num%i==0)
              {
				  l2.setText("Result:  "+num+ "  is not Prime Number");
				  break;
		      }
	       }

	       if(num==i)
	       {
			    l2.setText("Result:  "+num+ "   is Prime Number");

		   }


	}


	public static void main(String argc[])
	{
		PrimeEvent s =new PrimeEvent();
	}
}