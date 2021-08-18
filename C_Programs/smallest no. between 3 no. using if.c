//wap to accept 3 no. and display the smallest no.
#include<stdio.h>
int main()
{
	int n1, n2,n3;
	printf("Enter 3 no.");
	scanf("%d%d%d",&n1,&n2,&n3);
	if(n1<n2&&n1<n3)
	{
		printf("n1 is smmallest no.");
	}
	else
	{
		if(n2<n3)
		{
		   printf("n2 is smmallest no.");		
		}
		else
		{
			printf("n3 is smmallest no.");	
		}
	   
	}
return 0;
}
