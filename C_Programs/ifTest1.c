//1. Write a C program to accept two integers and check whether they are equal or not.
#include<stdio.h>
int main()
{
	int int1,int2;
	printf("Enter  integer or number...");
	scanf("%d%d",&int1,&int2);
	if(int1==int2)
	{
		printf("Entered two intergers are eqaul..");
	}
	else
	{
		printf("Entered two intergers are not eqaul..");
	}
	
	return 0;
}
