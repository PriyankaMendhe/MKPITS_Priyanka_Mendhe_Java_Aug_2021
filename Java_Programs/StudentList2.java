import java.util.*;
class StudentList2{

public static void main(String argc[])
{

      ArrayList<String> studentData = new ArrayList<String>();

      studentData.add("Pranay");
      studentData.add("Priyanka");
      studentData.add("Surbhi");
      studentData.add("Kiyansh");
      studentData.add("Hrutika");

  // print through index method by get()

  String sn = studentData.get(1);//data at index 1

  System.out.println(sn);//priyanka


studentData.set(1,"Ashish");
studentData.set(0,"Sonu");//set "Sonu"at oth index

for(String str : studentData)
{

	System.out.println("Student Name: "+str);

}
}
}