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
class Rectangle implements Shape{
	public void draw(){

			System.out.println("code to draw Rectangle");
	}

	public void draw1()
	{
		System.out.println("Method draw1 of type rectangle called");
	}
}


class TestInterfaceShape
{
	public static void main(String argc[])
	{
		// instance for circle class
		Shape s = new Circle();
		s.draw();

		Shape r = new Rectangle ();
		r.draw();

       //r.draw1(); [compile time error] r shape type of variable and method draw1 is not type of Shape

		// to call draw1 method instance for rectangle class type method
		Rectangle r1 = new Rectangle ();
		r1.draw1();


	}
}