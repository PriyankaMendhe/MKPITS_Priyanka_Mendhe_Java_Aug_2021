//multiplication of row of arr1 and col of arr2 into arr3
//2 create a 2d array of 3 rows and 3 columns and store some value in it and display the values in arr3
//result stored column wise in arr3
#include<stdio.h>
int main()
{
	int arr1[3][3]={{1,2,3},{4,5,6},{7,8,9}};
	int arr2[3][3]={{1,2,3},{4,5,6},{7,8,9}};
	int arr3[3][3],r,c;
	for(r=0;r<3;r++)
	{
		for(c=0;c<3;c++)
		{
			arr3[c][r]= arr1[r][c] * arr2[c][r];//multiplication of row of arr1 and col of arr2 into arr3
		}
	}
	printf("\narr1:\n");
	for(r=0;r<3;r++)
	{
		for(c=0;c<3;c++)
		{
		 printf("\t%d",arr1[r][c] );
		}
		printf("\n");
	}
	printf("\narr2:\n");
	for(r=0;r<3;r++)
	{
		for(c=0;c<3;c++)
		{
		  printf("\t%d",arr2[r][c] );
		}
			printf("\n");
	}
	printf("\n Mulitiplication of arr1 row to arr2 column into arr3:\n");
	printf("\n printing arr3 column wise:\n");
	for(r=0;r<3;r++)
	{
		for(c=0;c<3;c++)
		{
			printf("\t%d",arr3[r][c]);
		}
	 printf("\n");
	}
	
}
