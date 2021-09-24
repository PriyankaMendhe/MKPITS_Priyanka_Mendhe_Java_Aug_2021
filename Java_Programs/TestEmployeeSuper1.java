//Super Keyword

class Employee{
	String empName = "Rajesh";
	void display()
		{

			System.out.println("Employee Name : "+empName);

	   }

}
class PartTimeEmployee extends Employee{

	String empName="Amitesh";
	void display()
	{

		System.out.println("Part Time Employee Name: "+empName);
		super.display();

}}

class TestEmployeeSuper1{

	public static void main(String abc[])
	{
		PartTimeEmployee p1 = new PartTimeEmployee();
		p1.display();


}	}