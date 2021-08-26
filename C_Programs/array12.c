////2 create a 2d array of 2 rows and 2 columns and store some value in it and display the values
#include<stdio.h>
int main()
{
	int arr[2][2],i,j;
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("\n Enter elements of arr[%d][%d]",i,j);
			scanf("%d",&arr[i][j]);
		}
	}
	
	printf("\nDisplaying the value stored in array using loop.\n");
		for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("\t%d",arr[i][j] );
		 
		 
		}
		printf("\n");
	}
	
	
}
