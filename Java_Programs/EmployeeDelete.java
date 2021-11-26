import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeeDelete {
    public static void main(String argc[]){
        try{



            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");

            Statement stmt = con.createStatement();
//delete
            String qr1 = "delete from employee1 where emp_no=3";
            stmt.executeUpdate(qr1);
            System.out.println(" Record deleted Succesfully in Employee table");



        }catch(Exception ee){

            System.out.println(ee.toString());
        }



    }

}
