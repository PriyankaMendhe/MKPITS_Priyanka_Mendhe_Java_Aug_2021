//Super Keyword

class Employee{
	String empName = "Rajesh";

}
class PartTimeEmployee extends Employee{

	String empName="Amitesh";
	void display()
	{

		System.out.println("Employee Name : "+super.empName);
		System.out.println("Part Time Employee Name: "+empName);

}}

class TestEmployeeSuper{

	public static void main(String abc[])
	{
		PartTimeEmployee p1 = new PartTimeEmployee();
		p1.display();


}	}