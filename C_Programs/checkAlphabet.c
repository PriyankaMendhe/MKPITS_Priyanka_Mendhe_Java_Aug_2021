//C program to check whether a character is an alphabet or not
#include<stdio.h>
int main()
{
	char ch;
	printf("\n enter any character: ");
	fflush(stdin);
	scanf("%c",&ch);
	if((ch>='a' && ch<='z') || (ch>='A' && ch <='Z'))
	{
		printf("\nentered character is alphabet");
	}
	else
	{
			printf("\nentered character is not alphabet");
		
	}
	return 0;
	
	
}
