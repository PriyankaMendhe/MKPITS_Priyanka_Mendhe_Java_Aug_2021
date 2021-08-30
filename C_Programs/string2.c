//2- wap to accept a string and count the no. of vowels in it .
#include<stdio.h>
int main()

{
	char ch[20];
	int i=0,count=0;
	printf("\nEnter the string.");//priyanka
	scanf("%s",&ch);
	while(i<20)
	{
		if(ch[i]=='a'|| ch[i] == 'e'|| ch[i] == 'i'|| ch[i] == 'o'|| ch[i] == 'u')
		{
			count++;
		}
		i++;
	}
	printf("\nNo. of vowels in string = %d",count);//3
	
}
