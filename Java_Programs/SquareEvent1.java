// square

import java.awt.*;

import java.awt.event.*;

class SquareEvent1 extends Frame implements ActionListener{

SquareEvent1()
{

Button b1 = new Button("ok");
b1.setBounds(120,100,80,40);
// register button component with listner
b1.addActionListener(this);
add(b1);
setLayout(null);
setSize(300,300);
setTitle("Square");
setVisible(true);

}

public void actionPerformed(ActionEvent ee)
{
	System.out.println("Button Cliked..");

}



public static void main(String argc[]){

SquareEvent1 e1 = new SquareEvent1();


}

}