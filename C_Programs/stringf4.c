//13 //wap to add two string using strcat function
//connect string
#include<stdio.h>
#include<stdio.h>
int main()
{
	char firstname[20],lastname[10];
	printf("\n enter your first name.");
	scanf("%s",firstname);
	printf("Enter last name.");
	fflush(stdin);
	scanf("%s",lastname);
	strcat(firstname,lastname);//connect 2 string and string stored in 1st string
	printf("after connecting string is %s",firstname);
}
