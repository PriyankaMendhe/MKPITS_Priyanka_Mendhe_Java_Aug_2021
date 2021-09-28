//Creating a parent class
     class Vehicle
     {
       void run(){System.out.println("Vehicle is running");}
     }

     //Creating a child class
     class Bike2 extends Vehicle
     {
		 void run(){System.out.println("bike is safely running");}

       public static void main(String args[]){

       //creating an instance of child class
       Bike2 obj = new Bike2();

       //calling the method with child class instance
       obj.run();
       }
     }
