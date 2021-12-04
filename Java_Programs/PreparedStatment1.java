

import java.sql.*;
public class PreparedStatment1 {

    public static void main(String args[]){

        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");

             PreparedStatement ps1 = con.prepareStatement("insert  into emp values(?,?)");
             ps1.setInt(1,101);
             ps1.setString(2,"Amit");

             int result = ps1.executeUpdate();
             System.out.println("Record Saved");

        }catch(Exception ee){System.out.println(ee.toString());}




    }
}
