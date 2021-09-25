//Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
//Name        Year of joining        Address
//Robert            1994                64C- WallsStreat
//Sam                2000                68D- WallsStreat
//John                1999                26B- WallsStreat

class Employee{

String name;
int yearOfJoining;
String address;

void display()
{

System.out.println(""+name+"            "+yearOfJoining+"              "+address);

}

}
class AEmployeePrint{

public static void main(String abc[]){

Employee e1  = new Employee();
Employee  e2 = new Employee();
Employee  e3 = new Employee();

 e1.name="Robert";
 e1.yearOfJoining=1994;
 e1.address="64C- WallsStreat";

 e2.name="Sam   ";
 e2.yearOfJoining=2000;
 e2.address="68D- WallsStreat";

 e3.name="Robert";
 e3.yearOfJoining=1999;
 e3.address="26B- WallsStreat";

 System.out.println("Name"+"        "+"Year of joining"+"        "+"Address");
 e1.display();
 e2.display();
 e3.display();




}
}

