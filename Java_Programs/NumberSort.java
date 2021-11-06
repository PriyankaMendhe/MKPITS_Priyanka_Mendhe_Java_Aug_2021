import java.util.*;
class NumberSort{

public static void main(String argc[])
{

      ArrayList<Integer> number = new ArrayList<Integer>();

      number.add(11);
      number.add(55);
      number.add(851);
      number.add(24);
      number.add(99);


      System.out.println("Before Sorting");

      for(int num : number)
	  {

	  	System.out.println("Number: "+num);

      }

System.out.println("After Sorting");

Collections.sort(number);



      for(int num : number)
	  {

	  	System.out.println("Number: "+num);

      }

 }}