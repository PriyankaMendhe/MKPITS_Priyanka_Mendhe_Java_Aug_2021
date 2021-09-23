
//create a person class and then create a
//child class customer having fields custno,gstno.

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
	System.out.println("Name is :"+name+ "   &   Address is : "+address);
}
}

class Customer extends Person{
	int customerNo, gstNo;

	void insertCustomerData(int customerNo, int gstNo)
	{
		this.customerNo=customerNo;
		this.gstNo=gstNo;
	}
	void displayCustomerData()
	{
		System.out.println("Customer no. is :"+customerNo+ "   &   GST no. is : "+gstNo);
	}
}

class Inh6{

	public static void main(String argc[]){

		Customer c1 = new Customer();
		c1.insertPersonData("Virat","Nagpur");
		c1.insertCustomerData(1,784);

		c1.displayPersonData();
		c1.displayCustomerData();
}
}