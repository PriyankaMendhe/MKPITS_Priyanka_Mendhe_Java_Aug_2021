// ex compiler self assume super() AS FIRST STATMENT IN CHILD CLASS CONSTRUCTOR
// parent class

 class Person{

	 int id;
	 String name;
	 Person(int id, String name)
	 {
		 this.id = id;
		 this.name = name;

}	 }
class Employee extends Person{

	float salary;

	Employee(int id, String name, float salary)
	{
		super(id,name);
		this.salary=salary;
	}

	void displayData()
	{
		System.out.println("Name = "+super.name+ " ID = "+super.id+" Salary =  "+salary);

	}
}

class TestSuper5{
	public static void main(String arb[]){

		Employee s = new Employee(1, "Aayesh",452124f);
		s.displayData();
}
}