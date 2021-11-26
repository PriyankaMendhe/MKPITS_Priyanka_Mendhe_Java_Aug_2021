import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeSelect {

        public static void main(String argc[]){
            try{

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");

                Statement stmt = con.createStatement();
//select
                String qr1 = "select * from employee1";
                ResultSet rs=stmt.executeQuery(qr1);
                while(rs.next()) {
                    System.out.println("emp_no: "+rs.getInt(1)+"  emp_name: "+rs.getString(2)+" address: "+rs.getString(3));
                }


            }catch(Exception ee){

                System.out.println(ee.toString());
            }



        }

    }


