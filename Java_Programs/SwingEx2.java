import javax.swing.*;
import  java.awt.event.*;

class SwingEx2
{



  public static void main(String argc[])
  {

      JFrame j1 = new JFrame("Registration form");

      JButton b1 = new JButton("SAVE");

      b1.setBounds(50,50,100,50);

	        b1.addActionListener(new ActionListener(){

	  		  public void actionPerformed(ActionEvent ae)
	  		  {

	  			  System.out.println("Saved Succefully");


	  		  }

	  		  });

       j1.add(b1);

	   j1.setLayout(null);
	   j1.setSize(300,300);
	   j1.setVisible(true);




  }




}