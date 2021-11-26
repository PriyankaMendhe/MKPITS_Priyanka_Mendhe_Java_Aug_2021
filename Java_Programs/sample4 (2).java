import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sample4 {

    public static void main(String args[]){
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
            System.out.println("Successfully Connected");
            Statement stmt = con.createStatement();
            //query in qr
            String qr = "Select * from product";
           ResultSet rs =stmt.executeQuery(qr);

           while(rs.next())
           {
               System.out.println("pid: "+rs.getInt(1)+" pname: "+ rs.getString(2)+" price: "+rs.getString(3));

           }

        }catch(Exception ee){
            System.out.println(ee.toString());
        }



    }
}
