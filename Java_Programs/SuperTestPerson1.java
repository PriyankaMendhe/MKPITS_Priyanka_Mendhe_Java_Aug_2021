
//to invoke current class constrctor
import java.util.*;
class Person{
	String name;
	String address;

	Person(String name , String address){

		this.name =name;
		this.address = address;
   }
	void displayData(){

		System.out.println("Name = "+name+"  Address = "+address);
}
}
class Student extends Person{

	int rno;
	int marks;
	 Student(int rno, int marks,String name, String address){

		super(name, address);// refer to parent class person
		this.rno = rno;
		this.marks = marks;
		}

	void displayData()
	{
		super.displayData();
		System.out.println("Roll no. :"+rno+ "  Marks : "+marks);
	}
}
public class SuperTestPerson1{

	public static void main(String arg[]){

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Name ");
		String name = scan.next();
		System.out.println("Enter Address ");
		String address = scan.next();
		System.out.println("Enter Roll no. ");
		int rno = scan.nextInt();
		System.out.println("Enter Marks ");
		int marks = scan.nextInt();

        Student s1 = new Student(rno, marks, name, address);
		s1.displayData();
}
}