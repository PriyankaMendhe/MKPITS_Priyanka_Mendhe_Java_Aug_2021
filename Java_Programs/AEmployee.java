//Write a program by creating an 'Employee' class having the following methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'AddSal()' which adds 10 to salary of the employee if it is less than 500.
//3 - 'AddWork()' which adds 5 to salary of employee if the number of hours of work per day is more than 6 hours

import java.util.*;
class Employee{
	int salary;
	int noOfWorksPerDay;

	void getInfo(int salary,int noOfWorksPerDay)
	{
		this.salary = salary;
		this.noOfWorksPerDay=noOfWorksPerDay;
	}

	void addSal()
	{

		if(salary<500)
		{
			  salary = salary+10;


		}

	}

	void addWork()
	{
		if(noOfWorksPerDay > 6 )
		{

			 salary = salary + 5;
		}



	}

	void displayFinalSalary()
	{
		System.out.println("Employee Final  Salary:  "+salary);
		System.out.println("Number of hours of work per day of Employee :  "+noOfWorksPerDay);

     }
}

class AEmployee{
public static void main(String argc[]){

		Scanner scan = new Scanner(System.in);
		Employee e1 = new Employee();
		System.out.println("Enter Salary");
		int salary = scan.nextInt();
		System.out.println("Enter number of hours of work per day");
		int noOfWorksPerDay =scan.nextInt();

		e1.getInfo(salary,noOfWorksPerDay);
		System.out.println("Employee Salary:  "+salary);
		e1.addSal();
		e1.addWork();
		e1.displayFinalSalary();

	}
}


