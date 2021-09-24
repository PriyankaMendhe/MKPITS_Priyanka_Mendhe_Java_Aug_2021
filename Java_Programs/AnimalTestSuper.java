// Super Keyword

class Animal{

String color = "White"; }

class Dog extends Animal{

String color = "Black";

void display(){

System.out.println("Color from child class Dog = "+color);
System.out.println("Color from Parent class Animal :  "+super.color);

}

}
class AnimalTestSuper{

	public static void main(String abc[]){

Dog d = new Dog();

d.display();

}


}