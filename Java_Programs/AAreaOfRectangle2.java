//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and
//having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.

import java.util.*;
class Area{
	int length;
	int bredth;

	Area(int length, int bredth)
	{
		this.length = length;
		this.bredth = bredth;
	}
	int calculateArea()
	{
		return length*bredth;

	}
}

class AAreaOfRectangle2{
	public static void main(String argc[]){

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Length and Bredth of Rectangle ");

		int length = scan.nextInt();
		int bredth = scan.nextInt();

		Area a = new Area(length, bredth);

		int area = a.calculateArea();

		System.out.println("Area of Rectangle = "+area);
}
}
