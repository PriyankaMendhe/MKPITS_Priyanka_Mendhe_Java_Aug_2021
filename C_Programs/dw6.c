// wap to accept a number and print factorial of a number using do while loop.
#include<stdio.h>
int main()
{
	int num,fact ,i;
	char ans;
	do
	{
		fact=1;
		printf("\nEnter no. to calculate factorial..");
		scanf("%d",&num);
		for(i=num;i>=1;i--)
		{
			fact=fact*i;
			
		}
		printf("Factorial of %d is = %d ",num,fact);
		printf("\ndo you want to calculate another no factorial ,if yes press y or n ?");
		    fflush(stdin);
		    scanf("%c",&ans);
	}while(ans=='y');
}
