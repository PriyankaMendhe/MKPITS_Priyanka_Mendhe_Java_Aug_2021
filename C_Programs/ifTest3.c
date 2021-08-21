//3- Write a C program to check whether a given number is positive or negative
#include<stdio.h>
int main()
{
	int num;
	printf("Enter a no. to check postive or negative..");
	scanf("%d",&num);
	if(num>0)
	{
		printf("\n%d is a positive number",num);
	}
	else
	{
		printf("\n%d is a negative number",num);
	}
}
