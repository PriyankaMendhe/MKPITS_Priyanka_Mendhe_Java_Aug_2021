//A Java class which has only getter methods.

class Student{

	private String college = "NIT";

	public String getCollege(){ return college ;}
 }

class StudentEn{
	public static void main(String argc[]){

		Student s = new Student();
		System.out.println("College name is  : "+ s.getCollege());


	}}