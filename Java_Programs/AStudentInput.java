//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
//Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class Student{

String name;
int roll_no;

void display()
{
System.out.println("Student Name = "+name);
System.out.println("Student Roll no. = "+roll_no);

}

}
class AStudentInput{

public static void main(String abc[]){

Student s = new Student();

s.name = "John";
s.roll_no=2;
s.display();
}
}


