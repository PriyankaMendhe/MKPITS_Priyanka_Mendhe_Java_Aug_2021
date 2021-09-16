import mkpits1.Employee;
import java.util.*;
public class TestEmployee{

public static void main(String abc[]){

Employee e1 = new Employee();
Scanner scan = new Scanner(System.in);

System.out.println("Enter Emp no.");
int eNo = scan.nextInt();

System.out.println("Enter Employee name");
String eName = scan.next();

System.out.println("Enter Basic salary");
int bSal = scan.nextInt();

e1.insert(eNo,eName,bSal);
e1.calculateBonus();
e1.display();

}
}