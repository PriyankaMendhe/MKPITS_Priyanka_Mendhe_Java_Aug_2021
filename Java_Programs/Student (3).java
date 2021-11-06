//User-defined class objects in Java ArrayList

import java.util.*;
class Student{

	int rollno;
	String name;
	int fees;

	Student(int rollno,String name,int fees)
	{
		this.rollno=rollno;
		this.name= name;
		this.fees=fees;
	}


public static void main (String argc[]){

	Student s1 = new Student(1,"Priyanka",50000);
	Student s2 = new Student(2,"Priya",50452);
	Student s3 = new Student(3,"ankita",50000);

	ArrayList<Student> st = new ArrayList<Student>();

	st.add(s1);
	st.add(s2);
	st.add(s3);

	Iterator itr = st.iterator();

	//traversing elements of Arraylist object

	while(itr.hasNext())
	{
		Student st2 = (Student)itr.next();

		System.out.println(st2.rollno+" "+st2.name+" "+st2.fees);


	}


}
}