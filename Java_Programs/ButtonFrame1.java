 // example to create a button inside frame usinf Frame association

 import java.awt.*;

 class ButtonFrame1 {


 ButtonFrame1()
 {
 Frame fr =new Frame();
 Button b1 = new Button("ok");// button class to create button

 b1.setBounds(150,150,100,50);//(x- cordinate, y- cordinate, width, height);

 fr.setLayout(null);

 fr.add(b1);

 fr.setSize(400,400);
 fr.setVisible(true);


 }


 public static void main(String argc[])
 {

 ButtonFrame1 b = new ButtonFrame1();


 }


}