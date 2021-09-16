import mkpits2.Order;
import java.util.*;
public class TestOrder{

public static void main(String abc[]){

Order o1= new Order();
Scanner scan = new Scanner(System.in);

System.out.println(" Enter order No:");
int oNo=scan.nextInt();
System.out.println("Enter Order Name: ");
String oName = scan.next();
System.out.println(" Enter order Date: ");
String oDate=scan.next();
System.out.println("Enter Customer Name: ");
String cName = scan.next();
System.out.println("Price: ");
int p=scan.nextInt();
System.out.println("Quantity: ");
int q=scan.nextInt();

o1.insert(oNo,oName, oDate, cName, p, q);
o1.calculculateBill();
o1.display();
}}
