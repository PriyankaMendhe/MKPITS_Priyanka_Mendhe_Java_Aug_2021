//1- wap to create a character array of 10 elements to store a name .
#include<stdio.h>
int main()
{
	int i;
	char name[10]={'P','r','i','y','a','n','k','a','\0'};
	for(i=0;i<10;i++)
	{
		printf("%c",name[i]);
	}
	
	printf("\nby using string specifier :\n%s",name);
}
