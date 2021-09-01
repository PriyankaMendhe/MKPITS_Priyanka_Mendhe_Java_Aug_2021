//18	wap to create a function calculate with two integer arguments and																							
//	return the addition of two arguments.
#include<stdio.h>
int main()
{
	int n1,n2,addition;
	printf("\n Enter 2 no.");
	scanf("%d%d",&n1,&n2);
	addition = calculate(n1,n2);
	printf("\nAddition of 2 no is = %d",addition);
}
int calculate(int n1, int n2)
{
	int sum=0;
	sum=n1+n2;
	return sum;
}	
