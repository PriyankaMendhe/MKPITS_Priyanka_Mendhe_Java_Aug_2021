//create a person class , then create a student class inherited from person class ,
//then create a parttimestudent class inherited from student class.
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

class PartTimeStudent extends Student{

 	int hours;

 	void insertPartTimeStudentData(int hours){

 		this.hours =hours;
     }

     void displayPartTimeStudentData()
     { System.out.println("Study Hours : "+hours);}
 }

 	 class Inh10{

		 public static void main(String argc[]){

			 PartTimeStudent p  = new PartTimeStudent();

			  		Scanner scan = new Scanner(System.in);

			  		System.out.println("Enter Student name");
			  		String name =scan.next();
			  		System.out.println("Enter Student address");
			  		String add =scan.next();

			  		System.out.println("Enter Student Roll no.");
			 		int rno =scan.nextInt();
			 		System.out.println("Enter Student Marks");
			 		int marks =scan.nextInt();

			 		System.out.println("Enter Student hours");
			 		int hour =scan.nextInt();


			  		p.insertPersonData(name,add);
			  		p.insertStudentData(rno, marks);
			  		p.insertPartTimeStudentData(hour);

			  		p.displayPersonData();
			  		p.displayStudentData();
			  		p.displayPartTimeStudentData();
			  }
			  }

