// ex : create an interface shape having method declaration for draw method

interface Shape{
// by default abstract method
void draw();

}
class Circle implements Shape{
	public void draw(){

		System.out.println("code to draw circle");
	}
}
class TestInterface
{
	public static void main(String argc[])
	{
		Shape s = new Circle();
		s.draw();

	}
}