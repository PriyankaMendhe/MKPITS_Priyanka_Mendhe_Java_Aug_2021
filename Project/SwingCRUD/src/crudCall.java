import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class crudCall extends JFrame {

    public static String insert_id_to_update;
    JButton insert,update, search,delete;
    JFrame f1;


    crudCall()
    {



//        insert = new JButton("Insert");
//        insert.setBounds(10,50,100,50);
//        insert.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                dispose();
//                new InsertData();
//
//
//
//
//            }
//        });
//        add(insert);


        update = new JButton("Update");
        update.setBounds(10,50,200,50);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
       try {
           // System.out.println("update called");

           Class.forName("com.mysql.jdbc.Driver");

           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb", "root", "root");

           Statement stmt = con.createStatement();


           insert_id_to_update = JOptionPane.showInputDialog("Insert id to update");
           String qr = "select * from logint where id='" + insert_id_to_update + "'";
           ResultSet rs = stmt.executeQuery(qr);


           int flag = 1;

           while (rs.next()) {
               flag = 0;


               dispose();
               new UpdateData();


           }
           if (flag == 1) {

               JOptionPane.showMessageDialog(f1, "ID Incorrect,TRY AGAIN :(");
               new crudCall();

           }





       }
       catch(Exception ee){
           System.out.println(ee.toString());
       }


            }
        });
        add(update);


        search = new JButton("Search");
        search.setBounds(10,120,200,50);
        search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new ShowSearchData();


            }
        });
        add(search);

        delete = new JButton("Delete");
        delete.setBounds(10,190,200,50);
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            String  insert_username_to_delete = JOptionPane.showInputDialog("Insert Username to delete Info/Account ");

                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/swingdb", "root", "root");

                    Statement stmt = con.createStatement();

                    String qr = "delete from logint where username1='"+insert_username_to_delete+"'";

                    stmt.executeUpdate(qr);


                    JOptionPane.showMessageDialog(f1,"Deleted Succesfully");

                }
                catch(Exception ee)
                {
                    System.out.println(ee.toString());
                }

            }
        });
        add(delete);


        setLayout(null);
        setSize(300,400);
        setVisible(true);


    }

}
