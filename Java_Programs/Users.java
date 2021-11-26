
import  java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
public class Users extends JFrame {
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3,b4;

    Users()
    {

            l1 = new JLabel("Username");
            l1.setBounds(20,50,100,20);
            add(l1);

            t1= new JTextField();
            t1.setBounds(140,50,150,20);
            add(t1);

            l2= new JLabel("Password");
            l2.setBounds(20,90,100,20);
            add(l2);

            t2= new JPasswordField();
            t2.setBounds(140,90,150,20);
            add(t2);

            b1 = new JButton("Save");
            b1.setBounds(30,120,100,20);
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    try{

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                        Statement stmt = con.createStatement();

                        String qr = " insert into users(username,password)values('"+t1.getText()+"','"+t2.getText()+"')";
                        stmt.executeUpdate(qr);
                        System.out.println("Record Save SUccessfully");
                        con.close();
                        l3.setText("Record Saved");

                    }catch(Exception ee){  System.out.println(ee.toString());}

                }
            });
            add(b1);

            b2= new JButton("Update");
            b2.setBounds(140,120,100,20);
            b2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try{

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                        Statement stmt =con.createStatement();

                        String qr = "Update users set password='"+t2.getText()+"' where username='"+t1.getText()+"'";
                        stmt.executeUpdate(qr);
                        System.out.println("Record update Successfully");
                        con.close();
                        l3.setText("Record Updated");



                    }catch(Exception ee){System.out.println(ee.toString());}
                }
            });
            add(b2);

        b3= new JButton("Delete");
        b3.setBounds(30,160,100,20);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    Statement stmt =con.createStatement();

                    String qr = "delete from users where username='"+t1.getText()+"'";
                    stmt.executeUpdate(qr);
                    System.out.println("Record deleted Successfully");
                    con.close();
                    l3.setText("Record deleted");



                }catch(Exception ee){System.out.println(ee.toString());}
            }
        });
        add(b3);

        b4= new JButton("Search");
        b4.setBounds(140,160,100,20);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    Statement stmt =con.createStatement();

                    String qr = "select * from users where username='"+t1.getText()+"'";
                    ResultSet rs= stmt.executeQuery(qr);
                    int flag=1;
                    while(rs.next())
                    {
                        flag=0;
                        t2.setText(rs.getString(3));
                        l3.setText("Record found");


                    }
                    if(flag==1)
                    {
                        System.out.println("Record not found");
                        l3.setText("Record not found");
                    }

                    con.close();




                }catch(Exception ee){System.out.println(ee.toString());}
            }
        });
        add(b4);

            l3=new JLabel("Status");
            l3.setBounds(30,250,200,20);
            add(l3);



            setSize(350,400);
            setLayout(null);
            setVisible(true);





    }

    public static  void main(String args[])
    {
        Users u1 = new Users();



    }
}
