// program to insert image into  table
import java.io.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
public class InsertImageIntoDB {

    public static void main(String args[])
    {
        try{


            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");

            File file=new File("E:\\imageDB\\t4.jpg");
            FileInputStream fis = new FileInputStream(file);
            PreparedStatement ps=con.prepareStatement("insert into imagetable (name,image) values(?,?)");
            ps.setString(1,"InvertedTriangle");
            ps.setBinaryStream(2,fis,(int)file.length());
            ps.executeUpdate();
            System.out.println("image saved in database successfully");



        }catch(Exception ee)
        {
            System.out.println(ee.toString());


        }



    }


}
