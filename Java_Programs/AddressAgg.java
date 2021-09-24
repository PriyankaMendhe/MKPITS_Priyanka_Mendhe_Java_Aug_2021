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
 class AddressAgg{
	 public static void main(String argc[]){

		 Address adr1 = new Address("Nagpur","Maharashtra","India",440030);
		 Employee e1= new Employee("Amit",adr1);

		 e1.display();
	}
}