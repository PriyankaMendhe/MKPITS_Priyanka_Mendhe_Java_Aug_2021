// accept student data
import java.util.*;
class Address{

	 String city;
	 String state;
	 String country;
	 int pincode;

	 Address(String city, String state, String country, int pincode)
	 {
		 this.city = city;
		 this.state = state;
		 this.country = country;
		 this.pincode = pincode;
	 }
}
class Student{

	String studentName;
	int rno;
	Address address;//aggregation

	Student(String studentName, Address address,int rno){

		this.studentName = studentName;
		this.address=  address;
		this.rno=rno;
	}
	void display()
	{
		System.out.println("Student Name = "+studentName);
		System.out.println("Student Roll No = "+rno);

		System.out.println("City ="+address.city);
		System.out.println("State ="+address.state);
		System.out.println("Country ="+address.country);
		System.out.println("Pincode ="+address.pincode);
	}
}
 class AddressAggStudent1{
	 public static void main(String argc[]){

	  Scanner scan = new Scanner(System.in);

	 	 //Student class data
	 	          System.out.println("Enter Student name");
	 	 		 String studentName = scan.next();
	 	 		 System.out.println("Enter Student roll no");
	 	 		 int rno = scan.nextInt();


	 	 //address date
	 	 		 System.out.println("Enter  City");
	 	 		 String city = scan.next();
	 	 		 System.out.println("Enter   State");
	 	 		 String  state = scan.next();
	 	 		 System.out.println("Enter  Country");
	 	 		 String  country = scan.next();
	 	 		 System.out.println("Enter pincode");
	 	 		 int  pincode = scan.nextInt();



	 		 Address adr1 = new Address(city, state , country, pincode);
	 		 Student  s1= new Student (studentName ,adr1,rno);

	 		 s1.display();
	 	}
}