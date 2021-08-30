//3- accepting string from the user without & operator.
#include<stdio.h>
int main()
{
	char ch[20];
	int i=0,count=0;
	printf("Enter a string..");
	scanf("%s",ch);//accepting string without "&" operator
	while(i<20)
	{
		if(ch[i]== 'a' ||ch[i]== 'i' ||ch[i]== 'e' ||ch[i]== 'o' ||ch[i]== 'u' )
		{
			count++;
		}
		i++;
	}
	printf("Vowel in String=%d",count);
}
