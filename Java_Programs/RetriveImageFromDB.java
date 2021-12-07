import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.io.*;
public class RetriveImageFromDB {
    public static void main(String args[]) throws Exception {
        //Registering the Driver
        PreparedStatement ps;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123", "root", "");
            System.out.println("Connection established......");
            File file1=new File("E:\\RetriveImage\\t1.jpg");
            FileOutputStream fos=new FileOutputStream(file1);
            byte b[]; //creating a byte array to store image
            Blob blob;
            ps=con.prepareStatement("select * from imagetable");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                blob=rs.getBlob("image");
                b=blob.getBytes(1,(int)blob.length());
                fos.write(b);
            }

            ps.close();
            fos.close();
            con.close();
            System.out.println("image retrieved successfully");
        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }
}

