//16 -  strrev function
//wap to reverse a string
#include<stdio.h>
#include<string.h>
int main()
{
	char string1[20], orgstring[20];
	printf("Enter string 1");
	gets(string1);
	strcpy(orgstring,string1);
    strrev(string1);
    printf("\n %s is original string", orgstring);
    printf("\n %s is reverse string",string1);
}

