//create a class person , then create  a class employee inherited
//from person class, then create a class parttimeemployee inherited from employee class

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

class Employee extends Person{
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

class PartTimeEmployee extends Employee{

	int workingHours;

	void insertPartTimeEmployeeData(int workingHours){

		this.workingHours =workingHours;
    }

    void displayPartTimeEmployeeData()
    { System.out.println("working Hours : "+workingHours);}
}

class Inh8{

	public static void main(String argc[]){

		PartTimeEmployee p  = new PartTimeEmployee();
		p.insertPersonData("Amit","Sadar");
		p.insertEmployeeData(45, 45821f);
		p.insertPartTimeEmployeeData(5);

		p.displayPersonData();
		p.displayEmployeeData();
		p.displayPartTimeEmployeeData();
}
}

