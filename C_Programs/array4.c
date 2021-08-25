//wap to create an float array of elements to store 5 no.
//accept 5 no. from user and store it in an array.
//then display value stored in an array;
//using for loop
#include<stdio.h>
int main()

{
	float num[5];
	int i;
	for(i=0;i<5;i++)
	{
		printf("Enter a no.");
		scanf("%f",&num[i]);
	}
		for(i=0;i<5;i++)
	{
		printf("\nnum[%d]:=%.2f",i,num[i]);
		
	}
	
	
}
