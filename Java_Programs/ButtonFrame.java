// example to create a button inside frame

import java.awt.*;

class ButtonFrame extends Frame{


ButtonFrame()
{

Button b1 = new Button("ok");// button class to create button

b1.setBounds(150,150,100,50);//(x- cordinate, y- cordinate, width, height);

setLayout(null);

add(b1);

setSize(400,400);
setVisible(true);


}


public static void main(String argc[])
{

ButtonFrame b = new ButtonFrame();


}


}