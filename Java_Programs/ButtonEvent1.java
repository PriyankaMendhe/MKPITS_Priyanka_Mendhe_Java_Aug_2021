//action on button

import java.awt.*;

import java.awt.event.*;

class ButtonEvent1 extends Frame implements ActionListener{

ButtonEvent1()
{

Button b1 = new Button("ok");
b1.setBounds(120,100,80,40);
// register button component with listner
b1.addActionListener(this);
add(b1);
setLayout(null);
setSize(300,300);
setVisible(true);

}

public void actionPerformed(ActionEvent ee)
{
	System.out.println("Button Cliked..");

}



public static void main(String argc[]){

ButtonEvent1 e1 = new ButtonEvent1();


}

}