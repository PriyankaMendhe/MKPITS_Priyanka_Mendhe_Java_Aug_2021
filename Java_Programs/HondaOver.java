//Creating a parent class

class Vehicle
{
    void run(){System.out.println("Vehicle is running");}
}

//Creating a child class
 class Bike3 extends Vehicle
 {

    void run(){System.out.println("bike is running");}
 }
class Car extends Vehicle
 {

    void run(){System.out.println("car is running");}
 }

 class HondaOver
      {

       public static void main(String args[])
       {

       //creating an instance of child class
       Bike3 obj = new Bike3();

       //calling the method with child class instance
       obj.run();

        //creating an instance of child  car class
       Car c1 = new Car();

       //calling the method with child class instance
       c1.run();



       }
     }
