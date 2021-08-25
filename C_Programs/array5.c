//wap to create an character array of elements to store 5 charcter
//accept 5 no. from user and store it in an array.
//then display value stored in an array;
//using for loop
#include<stdio.h>
int main()
{
	int i;
	char ch[5];
	for(i=0;i<5;i++)
	{
		printf("\nEnter character");
		fflush(stdin);
		scanf("%c",&ch[i]);
	}
	for(i=0;i<5;i++)
	{
		printf(" %c", ch[i]);//print without space
	 
	}
	for(i=0;i<5;i++)
	{
		printf("\n %c",ch[i]);//print with new line
	 
	}
}
