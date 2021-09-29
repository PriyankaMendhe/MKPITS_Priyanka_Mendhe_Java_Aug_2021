//Example of an abstract class that has abstract and non-abstract methods


     abstract class Bike{
       Bike(){System.out.println("bike is created");}
       abstract void run();
       void changeGear(){System.out.println("gear changed");}
     }
    //Creating a Child class which inherits Abstract class
     class Honda extends Bike{
     void run(){System.out.println("running safely..");}
     }
    //Creating a Test class which calls abstract and non-abstract methods
     class BikeTestAbstraction{
     public static void main(String args[]){
      Bike obj = new Honda();  // calling bike constructor and instance for honda class
      obj.run();
      obj.changeGear();
     }
    }
