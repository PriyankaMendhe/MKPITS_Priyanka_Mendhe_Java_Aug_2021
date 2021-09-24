//also adds super() as the first statement.if not mention

    class Animal{

    Animal(){System.out.println("animal is created");}

    }
    class Dog extends Animal{

    Dog(){
		// here compiler consider super() as first statment thats why call to parent class
    System.out.println("dog is created");

    }
    }
    class TestSuper4{
    public static void main(String args[]){
    Dog d=new Dog();
    }}

