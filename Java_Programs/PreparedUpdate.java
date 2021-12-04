import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedUpdate {
    public static void main(String args[]) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123", "root", "");
            String qr = "update emp set name = ? where id= ?";
            PreparedStatement ps1 = con.prepareStatement(qr);

            ps1.setString(1, "Karan");
            ps1.setInt(2, 105);


            int result = ps1.executeUpdate();
            System.out.println("Record Save SUccessfully");
            con.close();


        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }
}