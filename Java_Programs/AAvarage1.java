//Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.

import java.util.*;
class Average{
	int num1;
	int num2;
	int num3;
	float average;

	Average(int num1, int num2, int num3)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.num3=num3;
	}
	void calculateAverage()
	{
		average = (float) (num1+num2+num3)/3;
	}
	void display()
	{

	System.out.println("Average = "+average);

	}
}

class AAvarage1{
	public static void main(String argc[]){

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter 3 numbers ");

		int num1  = scan.nextInt();
		int num2  = scan.nextInt();
		int num3 = scan.nextInt();

		Average a = new Average(num1, num2, num3);

		a.calculateAverage();
		a.display();
}
}