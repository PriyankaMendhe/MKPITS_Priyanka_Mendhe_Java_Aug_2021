import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
public class ResultSetMetaData1 {

    public static void main(String args[])
    {
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");
            Statement stmt = con.createStatement();
            //Retrieving the data
            ResultSet rs = stmt.executeQuery("select * from users");
            ResultSetMetaData rsMetaData = rs.getMetaData();
            //Number of columns
            System.out.println("Number of columns: "+rsMetaData.getColumnCount());
            //Column label
            System.out.println("Column Label: "+rsMetaData.getColumnLabel(1));
            //Column name
            System.out.println("Column Name: "+rsMetaData.getColumnName(1));
            //Number of columns
            System.out.println("Table Name: "+rsMetaData.getTableName(1));
        }
        catch(Exception ee)
        {
            System.out.println(ee.toString());

        }


    }
}

