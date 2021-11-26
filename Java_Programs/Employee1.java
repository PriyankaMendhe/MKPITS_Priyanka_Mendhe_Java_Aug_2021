import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Employee1 {

    public static void main(String args[])
    {
        try{



            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");

            Statement stmt = con.createStatement();
//insert
            String qr = "insert into employee1(emp_name, address)values('Ankita','kampti'),('Snehal','Gondia'),('Aakash','Mumbai')";
            stmt.executeUpdate(qr);
            System.out.println("3 Record inserted Succesfully in Employee1 table");



        }catch(Exception ee){

            System.out.println(ee.toString());
        }



    }
}
