//Account
import java.awt.*;
import java.awt.event.*;

class EventAccount extends Frame
{
   Label l1, l2,l3;
   TextField t1, t2;
   Checkbox r1, r2;
   CheckboxGroup cbg1;
  EventAccount()
  {

	l1 = new Label("Account No");
	l1.setBounds(20,50,100,25);
	add(l1);

	l2 = new Label("Amount");
	l2.setBounds(20,80,100,25);
	add(l2);
	t1 = new TextField();
	t1.setBounds(130,50,100,25);
	add(t1);
	t2= new TextField();
	t2.setBounds(130,80,100,25);
	add(t2);


    cbg1 = new CheckboxGroup();
	r1 = new Checkbox("deposit",cbg1,true);
	r1.setBounds(20,140,100,25);
	add(r1);

	r2 = new Checkbox("withdrawl",cbg1,false);
    r2.setBounds(150,140,100,25);
	add(r2);

	Button b1 = new Button("OK");
	b1.setBounds(130,180,100,25);

 //addActionListener

	b1.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent ae){

      int amount = Integer.parseInt(t2.getText());

      int balance = 1000;

   if(r1.getState()==true)
   {

	   balance = balance + amount ;
	    l3.setText("Successfully deposit,Balance is "+balance);


   }

   if(r2.getState()==true)
   {
         if(amount>balance){

			 l3.setText("Unable to withdraw due to insuffient fund, Balance is "+balance);

		 }else{
	   balance = balance - amount;
	    l3.setText("Successfully withdraw ,Balance is "+balance);
	}
   }







	}
});
	add(b1);

	l3 = new Label("Balance is: ");
	l3.setBounds(20,220,350,25);
	add(l3);

	setSize(400,400);
	setLayout(null);
	setVisible(true);
	setTitle("Bank");


	}


public static void main(String argc[])
{

EventAccount e = new EventAccount();

}}