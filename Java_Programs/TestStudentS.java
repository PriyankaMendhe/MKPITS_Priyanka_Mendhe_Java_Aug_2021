class StudentS
{

static String college = "NIT";
int rno;
String name;

StudentS(int r, String n)
{

 rno=r;
 name = n;

}

 static void change()
{

   college = "DAIMSR";
}

void display()
{

System.out.println(rno+ " "+name+" "+college);

}

}

class TestStudentS{

public static void  main(String abc[])
{
StudentS.change();

StudentS s1 = new StudentS(45, "Rajan");

StudentS s2 = new StudentS(485, "Rajana");

StudentS s3 = new StudentS(457, "Rajanigandha");


s1.display();
s2.display();
s3.display();

}
}
