//11 -wap to print primeno. between 1 and 20 using for loop.
#include<stdio.h>
int main()
{
	int i,j,count;
	printf("\nprimeno. between 1 to 20 ");
	for(i=1;i<=20;i++)
	{
		count=0;
		
		for(j=1;j<=20;j++)// to print 2 in prime no. 1 2 3 5.....
		{
			
			if(i%j==0)
			{
				count++;
				
			}
			
		}
		if(count==2)
		{
			printf("\t%d",i);
	}	}
			
	
}
	
