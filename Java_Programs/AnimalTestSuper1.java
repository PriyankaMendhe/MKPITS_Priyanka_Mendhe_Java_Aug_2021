
class Animal{

	String color = "White";

}

class Dog extends Animal{

	String color = "Black";

	void display()
	{
		System.out.println("Color is  :: "+super.color);//Animal class immediate parent class of dog

	}
}

class BabyDog extends Dog{

	String color = "Brown";

	void display1()
	{

		System.out.println("Color is :: "+super.color);// dog class
		System.out.println("Color is :: "+color);// babydog class

		display();


	}
}
class AnimalTestSuper1{

	public static void main(String abc[]){

		BabyDog b = new BabyDog();
		b.display1();


	}}