    // upcasting to super class by child class

    class Bike{
      void run(){System.out.println("running");}
    }
    class Splendor extends Bike{
      void run(){System.out.println("running safely with 60km");}

      public static void main(String args[]){
		//Bike b = new Bike();// it will output "running"

        Bike b = new Splendor();//upcasting    it will output "running safely with 60km"
        b.run();
      }
    }
