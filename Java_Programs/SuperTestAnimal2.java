//super to invoke parent class constructor
class Animal{

	Animal(){System.out.println("animal is created");}
}
class Dog extends Animal{
	Dog(){

		 super(); // calling to parent class constructor


		System.out.println("Dog is created");
  }
}

class SuperTestAnimal2{
	public static void main(String abc[]){

	Dog d = new Dog();
}
}