//15 -Write a C program to check whether a character is an alphabet, digit or special character

#include<stdio.h>
int main()
{
	char ch;
	printf("Enter character to check whether a character is alphabet , digit or special symbol");
	scanf("%c",&ch);
	if((ch=='a'&& ch=='z')||(ch=='A'&& ch=='Z'))
	{
		printf("entered %c character is Alphabet",ch);
	}
	else if(ch== 0 &&ch== 9)
	{
		printf("entered %c character is Alphabet",ch);
	}
		

}
