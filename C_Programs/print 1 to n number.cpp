//wap to print n to 1 no.
#include<stdio.h>
int main()
{
    int num,i=1;
	printf("enter number");
	scanf("%d",&num);
	while(i<=num)
	{
		
		printf("\n%d",num);
		
		i++;
		num--;
	}
	
	return 0;

}
