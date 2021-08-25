//wap to create int array of elements to store 5 charcter
//accept 5 no. from user and store it in an array.
//then sum the eelemts of array and diplay result.
//using for loop
#include<stdio.h>
int main()
{
	int num[5],i,sum=0;
	  
	for(i=0;i<5;i++)
	{
		printf("Enter no.");
		fflush(stdin);
		scanf("%d",&num[i]);
	}
	for(i=0;i<5;i++)
	{
	    sum=sum+num[i];
		 	
	}
		printf("\n sum of elements of an array = %d",sum);
	
}
