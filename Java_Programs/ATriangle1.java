//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
//creating a class named 'Triangle' with constructor having the three sides as its parameters.

class Triangle{

int side1;
int side2;
int side3;
float area;
int perimeter;

Triangle(int side1, int side2,int  side3)
{
	this.side1 = side1;
	this.side2 = side2;
	this.side3 = side3;

	areaOfTriangle();
	perimeterOfTriangle();


}

void areaOfTriangle()
{
       area =(float) 0.5 * side2 * side3;// considering height as side2
       System.out.println("Area of Rectangle = "+area);
}

void perimeterOfTriangle()
{
     perimeter = side1+side2+side3;
     System.out.println("Perimeter of Rectangle = "+perimeter);

}


}

class ATriangle1{
public static void main(String argc[]){

Triangle  t = new Triangle(3 ,4 , 5);

//t.areaOfTriangle();
//t.perimeterOfTriangle();


}}



