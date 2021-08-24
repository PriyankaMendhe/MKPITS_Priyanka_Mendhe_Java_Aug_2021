//12 - wap to create a function factorial with one int parameter , calculate factorial and return the factorial.
#include<stdio.h>
int factorial(int num)
{
	int fact=1;
	while(num>0)
	{
		fact=fact*num;
		num--;
	}
	return fact;
}
int main()
{
	int num,fact;
	printf("\nEnter no. to calculate factorial..");
	scanf("%d",&num);
	fact=factorial(num);
	printf("\nFactorial of no. is= %d",fact);
}
