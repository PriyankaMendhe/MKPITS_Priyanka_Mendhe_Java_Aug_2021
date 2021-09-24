
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
class Customer{

	String customerName;
	Address address;//aggregation

	Customer(String customerName, Address address ){

		this.customerName = customerName;
		this.address=  address;

	}
	void display()
	{
		System.out.println("Customer Name = "+customerName);

		System.out.println("City ="+address.city);
		System.out.println("State ="+address.state);
		System.out.println("Country ="+address.country);
		System.out.println("Pincode ="+address.pincode);
	}
}
 class AddressAggCustomer1{
	 public static void main(String argc[]){

	  Scanner scan = new Scanner(System.in);

	 //Customer class data
	          System.out.println("Enter Customer name");
	 		 String customerName = scan.next();
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
		 Customer s1= new Customer(customerName ,adr1);

		 s1.display();
	}
}