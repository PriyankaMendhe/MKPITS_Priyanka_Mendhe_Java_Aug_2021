import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateData extends JFrame {

    JLabel l1 ,l2,l3,l4,username1, pass1;
    JTextField t1, t2,t3,t4;
    JButton b1;

    UpdateData()
    {
        String idValue = crudCall.insert_id_to_update;


        l1 = new JLabel("Id");
        l1.setBounds(10,50,100,50);


        l2 = new JLabel("name");
        l2.setBounds(10,120,100,50);


        l3 = new JLabel("Mobile NO");
        l3.setBounds(10,190,100,50);

        l4 = new JLabel("City");
        l4.setBounds(10,260,100,50);


        t1 =new JTextField();
        t1.setBounds(120,50,200,50);
        t1.setText(idValue);

        t2 = new JTextField();
        t2.setBounds(120,120,200,50);


        t3 =new JTextField();
        t3.setBounds(120,190,200,50);

        t4 = new JTextField();
        t4.setBounds(120,260,200,50);



        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb","root","root");

            Statement stmt = con.createStatement();

            String qr = "select  * from logint where id='"+idValue+"'";

            ResultSet rs = stmt.executeQuery(qr);

            while(rs.next())
            {

                t2.setText(rs.getString(4));
                t3.setText(rs.getString(5));
                t4.setText(rs.getString(6));


            }






        }catch(Exception ee){
            System.out.println(ee.toString());
        }

        b1 = new JButton("update");
        b1.setBounds(50,350,200,50);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb","root","root");

                    Statement stmt = con.createStatement();



//                    String qr1 = "update logint set name1='"+t1.getText()+"', mno='"+t2.getText()+"' city='"+t3.getText()+"' where id='"+idValue+"' ";

                    String qr1 = "update logint set name1 = '"+t2.getText()+"',mno='"+t3.getText()+"', city='"+t4.getText()+"' where id='"+idValue+"'";


                    stmt.executeUpdate(qr1);

                   // dispose();
                    new crudCall();

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
        setSize(500,500);
        setVisible(true);

    }


}
