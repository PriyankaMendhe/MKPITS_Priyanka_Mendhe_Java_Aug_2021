class Animal{

void eat(){System.out.println("eating........");}
}

class Dog extends Animal{

void bark(){System.out.println("bark........");}
}

class Inh3{
public static void main(String argc[])
{
	Dog d = new Dog();
	d.eat();
	d.bark();
}
}