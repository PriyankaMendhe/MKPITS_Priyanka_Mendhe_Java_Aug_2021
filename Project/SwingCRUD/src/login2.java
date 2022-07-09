
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class login2 extends JFrame
{
    static JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField p1;
    JButton insert,update, search,delete;
    JFrame f;

    login2()
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

//        l3 = new JLabel("Status");
//        l3.setBounds(100,200,100,50);
//        add(l3);


        insert = new JButton("Register ");
        insert.setBounds(150,150,100,50);
        insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new InsertData();
                dispose();

                //3.setText("Record Saved");


            }
        });
        add(insert);


        JButton b2 = new JButton("Login");

        b2.setBounds(30,150,100,50);

        b2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae)
            {

                //check username and password with DB
                //connect with DB and check


                try{



                    Class.forName("com.mysql.jdbc.Driver");

                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb","root","root");

                    Statement stmt = con.createStatement();


                    String qr = "select * from logint where username1='"+t1.getText()+"' and pass1='"+new String(p1.getPassword())+"'";
                    ResultSet rs= stmt.executeQuery(qr);


                    if((t1.getText().equals(""))&&(new String(p1.getPassword()).equals("")))
                    {
                        JOptionPane.showMessageDialog(f,"Empty Input");

                    }
                    else
                    {

                        int flag=1;

                        while(rs.next())
                        {
                            flag=0;

                            JOptionPane.showMessageDialog(f,"Login Success!!!!");
                            JOptionPane.showMessageDialog(f,"Username :"+rs.getString(1)+"    and Password is:"+rs.getString(2));
                            dispose();
                            new crudCall();


                        }
                        if(flag==1)
                        {
                            l3.setText( "Invalid credential" );
                            JOptionPane.showMessageDialog(f,"Invalid Credential");

                        }



                    }





                }catch(Exception ee)
                {
                    System.out.println(ee.toString());
                }




            }

        });
        add(b2);


        setLayout(null);
        setSize(300,300);
        setVisible(true);
        setTitle("UserLogin");

    }





    public static void main(String argc[])
    {

        login2 sI = new login2();

    }


}