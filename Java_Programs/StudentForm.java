import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentForm extends JFrame{

    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4,t5;

    JButton b1,b2,b3,b4;

    StudentForm()
    {

        l1 = new JLabel("Roll No");
        l1.setBounds(20,50,100,20);
        add(l1);

        t1= new JTextField();
        t1.setBounds(140,50,150,20);
        add(t1);

        l2= new JLabel("Name");
        l2.setBounds(20,90,100,20);
        add(l2);

        t2= new JTextField();
        t2.setBounds(140,90,150,20);
        add(t2);

        l4= new JLabel("Address");
        l4.setBounds(20,130,100,20);
        add(l4);

        t3= new JTextField();
        t3.setBounds(140,130,150,20);
        add(t3);

        l5= new JLabel("E-mail");
        l5.setBounds(20,170,100,20);
        add(l5);

        t4= new JTextField();
        t4.setBounds(140,170,150,20);
        add(t4);

        l6= new JLabel("Mobile No");
        l6.setBounds(20,200,100,20);
        add(l6);

        t5= new JTextField();
        t5.setBounds(140,200,150,20);
        add(t5);

        b1 = new JButton("Insert");
        b1.setBounds(30,240,100,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    Statement stmt = con.createStatement();

                    String qr = " insert into studentdb (rno,name,email,address,mobno)values("+t1.getText()+",'"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"')";
                    stmt.executeUpdate(qr);
                    System.out.println("Record Save SUccessfully");
                    con.close();
                    l3.setText("Record Saved");

                }catch(Exception ee){  System.out.println(ee.toString());}

            }
        });
        add(b1);

        b2= new JButton("Update");
        b2.setBounds(140,240,100,20);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    Statement stmt =con.createStatement();

                    String qr = "Update studentdb set name='"+t2.getText()+"',address='"+t3.getText()+"',email='"+t4.getText()+"',mobno='"+t5.getText()+"' where rno='"+t1.getText()+"'";
                    stmt.executeUpdate(qr);
                    System.out.println("Record update Successfully");
                    con.close();
                    l3.setText("Record Updated");



                }catch(Exception ee){System.out.println(ee.toString());}
            }
        });
        add(b2);

        b3= new JButton("Delete");
        b3.setBounds(30,280,100,20);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    Statement stmt =con.createStatement();

                    String qr = "delete from studentdb where rno='"+t1.getText()+"'";
                    stmt.executeUpdate(qr);
                    System.out.println("Record deleted Successfully");
                    con.close();
                    l3.setText("Record deleted");



                }catch(Exception ee){System.out.println(ee.toString());}
            }
        });
        add(b3);

        b4= new JButton("Search");
        b4.setBounds(140,280,100,20);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
                    Statement stmt =con.createStatement();

                    String qr = "select * from studentdb where rno='"+t1.getText()+"'";
                    ResultSet rs= stmt.executeQuery(qr);
                    int flag=1;
                    while(rs.next())
                    {
                        flag=0;
                        t2.setText(rs.getString(2));
                        t3.setText(rs.getString(3));
                        t4.setText(rs.getString(4));
                        t5.setText(rs.getString(5));

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
        l3.setBounds(30,310,200,20);
        add(l3);



        setSize(400,400);
        setTitle("StudentForm");
        setLayout(null);
        setVisible(true);





    }

    public static  void main(String args[])
    {
        StudentForm u1 = new StudentForm();



    }

}
