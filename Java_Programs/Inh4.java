class Person{
	String name;
	String address;

	void insertPersonData(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	void displayPersonData()
	{
		System.out.println("Name : "+name);
	    System.out.println("Address : "+address);
	}
}

class Student extends Person{

	int rno;
	int marks;

	void insertStudentData(int rno, int marks){

		this.rno= rno;
		this.marks=marks;
}
void displayStudentData()
{
	System.out.println("Roll No : "+rno);
	System.out.println("Marks : "+marks);
}
}

class Inh4{
	public static void main(String args[])
	{

		Student s = new Student();
		s.insertPersonData("Amit","Sadar");// person class
		s.insertStudentData(4, 85);// student class
		s.displayPersonData();
		s.displayStudentData();
	}
}