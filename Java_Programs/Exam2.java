//checkbox with

import java.awt.*;
import java.awt.event.*;

class Exam2 extends Frame
{

   Checkbox r1,r2,r3,r4,r5,r6;
   CheckboxGroup cbg1,cbg2,cbg3;
   Label l1 , l2,l3,l4;
   Button b1;

  Exam2()
  {
	   // Question 1
	   l1= new Label("Capital Of India?");
	   l1.setBounds(20,50,100,25);
	   add(l1);
	  cbg1 = new CheckboxGroup();// to set one at a time on
	  r1 = new Checkbox("Delhi",cbg1,true);
	  r1.setBounds(100,100,100,50);
	  add(r1);

      r2 = new Checkbox("Mumbai",cbg1, false);
	  r2.setBounds(250,100,100,50);
	  add(r2);

    //Question 2

     l2= new Label("Capital Of Maharashtra?");
		   l2.setBounds(20,160,150,25);
		   add(l2);
		  cbg2 = new CheckboxGroup();// to set one at a time on
		  r3 = new Checkbox("Mumbai",cbg2,true);
		  r3.setBounds(100,180,100,50);
		  add(r3);

	      r4 = new Checkbox("Nagpur",cbg2, false);
		  r4.setBounds(250,180,100,50);
	  add(r4);


    //Question 3

    l4= new Label("Capital Of Madhya Pradesh?");
			   l4.setBounds(20,270,150,25);
			   add(l4);
			  cbg3 = new CheckboxGroup();// to set one at a time on
			  r5 = new Checkbox("Bhopal",cbg3,true);
			  r5.setBounds(100,300,100,50);
			  add(r5);

		      r6 = new Checkbox("Jabalpur",cbg3, false);
			  r6.setBounds(250,300,100,50);
	         add(r6);


    //Question 4




	  b1 = new Button("Result");
	  b1.setBounds(150,500,100,25);

	  b1.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent ae){

       int total = 0;
//whileButton getState() to get bolleanValue as true/false
      if(r1.getState()==true)
      {
        total = total+1;
		//l3.setText("Total Score out of 3 is  "+total);
	   }

	   if(r4.getState()==true)
	   {
			 total = total+1;
		 }

				 if(r5.getState()==true)
				 {
					 total = total+1;
				 }
		     l3.setText("Total Score out of 3 is  "+total);




	 }} );
	  add(b1);

	  l3= new Label("Total Score:");
	  	   l3.setBounds(20,550,200,25);
	   add(l3);



      setLayout(null);
	  setSize(400,600);
	  setVisible(true);


  }



public static void main(String[] rags){

Exam2 e = new Exam2();


}

}