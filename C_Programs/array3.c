//wap to create an integer array of elements to store 5 no.
//accept 5 no. from user and store it in an array.
//then display value stored in an array;
//using for loop
#include<stdio.h>
int main()
{
	int i, num[5];
	for(i=0;i<5;i++)//for accepting no. from user and store it in array
	{
		printf("\nenter no");
		scanf("%d",&num[i]);
	}
	//for displaying array value
	for(i=0;i<5;i++)
	{
		printf("\nNum[%d]=%d",i,num[i]);
	}
}
