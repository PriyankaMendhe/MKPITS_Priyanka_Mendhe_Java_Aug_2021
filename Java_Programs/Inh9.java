//create a class person , then create  a class employee inherited
//from person class, then create a class parttimeemployee inherited from employee class
// accept values from user.
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

 class PartTimeEmployee extends Employee{

 	int workingHours;

 	void insertPartTimeEmployeeData(int workingHours){

 		this.workingHours =workingHours;
     }

     void displayPartTimeEmployeeData()
     { System.out.println("working Hours : "+workingHours);}
 }

 class Inh9{

 	public static void main(String argc[]){

 		PartTimeEmployee p  = new PartTimeEmployee();

 		Scanner scan = new Scanner(System.in);

 		System.out.println("Enter employee name");
 		String name =scan.next();
 		System.out.println("Enter employee address");
 		String add =scan.next();

 		System.out.println("Enter employee id");
		int id =scan.nextInt();
		System.out.println("Enter employee salary");
		float sal =scan.nextFloat();

		System.out.println("Enter employee working hours");
		int hour =scan.nextInt();


 		p.insertPersonData(name,add);
 		p.insertEmployeeData(id , sal);
 		p.insertPartTimeEmployeeData(hour);

 		p.displayPersonData();
 		p.displayEmployeeData();
 		p.displayPartTimeEmployeeData();
 }
 }

