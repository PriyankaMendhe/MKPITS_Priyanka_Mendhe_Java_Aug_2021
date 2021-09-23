// class employee and subclass programmer

class Employee
{
	float salary=45000f;
}
class Programmer extends Employee
{
	int bonus=10000;

}
class Inh2{

public static void main(String argc[])
{
	Programmer p = new Programmer();

	System.out.println("Programmer Salary is : "+p.salary);
	System.out.println("Programmer Bonus is : "+p.bonus);
}
}