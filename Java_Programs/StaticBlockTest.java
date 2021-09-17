//Example of static block

    class StaticBlockTest{


      static {


		  System.out.println("static block is invoked");

      } // static block invok before main while class loading


      public static void main(String args[]){


       System.out.println("Hello main");
      }
    }

