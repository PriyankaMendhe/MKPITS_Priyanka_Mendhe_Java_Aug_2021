//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle'
//with a method named 'Area' which returns the area and length and breadth passed as parameters to its constructor.

class Rectangle{

int side1;
int side2;
float area;


Rectangle(int side1, int side2)
{
	this.side1 = side1;
	this.side2 = side2;

}

void areaOfRectangle()
{
       area = side1 * side2;

}
void display()
{
    System.out.println("Area of Rectangle = "+area);
}


}

class ARectangleArea1{
public static void main(String argc[]){

Rectangle  r1 = new Rectangle(4, 5 );
Rectangle  r2 = new Rectangle(5, 8 );
r1.areaOfRectangle();
r1.display();

r2.areaOfRectangle();
r2.display();


}}
