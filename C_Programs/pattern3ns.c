//wap to print output like this      1	  
//		    				         1	  2     
//				                     1    2     3
#include<stdio.h>
int main()
{
	 int row,col;
	for(row=1;row<=3;row++)
	{
		for(col=1;col<=row;col++)
		{
			printf("\t %d",col);
		}
		
		printf("\n");
	}
}
