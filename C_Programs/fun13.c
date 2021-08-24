////12 - wap to create a function factorial  , calculate factorial and return the factorial.
#include<stdio.h>
int factorial()
{
	int num,fact=1;
	printf("enter no.");
	scanf("%d",&num);
	while(num>0)
	{
		fact=fact*num;
		num--;
	}
	return fact;
	
}
int main()
{
	int fact;
	fact=factorial();
	printf("\nFactorial of no. is = %d",fact);
	
}
