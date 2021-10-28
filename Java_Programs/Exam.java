//checkBox

import java.awt.*;
import java.awt.event.*;

class Exam extends Frame
{

   Checkbox r1,r2 ;
   CheckboxGroup cbg1;
   Label l1 , l2,l3;
   Button b1;

  Exam()
  {
	   l1= new Label("Select Gender");
	   l1.setBounds(20,50,100,25);
	   add(l1);
	  cbg1 = new CheckboxGroup();// to set one at a time on
	  r1 = new Checkbox("Male",cbg1,true);
	  r1.setBounds(100,100,100,50);
	  add(r1);

      r2 = new Checkbox("Female",cbg1, false);
	  r2.setBounds(250,100,100,50);
	  add(r2);

	  b1 = new Button("ok");
	  b1.setBounds(150,200,100,25);

	  b1.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent ae){

//whileButton getState() to get bolleanValue as true/false
      if(r1.getState()==true){

		  l3.setText("Gender Selected: Male");
	}else
	{
         if(r2.getState()==true){
		l3.setText("Gender Selected: Female");
	      }
	     else
	     {l3.setText("Gender Selected:");}
	}


	 }} );
	  add(b1);

	  l3= new Label("Gender Selected:");
	  	   l3.setBounds(20,250,200,25);
	   add(l3);



      setLayout(null);
	  setSize(400,400);
	  setVisible(true);


  }



public static void main(String[] rags){

Exam e = new Exam();


}

}