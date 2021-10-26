//by user
// insert method to insert particular position
import java.util.*;
class StringInsert1
{

public static void main(String argc[]){

Scanner scan = new Scanner(System.in);

System.out.println("Enter Your first name ");

String fn = scan.next();

StringBuffer sb = new StringBuffer(fn);


System.out.println("Enter Your last name ");

String ln = scan.next();


sb.insert(8,ln);//insert from 2nd position

System.out.println(sb);





}
}