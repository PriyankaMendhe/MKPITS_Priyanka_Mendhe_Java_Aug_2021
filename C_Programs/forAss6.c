//9 - wap to accept 5 subject marks using for loop and print total and percentage.
#include<stdio.h>
int main()
{
	int i,total=0, sub;
	float percentage;
	
	for(i=1;i<=5;i++)
	{
		printf("\nenter subject [ %d ]  marks",i);
		scanf("%d",&sub);
		total= total+sub;

	}
	printf("\ntotal subject marks=%d",total);
	percentage = (float) total* 100 / 500 ;
	printf("\npercentage =%.2f",percentage);
}

	 
