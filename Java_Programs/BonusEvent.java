//wap to accept empno, empname , salary
//and display the bonus (35% if salary is greater than 20000, 25% if salary is greater than 10000 otherwise bonus =15%)
import java.awt.*;
import java.awt.event.*;
class BonusEvent extends Frame implements ActionListener
{
	Label l1,l2,l3;
    TextField t1,t2,t3;
	Button b1;
	BonusEvent(){

        setLayout(null);
		setSize(400,400);
		setTitle("Employee Bonus");
		setVisible(true);

		//Label & TextField for Emp No.

	l1 = new Label("Enter Emp No:");
	l1.setBounds(20,50,100,25);
	add(l1);

   t1 = new TextField();
   t1.setBounds(180,50,100,25);
   add(t1);

   	//Label & TextField for Emp Name

   	 l2 = new Label("Enter Employee Name:");
   	l2.setBounds(20,80,135,25);
   	add(l2);

     t2 = new TextField();
     t2.setBounds(180,80,100,25);
     add(t2);



   	//Label & TextField for Employee Salary

   	 l3 = new Label("Enter Employee Salary:");
   	l3.setBounds(20,110,140,25);
   	add(l3);

       t3 = new TextField();
      t3.setBounds(180,110,100,25);
   add(t3);

// calculate Bonus
    b1 = new Button("Calculate Bonus");
   b1.setBounds(80,160,120,25);
   //register button component with listner
   b1.addActionListener(this);
   add(b1);

// display Bonus

l3 = new Label("Bonus");
l3.setBounds(60,200,180,30);
add(l3);

     }

	public void actionPerformed(ActionEvent ae)
	{
              int sal = Integer.parseInt(t3.getText());
              float bonus;
           //35% if salary is greater than 20000, 25% if salary is greater than 10000 otherwise bonus =15%)

           if(sal>20000)
           {
			   bonus =(float) (sal + (sal * 0.35f));

		   }
		   else if(sal>10000)
		   {
			   bonus =(float) (sal + (sal * 0.25f));

		   }else{

			   bonus =(float) (sal + (sal * 0.15f));

		   }


         l3.setText("Total Salary with Bonus: "+bonus);




	}


	public static void main(String argc[])
	{
		BonusEvent s =new BonusEvent();
	}
}