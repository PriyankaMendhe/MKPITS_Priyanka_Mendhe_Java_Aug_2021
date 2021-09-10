 import java.util.*;//java is  package, util is subpackage
 class SquareNumberI
 {
 	int num ,square; // instance variable
  public static void main(String []abc )
 {
 	//creating instance (object ) of squarenumber class
 	SquareNumberI s1=new SquareNumberI();
 	s1.num=5;
 	System.out.println(" number stored in s1 instance var = " + s1.num);
 	s1.square= s1.num * s1.num;
 	System.out.println("Square = "+ s1.square);
 	SquareNumberI s2=new SquareNumberI();
 		s2.num=7;
 	System.out.println(" number stored in s2 instance var = " + s2.num);
 	s2.square= s2.num * s2.num;
 	System.out.println("Square = "+ s2.square);
 }
 }

