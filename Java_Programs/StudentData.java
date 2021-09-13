//object by ref

class StudentData
{

  int studentId;
  String studentName;
  String dateOfAdmission;
   public static void main(String avc[])
   {

       StudentData s1 = new StudentData();
       s1.studentId = 4521;
       s1.studentName  ="Priyanka_Mendhe";
       s1.dateOfAdmission="14/09/2021";
       System.out.println("Student id = "+ s1.studentId);
       System.out.println("Student Name = "+ s1.studentName);
       System.out.println("Student Date of Admission = "+ s1.dateOfAdmission);

   }
 }