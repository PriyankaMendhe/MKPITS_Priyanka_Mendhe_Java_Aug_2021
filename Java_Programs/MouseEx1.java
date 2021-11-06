
//with adapter using listner Interface

import java.awt.*;
import java.awt.event.*;
class MouseEx1 extends Frame
{
	MouseEx1()
	{

       addMouseListener(new mymouseadapter(this));
		setSize(300,300);
		setLayout(null);
		setVisible(true);



	}

	public static void main(String args[])
	{
		MouseEx1 m = new MouseEx1();

	}

}
//creating adapter class

class mymouseadapter extends MouseAdapter
{

	MouseEx1 m1;
	mymouseadapter(MouseEx1 m1)
	{
		this.m1 = m1;

	}

	public void mouseClicked(MouseEvent me)
	{

		System.out.println("Hello");

	}

}




