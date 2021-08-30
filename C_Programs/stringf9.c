//19 - strupr function 
//wap to convert string into upper case
#include<stdio.h>
#include<string.h>
int main()
{
	char name[20];
	printf("Enter name..");
	gets(name);
	strupr(name);
	printf(" Name=%s",name);
}

