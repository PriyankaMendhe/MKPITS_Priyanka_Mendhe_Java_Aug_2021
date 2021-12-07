import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.*;
import java.io.*;

public class BatchByPreparedStatment {

    public static void main(String[] arg) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123", "root", "");
            // System.out.println("successfully connected");
            con.setAutoCommit(false);

            PreparedStatement ps=con.prepareStatement("insert into userdata values(?,?,?)");

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            while(true){

                System.out.println("enter id");
                String s1=br.readLine();
                int id=Integer.parseInt(s1);

                System.out.println("enter Username");
                String name=br.readLine();



                Scanner scan = new Scanner(System.in);
                System.out.println("enter password");
                String s3  =scan.next();
                //int pwd=Integer.parseInt(s3);

                ps.setInt(1,id);
                ps.setString(2,name);
                ps.setString(3,s3);

                ps.addBatch();
                System.out.println("Want to add more records y/n");
                String ans=br.readLine();
                if(ans.equals("n")){
                    break;
                }

            }
            ps.executeBatch();
            con.commit();
            con.close();
            System.out.println("record successfully saved");

        } catch (Exception ee) {
            System.out.println(ee.toString());
        }
    }

}
