import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class sample3 {
    public static void main(String args[]){
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
            System.out.println("Successfully Connected");
            Statement stmt = con.createStatement();
            //query in qr
            String qr = "delete from product where pid=10";
            stmt.executeUpdate(qr);
            System.out.println("Record Successfully Deleted");


        }catch(Exception ee){
            System.out.println(ee.toString());
        }



    }
}
