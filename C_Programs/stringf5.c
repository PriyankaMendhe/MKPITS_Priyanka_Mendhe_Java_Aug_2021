//16 strcmp 
//wap to compare two string
#include<stdio.h>
#include<string.h>
int main()
{
	char string1[20],string2[20];
	int ans;
	printf("enter string 1 :");
	scanf("%s",&string1);
	printf("\n enter string 2:");
	fflush(stdin);
	scanf("%s",string2);
	ans=strcmp(string1,string2);//if value is true it returns 0 else 1;
	if(ans==0)
	{
		printf("Both string are same");
	}
	else
	{
		printf("Both the string are different");
	}
}


