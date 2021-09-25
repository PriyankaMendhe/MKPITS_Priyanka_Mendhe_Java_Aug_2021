//Write a program to print the area and perimeter(Perimeter = sum of the three sides) of a triangle
//having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor
// (length)3^2 = (bredth)9 + 4^2 = 16 ::: is equal to (height)5^2 = 25


class Triangle{

int side1;
int side2;
int side3;
float area;
int perimeter;

Triangle()
{

    side1 = 3;//length
    side2= 4;//bredth
    side3 = 5;//height
}

void areaOfTriangle()
{
       area =(float) 0.5 * side2 * side3;// considering height as side2
}

void perimeterOfTriangle()
{
     perimeter = side1+side2+side3;

}

void display()
{
   System.out.println("Area of Rectangle = "+area);
   System.out.println("Perimeter of Rectangle = "+perimeter);
}
}

class ATriangle{
public static void main(String argc[]){

Triangle  t = new Triangle();

t.areaOfTriangle();
t.perimeterOfTriangle();
t.display();

}}



