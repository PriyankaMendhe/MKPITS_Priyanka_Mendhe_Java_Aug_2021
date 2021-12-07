
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.io.*;
public class inserttxtfileex {
    public static void main(String args[]) throws Exception {
        //Registering the Driver
        PreparedStatement pstmt;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123", "root", "");
            System.out.println("Connection established......");
            File file = new File("E:\\imageDB\\abc.txt");
            FileInputStream fis = null;

            conn.setAutoCommit(false);
            // File file = new File(file1);
            fis = new FileInputStream(file);
            pstmt = conn.prepareStatement("insert into imagetable( name, image) values ( ?, ?)");
            // pstmt.setString(1, id);
            pstmt.setString(1, "hello");
            pstmt.setAsciiStream(2, fis, (int) file.length());
            pstmt.executeUpdate();
            conn.commit();
            pstmt.close();
            fis.close();
            conn.close();
            System.out.println("filed saved successfully in table");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {

        }
    }
}


