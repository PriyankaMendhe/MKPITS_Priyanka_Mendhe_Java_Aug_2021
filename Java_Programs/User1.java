import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User1 {
    public static void main(String argc[]){
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mkpits123","root","");

            Statement stmt = con.createStatement();
            // to insert ,update ,delete  and select record.

            //insert

            String qr = "insert into user1(userid,username,password)values(1,'PriyankaM12','1254gft'),(2,'SucessMe','1234546'),(3,'AnkitaK12','78954'),(4,'Happy45','735236ss')";

            stmt.executeUpdate(qr);

            //select
            System.out.println("After record inserted user1 table");
            String qr2 = "select * from user1 where 1";
            ResultSet rs=stmt.executeQuery(qr2);
            while(rs.next()) {
                System.out.println("userid: "+rs.getInt(1)+"  username: "+rs.getString(2)+" password: "+rs.getString(3));
            }

            //update

            String qr3 = "update user1 set username='Kia12@' where userid=2";

            stmt.executeUpdate(qr3);
            //select
            System.out.println("After record update user1 table");
            String qr4 = "select * from user1 where 1";
            ResultSet rs1=stmt.executeQuery(qr4);
            while(rs1.next()) {
                System.out.println("userid: "+rs1.getInt(1)+"  username: "+rs1.getString(2)+" password: "+rs1.getString(3));
            }




        }catch(Exception ee){

            System.out.println(ee.toString());
        }



    }


}



