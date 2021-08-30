//---------------------------------
//17 wap to find whether string is palindrome or not 
//(palindrome after reversing the string should be same ie madam)
#include<stdio.h>
#include<string.h>
int main()
{
	char name[20];
	char orgname[20];
	char revname[20];
	printf("\n Enter name..");
	gets(name);
	strcpy(orgname,name);
	printf("\n %s is a original string",orgname);
	strrev(name);
	printf("\n after reversing string is %s",name);
	
	if( strcmp(orgname, name) ==0)
	{
		printf("\n string is palindrome");
	}
	else
	{
		printf("\n string is not palindrome");
	}
	
}


