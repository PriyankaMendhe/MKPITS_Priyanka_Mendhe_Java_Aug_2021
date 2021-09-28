
// method overloading
class Student{

void getData(String name){

System.out.println("Name is "+name);

}

void getData(String name, String address){

System.out.println("Name is "+name+ "&  Address is "+address);


}}

class overl3{

public static void main(String argc[]){

Student s = new Student();

s.getData("Amar");
s.getData("Amar","Sadar");

}}
