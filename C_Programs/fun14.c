////1 - wap to create a function factorial  , calculate factorial and return the factorial.
#include<stdio.h>


int main()
{
	int fact;
	fact=factorial();
	printf("Factorial is %d",fact);
}
int factorial()
{
	int num, fact=1;
	printf("Enter no.");
	scanf("%d",&num);
	while(num>0)
	{
		fact= fact*num;
		num--;
	}
	return fact;
}
