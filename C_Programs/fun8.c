//8 wap to create a function factorial with one int parameter ,
//calculate and display the factorial of that number.
#include<stdio.h>
void factorial(int num )
{
	int fact=1;
	while(num>0)
	{
		fact = fact * num;
		num--;
	}
	printf(" \nfactorial  is: %d",fact);
	
}
int main()
{
	int num;
	printf("\nenter no for factorial:");
	scanf("%d",&num);
	factorial(num);
	printf("\nExit from main");
	
}
