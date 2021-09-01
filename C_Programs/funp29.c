//30	Write a C program to determine whether a given number is prime or not.	
#include<stdio.h>
int main()
{
	int num,flag = 1,i; 
	printf("Enter the no .");
	scanf("%d",&num);
	for(i=2;i<num;i++)
	{
		if(num%i==0)
		{
			flag = 0;
		}
	}
	if(flag == 1)
	{
		printf("\n number is prime");
	}
	else
	{
	     printf("\n number is not prime");	
	}
}
