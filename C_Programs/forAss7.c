#include<stdio.h>
int main()
{
	int i,j,count;
	printf("\nprimeno. between 1 to 20 ");
	for(i=1;i<=20;i++)
	{
		count=0;
		
		for(j=1;j<=i;j++)
		{
			if(i%2==0)//this logic will print 1 3 5.....
			{
				count++;
			}
			else
			{
				if(i==j)
		        {
		        	printf("\t%d",i);
			
		         }
				
			}
		
		}
		
	}
	
}
	
 
