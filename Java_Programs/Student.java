
public class Student
{

 int rno;
 String name;
 static String college="mkpits";
 public Student(int r, String n)
 {
     rno= r ;
     name = n;
 }
 public void display()

 {

  System.out.println(rno);
  System.out.println(name);
  System.out.println(college);

 }



public static void main(String abc[])
{
	Student s1 = new Student(12, "Rani");
	Student s2 = new Student(13, "Raj");
	s1.display();
	s2.display();


}
}
