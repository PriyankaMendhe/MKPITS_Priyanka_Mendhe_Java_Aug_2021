//Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.
//Hirarchy inheritance

class Animal{

	void eat(){System.out.println("eating........");}

}
//parent class animal
class Dog extends Animal{

	void bark(){System.out.println("barking........");}

}
//parent class animal
class Cat extends Animal{

	void meow(){System.out.println("meow........");}
}
class Inh11{

	public static void main(String avc[]){

		Cat c = new Cat();
		c.meow();
		c.eat();

		Dog d =new Dog();
		d.bark();
		d.eat();
}}



