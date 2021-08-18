//wap to accept your name and print the name 5 times using array and for loop
#include<stdio.h>
int main()
{
	char name[20];
	int i=0;
	printf("enter your name.");
	gets(name);//gets take string including space
	while(i<=4)
	{
		printf("\nyour entered name is: %s",name);
		i++;
	}
	
	return 0;

}
