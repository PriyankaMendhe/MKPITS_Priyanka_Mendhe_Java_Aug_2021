//Calculate factorial using Acronym object

class factorial
{

   int num;
   int fact=1;
  void calculateFactorial(int num)
  {

      while(num>0)
      {
         fact = fact * num;
         num--;
      }

     System.out.println("Factorial :  "+fact);
  }
 }
 class factorialTest// run both way ie. with additional class or with main class
 {

public static void main(String anc[])
{

   new factorial().calculateFactorial(5);
   new factorial().calculateFactorial(4);// without createing object(Acronym object) === new factorial() direct reference
}


}