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
 class AddressAggCustomer{
	 public static void main(String argc[]){

		 Address adr1 = new Address("Nagpur","Maharashtra","India",440030);
		 Customer s1= new Customer("Amit",adr1);

		 s1.display();
	}
}