//Simple example of Swing by inheritance

import javax.swing.*;
import java.awt.event.*;

class SwingInheritance1 extends JFrame
{


    SwingInheritance1()
        {

             JTextField t1 = new JTextField();
			               t1.setBounds(50,150,100,52);
			               add(t1);


              JButton b2 = new JButton("SAVE");

              b2.setBounds(50,50,100,50);

              b2.addActionListener(new ActionListener(){

   			  public void actionPerformed(ActionEvent ae)
   			  {
				  t1.setText( "Saved Succeed" );
   				  //System.out.println("Saved Succeed");

   			  }

   			   });
               add(b2);


        	   setLayout(null);
        	    setSize(300,300);
        	    setVisible(true);



        }





public static void main(String argc[])
{


SwingInheritance1 sI = new SwingInheritance1();

}


}