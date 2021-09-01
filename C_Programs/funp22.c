//22	create a function to calculate factorial of a number	
#include<stdio.h>
int main()
{
	int n ;
	printf("\n Input the number : ");
	scanf("%d",&n);
	calculate_fact(n);
	 
}
int calculate_fact(int n)
{
	int fact=1;
	int i =1;
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	printf("Factorial of %d is : %d",n,fact);
	 
}
