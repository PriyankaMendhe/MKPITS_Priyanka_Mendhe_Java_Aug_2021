 class Bicycle
  {

 	  boolean isMoving;//instance variable
 	  int speed;

 	  public static void main(String args[])
 	  {

 		  Bicycle b1 = new Bicycle();
 		  b1.isMoving=true;
 		  b1.speed = 100;

 		 System.out.println("Now, Bicycle is Moving and Speed is "+b1.speed);
 		 b1.ApplyBreak(b1);
 		 System.out.println("Now, Bicycle is Moving and Speed is "+b1.speed);
 		  b1.isMoving=false;
          b1.ApplyBreak(b1);

 		 System.out.println("Now, Bicycle is Stopped and Speed is "+b1.speed);// error showing speed 70 not 0(zero).

     }

     void ApplyBreak(Bicycle b1)
     {

 		if(b1.isMoving=true)//if check with true else assignemnt not working
 		{
 			b1.speed=0;
 		}
 		else
 		{

			b1.speed =70;
	     }



     }
 }
