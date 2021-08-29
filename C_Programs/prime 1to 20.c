//10 - wap to print prime no. between 1 and 20 using while loop.

#include<stdio.h>
int main()
{
	int i,j;
	for(j=2;j<=20;j++)
	{
		i=2;
		while(i<=j)
		{
			if(j%i==0)
			{
				break;
			}
			i++;
		}
		if(i==j)
		{
			printf("\t %d",j);
		}
	}
}
	 
