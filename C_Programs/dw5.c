//5 wap to print table of a number 
#include<stdio.h>
int main()
{
	int num,i, result=0;
	char ans;
	do
	{
		printf("\nEnter num for table..");
		scanf("%d",&num);
		for(i=1;i<=10;i++)
		{
	       result = num * i;
	       printf("\n%d * %d = %d",num,i,result);
		}
		printf("\ndo you want toprint another no. table, if yes press y or n ?");
		fflush(stdin);
		scanf("%c",&ans);
	}while(ans=='y');
	printf("bye....");
}
