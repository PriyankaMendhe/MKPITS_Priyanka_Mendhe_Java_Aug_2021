import java.sql.Connection;
import java.sql.DriverManager;

public class ShowEmployee {
    public static void main(String argc[])
    {
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");




        }catch(Exception ee)
        {

            System.out.println(ee.toString());

        }







    }
}
