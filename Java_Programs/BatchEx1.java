import java.sql.*;
import java.util.*;
import java.io.*;
public class BatchEx1 {
    public static void main(String[] arg) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123", "root", "");
            // System.out.println("successfully connected");
            con.setAutoCommit(false);

            Statement stmt=con.createStatement();
            stmt.addBatch("insert into users values(190,'abhilesh','abc')");
            stmt.addBatch("insert into users values(191,'umeshchandra','bbc')");

            stmt.executeBatch();//executing the batch

            con.commit();
            con.close();
            System.out.println("saved");
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }
}

