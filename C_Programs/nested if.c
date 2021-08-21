#include<stdio.h>
int main()
{
	int mk,i;
	
	for(i=1;i<=5;i++)
{
	
	printf("\nEnter your marks");
	scanf("%d",&mk);
	
	if(mk>=85&&mk<100)
	{
		printf("got A");
	}
	else
	{
		if(mk>=60&&mk<85)
		{
			printf("got B");
		}
		else
		{
			if(mk>40&&mk<60)
			{
				printf("got c");
			}
			else
			{
				if(mk>30&&mk<40)
				{
					printf("got c-");
				}
				else
				{
					printf("you are fail!!");
				}
			}
		}
	}
}
	return 0;
}
