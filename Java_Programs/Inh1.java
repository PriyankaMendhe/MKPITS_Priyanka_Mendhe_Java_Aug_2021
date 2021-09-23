//eg : create a parent class person having fields name and address
//then create a inherited class student having new fields rno and marks


//creating parent class person
class Person
{

	String name;
	String address;
}
//creting inherited class student
class Student extends Person
{

	int rno;
	int marks;
}
class Inh1{

	public static void main(String argc[]){

//creating object for child class student
		Student s1 = new Student();
		s1.rno = 4;
		s1.marks=89;
		s1.name="Amit";
		s1.address="Sadar";

		System.out.println("Roll No: "+s1.rno);
		System.out.println("Name: "+s1.name);
		System.out.println("Address: "+s1.address);
		System.out.println("Marks: "+s1.marks);
}
}