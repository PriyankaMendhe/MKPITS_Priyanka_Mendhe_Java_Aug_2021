//6-Write a C program to find the largest of three numbers
#include<stdio.h>
int main()
{
	int num1,num2,num3;
	printf("Enter 3 numbers..");
	scanf("%d%d%d",&num1,&num2,&num3);
	if(num1>num2&&num1>num3)
	{
		printf("%d is largest no than %d & %d",num1,num2,num3);
	}
	else
	{
		if(num2>num3)
		{
			printf("%d is largest no than %d & %d",num2,num1,num3);
		}
		else
		{
			printf("%d is largest no than %d & %d",num3,num2,num1);
		}
	}

 
	
}
