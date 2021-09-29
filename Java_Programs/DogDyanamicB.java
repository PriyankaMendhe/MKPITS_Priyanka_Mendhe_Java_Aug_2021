//When type of the object is determined at run-time, it is known as dynamic binding.


    class Animal{
     void eat(){System.out.println("animal is eating...");}
    }

    class DogDyanamicB extends Animal{
     void eat(){System.out.println("dog is eating...");}

     public static void main(String args[]){
      Animal a=new DogDyanamicB();  // dyanamic binding
      a.eat();
     }
    }

