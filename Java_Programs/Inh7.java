
class Animal{

	void eat() { System.out.println("Eating...........");}
}

class Dog extends Animal{

	void bark() { System.out.println("barking...........");}
}

class BabyDog extends Dog{

	void weep() { System.out.println("weeping...........");}
}

class Inh7{

	public static void main(String argc[]){

	BabyDog b = new BabyDog();
	b.eat();
	b.bark();
	b.weep();
}
}