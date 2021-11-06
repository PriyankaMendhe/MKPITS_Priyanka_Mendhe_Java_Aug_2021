
//with adapter using listner Interface

import java.awt.*;
import java.awt.event.*;
class MouseEx2 extends Frame
{
	MouseEx2()
	{

       addMouseMotionListener(new mymouseadapter(this));
		setSize(300,300);
		setLayout(null);
		setVisible(true);



	}

	public static void main(String args[])
	{
		MouseEx2 m = new MouseEx2();

	}

}
//creating adapter class

class mymouseadapter extends MouseMotionAdapter
{

	MouseEx2 m1;
	mymouseadapter(MouseEx2 m1)
	{
		this.m1 = m1;

	}

	public void mouseMoved(MouseEvent me)
	{

		System.out.println("X: "+me.getX() + "Y: "+me.getY());

	}

}




