import java.util.*;
class iterationWithCont
{
public static void main(String[] arg)
	{
		int num[] = {1,2,8,4,5 ,6,7}; //array of 5 elements
		//enhanced for loop or for each loop
		for(int n : num)
		{

			if(n==3)
			{
                            continue;
			}
				System.out.println("num = " + n);
		}
	}


}
