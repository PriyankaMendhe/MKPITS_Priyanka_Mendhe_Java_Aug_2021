import java.sql.*;
public class sample1 {

    public static void main(String args[]){
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
            System.out.println("Successfully Connected");
            Statement stmt = con.createStatement();
            //query in qr
            String qr = " insert into product(pid, pname, price) values(15,'Desktop',78542)";
            stmt.executeUpdate(qr);
            System.out.println("Record Successfully Inserted");


        }catch(Exception ee){
            System.out.println(ee.toString());
        }



    }
}
