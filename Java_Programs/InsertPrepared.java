import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPrepared {

    public static void main(String args[]) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123", "root", "");
            String qr = "insert into emp(id , name )values(?,?)";
            PreparedStatement ps1 = con.prepareStatement(qr);
            ps1.setInt(1, 105);
            ps1.setString(2,"Khushali" );


            int result = ps1.executeUpdate();
            System.out.println("Record Save SUccessfully");
            con.close();


        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }
}
