//example to create a login form
import java.awt.*;
class LoginForm1{

LoginForm1()
{

Frame fr = new Frame();

//1st label as "Signin Please"

Label l3 = new Label("Sign in Please");
l3.setBounds(150,50,100,30);
fr.add(l3);

//3nd label and TextField "Username"

Label l4 = new Label("Username");
l4.setBounds(15,120,100,30);
fr.add(l4);

TextField t1 = new TextField();
t1.setBounds(150,120,200,25);
fr.add(t1);

//3rd label and TextField "Password"

Label l5 = new Label("Password");
l5.setBounds(15,160,100,30);
fr.add(l5);

TextField t2 = new TextField();
t2.setBounds(150,160,200,25);
fr.add(t2);

//4th label and TextField "Email"

Label l6 = new Label("Email");
l6.setBounds(15,200,100,30);
fr.add(l6);

TextField t3 = new TextField();
t3.setBounds(150,200,200,25);
fr.add(t3);

//5th label and TextField "Mobile no."

Label l7 = new Label("Mobile No.");
l7.setBounds(15,240,100,30);
fr.add(l7);

TextField t4 = new TextField();
t4.setBounds(150,240,200,25);
fr.add(t4);

// title, size and overall visiblity of Frame
fr.setTitle("MKPITS SOLUTION");
fr.setLayout(null);
fr.setSize(400,400);
fr.setVisible(true);

//add button to login

Button b1 = new Button("LOGIN");
b1.setBounds(140,300,100,50);
fr.add(b1);

}

public static void main(String argc[])
{


LoginForm1 l1= new LoginForm1();


}}