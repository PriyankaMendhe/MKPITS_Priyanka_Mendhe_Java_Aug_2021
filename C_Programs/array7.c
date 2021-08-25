//wap to create long int array of elements to store 5 charcter
//accept 5 no. from user and store it in an array.
//then display value stored in an array;
//using for loop
#include<stdio.h>
int main()
{
	int i;
	long int num[5];//alots more memor
	for(i=0;i<5;i++)
	{
		printf("Enter no.");
		fflush(stdin);
		scanf("%ld",&num[i]);	// ld format specifier for long int
	}
	for(i=0;i<5;i++)
	{
		printf("\n num[%d] = %ld",i, num[i]);
		 	
	}
	
	
}
