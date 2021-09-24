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
class Employee{

	String empName;
	Address address;//aggregation

	Employee(String empName, Address address){

		this.empName = empName;
		this.address=  address;
	}
	void display()
	{
		System.out.println("Employee Name = "+empName);
		System.out.println("City ="+address.city);
		System.out.println("State ="+address.state);
		System.out.println("Country ="+address.country);
		System.out.println("Pincode ="+address.pincode);
	}
}
 class AddressAgg1{
	 public static void main(String argc[]){

         Scanner scan = new Scanner(System.in);




		 System.out.println("Enter Employee name");
		 String empName = scan.next();

		 System.out.println("Enter Employee City");
		 String city = scan.next();
		 System.out.println("Enter Employee State");
		 String  state = scan.next();
		 System.out.println("Enter Employee Country");
		 String  country = scan.next();
		 System.out.println("Enter pincode");
		 int  pincode = scan.nextInt();

         Address adr1 = new Address(city, state , country, pincode);

          Employee e1=   new Employee(empName, adr1);


		  e1.display();
	}
}