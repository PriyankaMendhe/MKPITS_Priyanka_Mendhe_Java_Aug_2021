import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreapredDelete {

    public static void main(String args[]) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123", "root", "");
            String qr = "delete from emp  where id= ?";
            PreparedStatement ps1 = con.prepareStatement(qr);


            ps1.setInt(1, 105);


            int result = ps1.executeUpdate();
            System.out.println("Record deleted SUccessfully");
            con.close();


        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }


}
