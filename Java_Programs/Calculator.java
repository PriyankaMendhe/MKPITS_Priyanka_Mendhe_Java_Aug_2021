// create calculator design

// by inheritance
import java.awt.*;
class Calculator extends Frame{

Calculator(){

// Textfield

TextField t1 = new TextField();
t1.setBounds(15,50,250,50);
add(t1);

//Button 1

Button b1 = new Button("1");
b1.setBounds(15,125,75,40);
add(b1);

//Button 2

Button b2 = new Button("2");
b2.setBounds(100,125,75,40);
add(b2);

//Button 3

Button b3 = new Button("3");
b3.setBounds(185,125,75,40);
add(b3);

//Button 4

Button b4 = new Button("4");
b4.setBounds(15,170,75,40);
add(b4);

//Button 5

Button b5 = new Button("5");
b5.setBounds(100,170,75,40);
add(b5);

//Button 6

Button b6 = new Button("6");
b6.setBounds(185,170,75,40);
add(b6);

//Button 7

Button b7 = new Button("7");
b7.setBounds(15,215,75,40);
add(b7);

//Button 8

Button b8 = new Button("8");
b8.setBounds(100,215,75,40);
add(b8);

//Button 9

Button b9 = new Button("9");
b9.setBounds(185,215,75,40);
add(b9);

//Button +

Button b10 = new Button("+");
b10.setBounds(15,260,75,40);
add(b10);

//Button 0

Button b11 = new Button("0");
b11.setBounds(100,260,75,40);
add(b11);

//Button =

Button b12 = new Button("=");
b12.setBounds(185,260,75,40);
add(b12);

//Button -

Button b13 = new Button("-");
b13.setBounds(15,305,75,40);
add(b13);

//Button C

Button b14 = new Button("C");
b14.setBounds(100,305,75,40);
add(b14);

//Button *

Button b15 = new Button("*");
b15.setBounds(185,305,75,40);
add(b15);




//layout
	setSize(280,380);
	setLayout(null);
	setVisible(true);





}





public static void main(String argc[]){

Calculator c1 = new Calculator();


}

}

