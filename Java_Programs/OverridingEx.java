// example of overiding

class figure{

	 void draw()
	{
		System.out.println("draw method of figure class");
	}
}
class triangle extends figure{

	void draw()
	{
		System.out.println("draw method of triangle class");

	}
}
class OverridingEx{

	public static void main(String argc[]){

        figure f = new figure();
		f.draw();

		triangle t = new triangle();
		t.draw();
}

}