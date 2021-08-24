//wap to print even no between 1 to 20
#include<stdio.h>
int main()
{
	int i;
	for(i=1;i<=20;i++)
	{
		
		if(i%2!=0)
		{
			
			continue;
		}
		printf("\n%d",i);
	}
	printf("\nEnd of loop using continue statment");
}
