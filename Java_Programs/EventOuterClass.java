//event handling by Outer class:

import java.awt.*;
import java.awt.event.*;

class EventOuterClass extends Frame{

TextField tf;

EventOuterClass(){

tf=new TextField();
tf.setBounds(60,50,170,20);

Button b=new Button("click me");
b.setBounds(100,120,80,30);

Outer o=new Outer(this);
b.addActionListener(o);//passing outer class instance

add(b);add(tf);

setSize(300,300);
setLayout(null);
setVisible(true);
}
public static void main(String args[]){
EventOuterClass e = new EventOuterClass();
}
}

class Outer implements ActionListener{
EventOuterClass obj;
Outer(EventOuterClass obj){
this.obj=obj;
}
public void actionPerformed(ActionEvent e){
obj.tf.setText("welcome");
}
}
