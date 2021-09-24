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
 class AddressAggStudent{
	 public static void main(String argc[]){

		 Address adr1 = new Address("Nagpur","Maharashtra","India",440030);
		 Student s1= new Student("Amit",adr1,14);

		 s1.display();
	}
}