import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedRetrive {
    public static void main(String args[]) {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123", "root", "");
            String qr = "select * from emp ";
            PreparedStatement ps1 = con.prepareStatement(qr);

            ResultSet rs  = ps1.executeQuery();
            while(rs.next())
            {
            System.out.println(rs.getInt(1)+""+rs.getString(2));

            }
            con.close();


        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }


}
