//wap to create double array of elements to store 5 charcter
//accept 5 no. from user and store it in an array.
//then display value stored in an array;
//using for loop
#include<stdio.h>
int main()
{
	int i;
	double num[5];//alots more memory
	for(i=0;i<5;i++)
	{
		printf("Enter no.");
		fflush(stdin);
		scanf("%lf",&num[i]);	
	}
	for(i=0;i<5;i++)
	{
		printf("\n num[%d] = %lf",i, num[i]);
		 	
	}
	
	
}
