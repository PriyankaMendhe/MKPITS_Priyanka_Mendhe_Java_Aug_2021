import java.awt.*;
import java.awt.event.*;
class MouseEx extends Frame implements MouseListener, MouseMotionListener
{
	MouseEx()
	{

       addMouseListener(this);
		setSize(300,300);
		setLayout(null);
		setVisible(true);



	}
	public void mouseExited(MouseEvent me){

	}
	public void mouseEntered(MouseEvent me){

	}
	public void mouseReleased(MouseEvent me){

	}
	public void mousePressed(MouseEvent me){

	}
	public void mouseClicked(MouseEvent me){

		System.out.println("MouseClicked Method Executed and Mouse CLicked on Layout");


	}
	public void mouseMoved(MouseEvent me){

	}
	public void mouseDragged(MouseEvent me){

	}


	public static void main(String args[])
	{
		MouseEx m = new MouseEx();

	}

}