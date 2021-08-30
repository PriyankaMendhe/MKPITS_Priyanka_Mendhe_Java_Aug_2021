//12 wap to find length of a string using string function..accept string from user.
#include<stdio.h>
#include<string.h>
int main()
{
	char ch[20];
	int length;
	printf("Enter the string");
	scanf("%s",ch);//not scan string including space
	length= strlen(ch);
	printf("\n %d is a length of above string.",length);
	
}
