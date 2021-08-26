//1- wap to search an element in an array.(create a array of 5 elements and store 5 numbers in it ,
// then accept a number from the user and find whether that no. is in an array or not)
#include<stdio.h>
int main()
{
	int arr[5]={1,2,3,4,5},num,i;
	
	printf("Enter no. to search in array...");
	scanf("%d",&num);
	for(i=0;i<5;i++)
	{
		if(arr[i]==num)
		{
			printf("\nNumber found in an array at elements %d ",num-1);
			break;
		}
	}
	if(i==5)
	{
		printf("No. not found in an array ");
	}
	
}
