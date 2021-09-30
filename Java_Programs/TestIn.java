//Java Interface Example: Drawable

interface Shape{

void draw1();
}
class Circle implements Shape{
public void draw1 (){

System.out.println("Cicle coding");

}
}
class TestIn
{
public static void main(String arg[])
{

 Circle c1 = new Circle();
 c1.draw1();

}




}
