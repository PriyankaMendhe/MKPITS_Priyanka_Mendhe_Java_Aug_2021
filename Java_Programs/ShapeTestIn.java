
//Drawable interface has only one method.
//Its implementation is provided by Rectangle and Circle classes.

// interface declared by first user
interface Drawable{

void draw();

}

//    //Implementation: by second user
class  Rectangle  implements Drawable
{
	public void draw(){System.out.println("drawing rectangle");}

}
class Circle implements Drawable
{
	public void draw(){System.out.println("drawing Circle");}

}
    //Using interface: by third user
class ShapeTestIn{

	public static void main(String argc[]){

		Drawable d = new Circle();

		d.draw();

}
}

