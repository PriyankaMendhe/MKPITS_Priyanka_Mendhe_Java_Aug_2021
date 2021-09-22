//Write-Only class

class Student{
private int id;
private String name;
private String college;

public void setID(int id){  this.id = id ;}
public void setName(String name){  this.name = name ;}
public void setCollege(String college){  this.college = college ;}


public void display()
{
	System.out.println(id+ " "+name+" "+college);
}
}
class StudentEnc{
public static void main(String argc[]){

	Student s = new Student();
	s.setID(123);
	s.setName("Ankita");
	s.setCollege("NIT");
	s.display();




}

}