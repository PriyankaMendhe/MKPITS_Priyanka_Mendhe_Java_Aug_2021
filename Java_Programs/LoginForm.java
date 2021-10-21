//example to create a login form
import java.awt.*;
class LoginForm{

LoginForm()
{

Frame fr = new Frame();

// 1st lable as "MKPITS Solution"
Label l2 = new Label("MKPITS Solution");
l2.setBounds(150,50,100,30);//(x- cordinate, y- cordinate, width, height);
fr.add(l2);

//2nd label as "Signin Please"

Label l3 = new Label("Sign in Please");
l3.setBounds(155,75,200,35);
fr.add(l3);

//3rd label and TextField

Label l4 = new Label("Username");
l4.setBounds(15,120,100,30);
fr.add(l4);

TextField t1 = new TextField();
t1.setBounds(150,120,200,25);
fr.add(t1);

//4th label and TextField

Label l5 = new Label("Password");
l5.setBounds(15,160,100,30);
fr.add(l5);

TextField t2 = new TextField();
t2.setBounds(150,160,200,25);
fr.add(t2);

// title, size and overall visiblity of Frame
fr.setTitle("MKPITS SOLUTION");
fr.setLayout(null);
fr.setSize(400,300);
fr.setVisible(true);

//add button to login

Button b1 = new Button("Login");
b1.setBounds(140,220,100,50);
fr.add(b1);

}

public static void main(String argc[])
{


LoginForm l1= new LoginForm();


}}