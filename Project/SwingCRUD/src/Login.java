import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame  {

    JLabel l1, l2,l3 ;
    JTextField t1,t2;
    JButton b1 ;



    Login()
    {



        l1 = new JLabel("Username");
        l1.setBounds(10,50,100,50);

        t1 = new JTextField();
        t1.setBounds(130,50,200,30);

        l2 = new JLabel("Password");
        l2.setBounds(10,120,100,50);

        t2= new JTextField();
        t2.setBounds(130,120,200,30);

        b1 = new JButton("Login");
        b1.setBounds(150,200,100,50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if((t1.getText().equals("admin"))&&(t2.getText().equals("admin"))){

                    l3.setText("Successfully Login");

                }else
                {
                    l3.setText("Invalid Login");
                }


            }
        });
        add(b1);

        l2 = new JLabel("Status");
        l2.setBounds(10,300,100,50);


        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(b1);
        add(l3);



        setLayout(null);
        setSize(400,400);
        setVisible(true);





    }


    public static void main(String args[])
    {
        Login l1 = new Login();
    }


}
