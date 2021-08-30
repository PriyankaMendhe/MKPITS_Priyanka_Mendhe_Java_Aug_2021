//18 -strlwr() function
//wap to convert string into lower case
#include<stdio.h>
#include<string.h>
int main()
{
	char name[20];
	printf("Enter firstname..");
	gets(name);
	strlwr(name);//convert string into lower case
	printf("\n Name = %s",name);
}
