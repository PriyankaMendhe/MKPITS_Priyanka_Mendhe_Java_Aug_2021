class Animal{
    void eat(){System.out.println("animal is eating...");}
    }

    class Dog extends Animal{
    void eat(){System.out.println("dog is eating...");}
    }

    class BabyDog1 extends Dog{
    public static void main(String args[]){

    Animal a=new BabyDog1(); // upcasting

    a.eat();  // Since, BabyDog is not overriding the eat() method, so eat() method of babyDog class parent Dog class
                //is invoked.
    }}




