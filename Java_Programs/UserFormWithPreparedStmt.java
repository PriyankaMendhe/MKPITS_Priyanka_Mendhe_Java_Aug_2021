
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.sql.*;
        import javax.swing.*;
        import java.awt.*;
public class UserFormWithPreparedStmt extends JFrame {
    JLabel l1,l2,l3;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3,b4;

    UserFormWithPreparedStmt()
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
                    String qr="insert into users(username,password)values(?,?)";
                    PreparedStatement ps1 = con.prepareStatement(qr);
                    ps1.setString(1,t1.getText());
                    ps1.setString(2,t2.getText());


                    int result = ps1.executeUpdate();
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


                    String qr = "Update users set password= ?  where username= ? ";
                    PreparedStatement stmt  =con.prepareStatement(qr);

                    stmt.setString(1,t2.getText());
                    stmt.setString(2,t1.getText());

                   int i = stmt.executeUpdate();
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


                    String qr = "delete from users where username= ? ";
                    PreparedStatement stmt1 =con.prepareStatement(qr);
                    stmt1.setString(1,t1.getText());
                    int j = stmt1.executeUpdate();
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

                    String qr = "select * from users where username= ? ";
                    PreparedStatement stmt2 =con.prepareStatement(qr);
                    stmt2.setString(1,t1.getText());


                    ResultSet rs= stmt2.executeQuery();
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
        UserFormWithPreparedStmt u1 = new UserFormWithPreparedStmt();



    }
}

