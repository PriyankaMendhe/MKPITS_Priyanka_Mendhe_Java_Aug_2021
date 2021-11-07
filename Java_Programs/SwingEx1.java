//Swing
//example where we are creating one button and adding it on the JFrame object inside the main() method.

import javax.swing.*;
import  java.awt.event.*;

class SwingEx1
{



  public static void main(String argc[])
  {

      JFrame j1 = new JFrame("MKPITS");

      JButton b = new JButton("OK");
      b.setBounds(50,50,100,50);
      j1.add(b);

	  	j1.setLayout(null);
	  	j1.setSize(300,300);
	    j1.setVisible(true);




  }




}