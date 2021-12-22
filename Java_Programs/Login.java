import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Login extends JFrame{

	Login()
	{

		JLabel l1,l2,l3,l4;
		JTextField t1;
		JPasswordField p1;
		JButton b1;





        l1= new JLabel("Banking System");
		l1.setBounds(140,20,200,50);
		add(l1);


		l2= new JLabel("Username");
		l2.setBounds(20,80,100,30);
		add(l2);

		t1= new JTextField();
		t1.setBounds(140,80,150,30);
		add(t1);

		l3= new JLabel("Password");
		l3.setBounds(20,150,100,30);
		add(l3);

		p1= new JPasswordField();
		p1.setBounds(140,150,150,30);
		add(p1);

		 l4 = new JLabel("Status");
		l4.setBounds(20,250,200,30);
        add(l4);

        b1= new JButton("Login");
        b1.setBounds(140,200,100,30);
        b1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){

				if(((t1.getText()).equals("admin"))&&((p1.getText()).equals("admin")))
				{
                          l4.setText("Login Successful");

				}
				else
				{

                         l4.setText("Invalid Credential");

				}








	    }

		});
        add(b1);










		setSize(400,400);
		setLayout(null);
		setVisible(true);
		setTitle("Banking System");



	}

	public static void main(String args[])
	{


		Login l = new Login();

	}


}