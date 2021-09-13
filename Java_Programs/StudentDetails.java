class Student
{


  int studentId;
  String studentName;
  String dateOfAdmission;
}

class StudentDetails
{
 public static void main(String anc[])
 {

  Student s1 = new Student();
  Student s2 = new Student();

  s1.studentId = 5024;
  s1.studentName= "Priyanka_ Mendhe";
  s1.dateOfAdmission="12/12/20";

  s2.studentId=8545;
  s2.studentName="Rajshree_shahane";
  s2.dateOfAdmission="12/8/20";

  System.out.println( s1.studentId );
  System.out.println( s1.studentName );
  System.out.println( s1.dateOfAdmission );

  System.out.println( s2.studentId );
  System.out.println( s2.studentName );
  System.out.println( s2.dateOfAdmission );
 }
}



