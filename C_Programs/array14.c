////2 create a 2d array of 3 rows and 4 columns and store some value in it and display the values
int main()
{
	int arr[3][4],i,j;
	for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			printf("\n Enter elements of arr[%d][%d]",i,j);
			scanf("%d",&arr[i][j]);
		}
	}
	
	printf("\nDisplaying the value stored in array using loop.\n");
		for(i=0;i<3;i++)
	{
		for(j=0;j<4;j++)
		{
			printf(" \t %d",arr[i][j] );
		 
		}
		printf("\n");
	}
	
	
}
