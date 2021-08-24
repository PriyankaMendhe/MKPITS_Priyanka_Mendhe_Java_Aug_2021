 // wap to create a function sum to accept 2 no. and display the addition of 2 no.
//creating a function sum
#include<stdio.h>
sum()
{
	int n1, n2 , result;
	printf("Enter 2 no.");
	scanf("%d%d",&n1,&n2);
	result=n1+n2;
	printf("sum of no. = %d",result);
}
int main()
{
	sum();
	printf("\nFunction end bye");
	return 0;
}

