//Simple example of Swing by inheritance

import javax.swing.*;
import java.awt.event.*;

class SwingInheritance extends JFrame
{


    SwingInheritance()
        {


              JButton b2 = new JButton("SAVE");

              b2.setBounds(50,50,100,50);

              b2.addActionListener(new ActionListener(){

   			  public void actionPerformed(ActionEvent ae)
   			  {
   				  System.out.println("Saved Succeed");

   			  }

   			   });
               add(b2);

        	   setLayout(null);
        	    setSize(300,300);
        	    setVisible(true);



        }





public static void main(String argc[])
{


SwingInheritance sI = new SwingInheritance();

}


}