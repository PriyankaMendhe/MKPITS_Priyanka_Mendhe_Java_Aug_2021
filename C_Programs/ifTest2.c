//2- Write a C program to check whether a given number is even or odd.
#include<stdio.h>
int  main()
{
	int num;
	printf("Enter a no. to check even or odd..");
	scanf("%d",&num);
	if(num%2==0)
	{
		printf("%d is even number",num);
	}
	else
	{
		printf("%d is odd number",num);
	}
	return 0;
}
