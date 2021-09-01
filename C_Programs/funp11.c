//11	wap to accept a no and print factorial of that number
#include<stdio.h>
int main()
{
	int n,fact=0;
	printf("\n Input the number : ");
	scanf("%d",&n);
	fact = calculate_fact(n);
	printf("Factorial of %d is : %d",n,fact);
	
}
int calculate_fact(int n)
{
	int fact=1;
	int i =1;
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	return fact;
}
