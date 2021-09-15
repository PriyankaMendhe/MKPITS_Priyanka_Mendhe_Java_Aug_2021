////creating constructor(Default constructor (with arg constructor))

 class Employee
 {
 	int empno;
 	String name;

 	//creating constructor(Default constructor (no-arg constructor))
 	public  Employee( int e, String eName) {

 		empno=e;
 		name=eName;
 	}

 	void display()
 	{
		System.out.println("Empno " + empno); //123
 	    System.out.println("Empname " + name); //ranjan

	}

 }

 class ConstructorWithArgument
 {
 public static void main(String[] arg) {

 	//Every time an object is created using the new() keyword, at least one constructor is called.
        Employee emp=new Employee(123, "ranjan");// this will call default constructor automatically //default constructor and values assign


 	     emp.display();


 }}
