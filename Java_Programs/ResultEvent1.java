//wap to accept 3 subject marks and display total, percentage and grade;

//wap to accept 2 no. and create buttons for  addtion , substraction and multiplication using button


import java.awt.*;
import java.awt.event.*;
class ResultEvent1 extends Frame implements ActionListener
{
	Label l1, l2,l3,l4,l5,l6;

	TextField t1,t2,t3;
	Button b1;
	ResultEvent1(){

        setLayout(null);
		setSize(300,400);
		setTitle("Basic Calculation");
		setVisible(true);

		//Label & TextField

	 l1 = new Label("Enter Marks1:");
	l1.setBounds(20,50,100,25);
	add(l1);

    t1 = new TextField();
   t1.setBounds(130,50,100,25);
   add(t1);

    l2 = new Label("Enter Marks2:");
   	l2.setBounds(20,80,100,25);
   	add(l2);

   t2 = new TextField();
   t2.setBounds(130,80,100,25);
   add(t2);

   l4= new Label("Enter Marks3:");
   l4.setBounds(20,110,100,25);
   add(l4);

   t3 = new TextField();
   t3.setBounds(130,110,100,25);
   add(t3);

//Button
    b1 = new Button("Calculate Result");
   b1.setBounds(100,150,100,25);
   //register button component with listner
   b1.addActionListener(this);
   add(b1);


   // display Result

   l3 = new Label("Total");
   l3.setBounds(20,200,100,25);
   add(l3);

   l5 = new Label("Percentage");
   l5.setBounds(20,225,100,25);
   add(l5);

   l6 = new Label("Grade");
   l6.setBounds(20,250,100,25);
   add(l6);





     }

	public void actionPerformed(ActionEvent ae)
	{      char grade;
              int m1 = Integer.parseInt(t1.getText());
              //System.out.println("Num "+num1);

              int m2 = Integer.parseInt(t2.getText());

              int m3 = Integer.parseInt(t3.getText());

              int total = m1 +m2+m3;
              l3.setText("Total: "+total);

              float per = (float) (total/300.0f) * 100.0f;
              l5.setText("Percentage: "+per);

              if(per>75)
              {
				  grade = 'A';
				   l6.setText("Grade: "+grade);

			  }
			  else if(per>=60 && per<75)
			  {
				  grade = 'B';
				   l6.setText("Grade: "+grade);

			  }else if(per>=50 && per<60)
			  {
				  grade = 'C';
				   l6.setText("Grade: "+grade);

			  }else
			  {
				  grade = 'D';
				   l6.setText("Grade: "+grade+".......Fail!!");

			  }

             // l6.setText("Grade: "+grade);

	}


	public static void main(String argc[])
	{
		ResultEvent1 s =new ResultEvent1();
	}
}