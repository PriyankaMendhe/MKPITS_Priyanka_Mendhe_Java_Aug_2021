import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertData extends JFrame {


    JLabel l1 ,l2,l3,l4,user1, pass1 ;
    JTextField t1, t2,t3,t4,userT, passT;
    JButton b1;

    JFrame f;

    InsertData()
    {



        user1 = new JLabel("Username");
        user1.setBounds(10,50,100,50);
        add(user1);

        pass1 = new JLabel("Password");
        pass1.setBounds(10,120,100,50);
        add(pass1);


        l1 = new JLabel("Name");
        l1.setBounds(10,190,100,50);


        l2 = new JLabel("Id");
        l2.setBounds(10,260,100,50);

        l3 = new JLabel("Mobile NO");
        l3.setBounds(10,350,100,50);

        l4 = new JLabel("City");
        l4.setBounds(10,420,100,50);



        userT = new JTextField();
        userT.setBounds(120,50,200,50);
        add(userT);

        passT = new JTextField();
        passT.setBounds(120,120,200,50);
        add(passT);

        t1 =new JTextField();
        t1.setBounds(120,190,200,50);

        t2 = new JTextField();
        t2.setBounds(120,260,200,50);

        t3 =new JTextField();
        t3.setBounds(120,350,200,50);

        t4 = new JTextField();
        t4.setBounds(120,420,200,50);

        b1 = new JButton("Register");
        b1.setBounds(50,500,200,50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb","root","root");

                    PreparedStatement stmt=con.prepareStatement("insert into logint values(?,?,?,?,?,?)");
                    stmt.setString(1,userT.getText() );
                    stmt.setString(2,passT.getText());
                    stmt.setString(3,t1.getText());
                    stmt.setString(4,t2.getText());
                    stmt.setString(5,t3.getText());
                    stmt.setString(6,t4.getText());


                    int i=stmt.executeUpdate();

                   // String qr1 = "insert into logint(username1,pass1,id,name1, mno, city)values('"+userT.getText()+"','"+passT.getText()+"','"+t1.getText()+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"' ";


                   // stmt.executeUpdate(qr1);

                    JOptionPane.showMessageDialog(f,"Record Saved!!!!");
                    JOptionPane.showMessageDialog(f,"Username :"+t1.getText()+"    and Password is:"+t2.getText());

                    dispose();
                    new login2();

                } catch (Exception ex) {
                    ex.printStackTrace();
                }



            }
        });


        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(l3);
        add(l4);
        add(t3);
        add(t4);
        add(b1);


        setLayout(null);
        setSize(500,600);
        setVisible(true);

    }

}
