//another example of single inhertance
//create  a class person and then create a child class employee
//creating parent class person
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


class Employee extends Person
{
	int empno;
	float salary;

	void insertEmployeeData(int empno, float salary)
	{
		this.empno=empno;
		this.salary=salary;
	}
	void displayEmployeeData()
	{
		System.out.println("Employee no. is :"+empno+ "   &   Salary is : "+salary);
    }
}

class Inh5{
	public static void main(String argc[]){

		Employee e1= new Employee();

		e1.insertPersonData("Rekha","Mankpaur");
		e1.insertEmployeeData(45, 45821f);
		e1.displayPersonData();
		e1.displayEmployeeData();
}}
