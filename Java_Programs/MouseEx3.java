
//with adapter using listner Interface

import java.awt.*;
import java.awt.event.*;
class MouseEx3 extends Frame
{
	TextField t1;
	Label l1;

	MouseEx3()
	{

		l1 = new Label("MouseMotion on Layout");
		l1.setBounds(20,50,200,50);
		add(l1);

		t1 = new TextField();
		t1.setBounds(20,200,200,50);
		add(t1);

    //MouseMotionListner
     addMouseMotionListener(new mymouseadapter(this));

		setSize(300,300);
		setLayout(null);
		setVisible(true);



	}

	public static void main(String args[])
	{
		MouseEx3 m = new MouseEx3();

	}

}
//creating adapter class

class mymouseadapter extends MouseMotionAdapter
{

	MouseEx3 m1;
	mymouseadapter(MouseEx3 m1)
	{
		this.m1 = m1;

	}

	public void mouseMoved(MouseEvent me)
	{

        m1.t1.setText("X : "+me.getX() +"&"+ " Y: "+me.getY()+"   Cordinate");

		System.out.println("X: "+me.getX() + "Y: "+me.getY());

	}

}




