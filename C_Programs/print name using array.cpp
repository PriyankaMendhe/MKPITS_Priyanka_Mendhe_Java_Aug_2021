//wap to accept your name and print the name 5 times using array
#include<stdio.h>
int main()
{
	char name[20];
	int i;
	printf("enter your name.");
	gets(name);//gets take string including space
	for(i=0;i<=4;i++)
	{
		printf("\nyour entered name is: %s",name);
	}
	
	return 0;

}
