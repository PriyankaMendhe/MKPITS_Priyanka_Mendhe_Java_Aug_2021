class Employee
{
	//we have not created constructor in this class
	int empno;
	String name;

}

class TestData
{
public static void main(String[] arg) {

	//Every time an object is created using the new() keyword, at least one constructor is called.
Employee emp=new Employee();//It calls a default constructor if there is no constructor available in the class

//default constructor intialize variable with default values
	System.out.println("Empno " + emp.empno); //0
	System.out.println("Empname " + emp.name); //null
}

}
