 // event handling by Annonymous class:

import java.awt.*;
import java.awt.event.*;
class AEvent3 extends Frame {

TextField tf;
AEvent3(){
tf=new TextField();
tf.setBounds(60,50,170,20);
Button b=new Button("click me");
b.setBounds(50,120,80,30);

b.addActionListener(new ActionListener(){ public void actionPerformed(ActionEvent ae){
tf.setText("hello");
}
});
add(b);
add(tf);

setSize(300,300);
setLayout(null);
setVisible(true);
}
public static void main(String args[]){
  AEvent3 a = new AEvent3();
}
}
