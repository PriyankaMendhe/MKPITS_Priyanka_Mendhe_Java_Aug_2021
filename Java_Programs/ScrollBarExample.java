 //Java AWT Scrollbar Example

 import java.awt.*;
 class ScrollBarExample{

 ScrollBarExample()
 {

     Frame f = new Frame("ScrollBarExample");

     Scrollbar s = new Scrollbar();

     s.setBounds(100,100,50,300);

     f.add(s);
     f.setSize(400,400);
     f.setLayout(null);
     f.setVisible(true);




 }

 public static void main(String args[]){

 ScrollBarExample s1 = new ScrollBarExample();
 }
 }