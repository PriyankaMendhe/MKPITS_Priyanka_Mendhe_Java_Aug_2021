import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class ShowSearchData extends JFrame {


    JLabel l1 ,l2,l3,l4,user1, pass1,enquiryData;
    JTextField t1, t2,t3,t4,userT, passT;

    JFrame f1;

    ShowSearchData()
    {

        user1 = new JLabel("Username");
        user1.setBounds(10,50,100,50);
        add(user1);

        pass1 = new JLabel("Password");
        pass1.setBounds(10,120,100,50);
        add(pass1);


        l1 = new JLabel("Id");
        l1.setBounds(10,190,100,50);


        l2 = new JLabel("name");
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



        add(l1);
        add(l2);
        add(t1);
        add(t2);
        add(l3);
        add(l4);
        add(t3);
        add(t4);


        System.out.println("search called");
        String  searchData = JOptionPane.showInputDialog("Insert Username to search Account Info ");
        enquiryData = new JLabel("Search Data For");
        enquiryData.setBounds(10,20,300,20);
        enquiryData.setText("Found Data For:"+searchData);
        add(enquiryData);

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb", "root", "root");

            Statement stmt = con.createStatement();

            String qr = "select  * from logint where username1='"+searchData+"'";

            ResultSet rs = stmt.executeQuery(qr);

            while(rs.next())
            {

                JOptionPane.showMessageDialog(f1,"data Found");

                 userT.setText(rs.getString(1));
                 passT.setText(rs.getString(1));
                 t1.setText(rs.getString(3));
                 t2.setText(rs.getString(4));
                 t3.setText(rs.getString(5));
                 t4.setText(rs.getString(6));


            }


        }
        catch(Exception ee)
        {
            System.out.println(ee.toString());
        }






        setLayout(null);
        setSize(500,600);
        setVisible(true);

    }

}
