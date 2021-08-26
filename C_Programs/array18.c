////2 create a 2d array of 3 rows and 3 columns and store some value in it and transpose the array and display it
#include<stdio.h>
int main()
{
	int arr1[3][3]= {{1,2,3},{4,5,6},{7,8,9}};
	int arr_t[3][3];
	int r,c;
	//logic to do transpose of matrix..ie interchange row to col.
	for(r=0;r<3;r++)
    {
    	for(c=0;c<3;c++)
    	{
    		arr_t[c][r] = arr1[r][c];
		}
	
	}
	printf("\narr1:\n");	
	for(r=0;r<3;r++)
    {
    	for(c=0;c<3;c++)
    	{
    		 printf("\t%d",arr1[r][c]);
		}
		printf("\n");
	
	}
	printf("\nTranspose array of arr1 is arr_t:\n");	
	for(r=0;r<3;r++)
    {
    	for(c=0;c<3;c++)
    	{
    		 printf("\t%d",arr_t[r][c]);
		}
		printf("\n");
	
	}
	
}
	
		
