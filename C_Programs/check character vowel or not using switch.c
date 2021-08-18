//2- wap to accept a character and then display whether it is vowel or not. using if statment
#include<stdio.h>
#include<conio.h>
int main()
{
	char ch;
	printf("Enter the character to check vowel or not between a to z");
	scanf("%c",&ch);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		
			printf("entered character is vowel");		
	}
	else
	{
		printf("entered charcter is not vowel");
	}
	getche();	
return 0;
}
