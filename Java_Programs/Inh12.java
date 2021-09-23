//create a parent class person having common fields name,address and methods
//create a child class student inherited from person class having additional fields rno, marks and methods
//create a child class employee inherited from person class having additional fields empno, salary and methods.
import java.util.*;
class Person{
 	 String name;
 	 String address;
 	 void insertPersonData(String name, String address)
 	 {
 	 	this.name=name;
 	 	this.address=address;
 	 }
 	 void displayPersonData()
 	 {
 	 	System.out.println("Name is :"+name);
 	 	System.out.println("Address is : "+address);
 	 }
}
// parent class Person
class Student extends Person{

	int rno;
	int marks;

	void insertStudentData(int rno, int marks){

		this.rno= rno;
		this.marks=marks;
}
void displayStudentData()
{
	System.out.println("Roll No : "+rno);
	System.out.println("Marks : "+marks);
}
}
//// parent class Person
class Employee extends Person{
 	    int empno;
 		float salary;

 		void insertEmployeeData(int empno, float salary)
 		{
 			this.empno=empno;
 			this.salary=salary;
 		}
 		void displayEmployeeData()
 		{
 			System.out.println("Employee no. is :"+empno);
 			System.out.println("Salary is : "+salary);
        }
 }

class Inh12{

	public static void main(String argc[]){

		Scanner scan = new Scanner(System.in);

		Employee e = new Employee();
		System.out.println("------------Employee Details----------------");
		System.out.println("Enter employee name");
		String name =scan.next();
		System.out.println("Enter employee address");
		String add =scan.next();

		System.out.println("Enter employee id");
		int id =scan.nextInt();
		System.out.println("Enter employee salary");
		float sal =scan.nextFloat();

		e.insertPersonData(name,add);
 		e.insertEmployeeData(id , sal);
 		e.displayPersonData();
 		e.displayEmployeeData();

 		Student s = new Student();
 		System.out.println("------------Student Details----------------");
 		System.out.println("Enter Student name");
		 name =scan.next();
		System.out.println("Enter Student address");
		 add =scan.next();

	    System.out.println("Enter Student Roll no.");
		int rno =scan.nextInt();
		System.out.println("Enter Student Marks");
		int marks =scan.nextInt();

		s.insertPersonData(name,add);
	    s.insertStudentData(rno, marks);

		s.displayPersonData();
		s.displayStudentData();
}}

