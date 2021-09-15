 ////creating constructor(Default constructor (no-arg constructor))
 
 class Employee
 {
 	int empno;
 	String name;
 	
 	//creating constructor(Default constructor (no-arg constructor))
 	public  Employee() {
 	
 		empno=123;
 		name="ranjan";
 	}
 
 }
 
 class ConstructorWithNoArgument
 {
 public static void main(String[] arg) {
 
 	//Every time an object is created using the new() keyword, at least one constructor is called.
        Employee emp=new Employee();// this will call default constructor automatically //default constructor and values assign
        
 	System.out.println("Empno " + emp.empno); //123
 	System.out.println("Empname " + emp.name); //ranjan
 }
 
 }
