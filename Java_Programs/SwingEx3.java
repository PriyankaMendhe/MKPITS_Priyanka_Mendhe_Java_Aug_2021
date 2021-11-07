//codes of creating JFrame, JButton and method call inside the java constructor.

import javax.swing.*;
import java.awt.event.*;

class SwingEx3
{

	JFrame j1;

     SwingEx3()
     {
          j1 = new JFrame("Registration form");

           JButton b2 = new JButton("SAVE");

           b2.setBounds(50,50,100,50);

           b2.addActionListener(new ActionListener(){

			  public void actionPerformed(ActionEvent ae)
			  {
				  System.out.println("Saved Succeed");

			  }

			   });
            j1.add(b2);

     	   j1.setLayout(null);
     	   j1.setSize(300,300);
     	   j1.setVisible(true);



     }





public static void main(String argc[])
{

SwingEx3 s = new SwingEx3();




}

}