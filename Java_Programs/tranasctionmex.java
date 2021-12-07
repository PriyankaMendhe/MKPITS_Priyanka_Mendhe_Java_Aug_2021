import java.sql.*;
public class tranasctionmex {
    public static void main(String[] arg) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
            System.out.println("successfully connected");
            con.setAutoCommit(false);

            Statement stmt=con.createStatement();
            stmt.executeUpdate("insert into users values(193,'abhi','abc')");
            stmt.executeUpdate("insert into users values(194,'umesh',3)");

            con.commit();
            con.close();

        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}


