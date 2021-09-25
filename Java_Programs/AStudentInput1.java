//Assign and print the roll_number, phone_number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.

class Student{

String name;
int roll_no;
String address;

void display()
{
System.out.println("Student Name = "+name);
System.out.println("Student Roll no. = "+roll_no);
System.out.println("Student Address = "+address);

}

}
class AStudentInput1{

public static void main(String abc[]){

Student s = new Student();
Student s1 = new Student();


s.name = "John";
s.roll_no=2;
s.address="Sadar";
s.display();

s1.name = "Sam";
s1.roll_no=3;
s1.address="Mankapur";
s1.display();
}
}
