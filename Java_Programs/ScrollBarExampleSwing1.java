 //Java SWING Scrollbar Example

 import java.awt.*;
 import javax.swing.*;
 class ScrollBarExampleSwing1{

 ScrollBarExampleSwing1()
 {

     JFrame f = new JFrame("ScrollBarExample");

     Scrollbar s = new Scrollbar();

     s.setBounds(100,50,50,300);// by default vertical scrollbar

     f.add(s);
     f.setSize(400,400);
     f.setLayout(null);
     f.setVisible(true);




 }

 public static void main(String args[]){

 ScrollBarExampleSwing1 s1 = new ScrollBarExampleSwing1();
 }
 }