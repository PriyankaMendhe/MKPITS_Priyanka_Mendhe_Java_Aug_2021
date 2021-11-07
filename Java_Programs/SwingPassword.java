import javax.swing.*;
import java.awt.event.*;

class SwingPassword extends JFrame
{
      JLabel l1,l2,l3;
      JTextField t1;
      JPasswordField p1;

    SwingPassword()
        {

			l1 = new JLabel("Username");
			l1.setBounds(20,50,100,20);
			add(l1);

		  t1 = new JTextField();
		  t1.setBounds(130,50,100,20);
	      add(t1);

	      l2 = new JLabel("Password");
		  l2.setBounds(20,100,100,20);
		  add(l2);

		  p1 = new JPasswordField();
		  p1.setBounds(130,100,100,20);
	      add(p1);

	      l3 = new JLabel("Status");
	      l3.setBounds(100,200,100,50);
	      add(l3);


              JButton b2 = new JButton("Login");

              b2.setBounds(50,150,100,50);

              b2.addActionListener(new ActionListener(){

   			  public void actionPerformed(ActionEvent ae)
   			  {

				  if(t1.getText().equals("admin") && p1.getText().equals("admin"))
				  {
				  l3.setText( "Login Successful" );

			     }
			     else
			     {

				  l3.setText( "Invalid credential" );


				  }


   			  }

   			   });
               add(b2);


        	   setLayout(null);
        	    setSize(300,300);
        	    setVisible(true);



        }





public static void main(String argc[])
{


SwingPassword sI = new SwingPassword();

}


}