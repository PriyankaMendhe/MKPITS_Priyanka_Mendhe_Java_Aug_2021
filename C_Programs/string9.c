//9 - example of passing a string to function to display the string
#include<stdio.h>
int main()
{
	char name[ ]="Awaaz India";
	display(name);//passing name of array
}
void display ( char *ch )//accept in pointer variable
{
	printf("%s",ch);//printing pointer varibale value
}
