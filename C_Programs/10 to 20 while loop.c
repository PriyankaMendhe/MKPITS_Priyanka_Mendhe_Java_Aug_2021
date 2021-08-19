//7 wap to print even no between 1 and 10
#include<stdio.h>
#include<conio.h>
int main()
{
	int num=1;
	printf(" Even no. series between 1 to 10");
	while(num<=10)
	{
		if(num%2==0)
		{
			printf("\n%d",num);
		   
		}
	     num++;	
	}
	return 0;
}

