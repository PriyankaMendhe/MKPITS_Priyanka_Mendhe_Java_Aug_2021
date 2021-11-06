
//keyAdapter

import java.awt.*;
import java.awt.event.*;

class AdpterEx1 extends Frame{

Label l1;
TextField t1;

AdpterEx1()

{

  l1 = new Label("MKPITS");
  l1.setBounds(10,50,250,20);
  add(l1);

  t1= new TextField();
  t1.setBounds(10,120,250,20);

  t1.addKeyListener(new keyadapterclass(this));
  add(t1);
  setSize(300,300);
setLayout(null);
setVisible(true);




}

public static void main(String args[])
{

 AdpterEx1 a = new AdpterEx1();



}

}
class keyadapterclass extends KeyAdapter
{

	AdpterEx1 ad;


	keyadapterclass(AdpterEx1 ad)
	{
		this.ad = ad;


	}

	public void keyTyped(KeyEvent ke)
	{


        char c  = ke.getKeyChar();
		System.out.println("Key Typed : "+c);
ad.l1.setText(ad.t1.getText());
	}


}

