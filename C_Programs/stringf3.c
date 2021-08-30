//12 strcpy
//program to copy one string into another
//wap to find length of a string.
#include<stdio.h>
#include<string.h>
int main()
{
	char string1[]="MKPITS";
	char string2[20];
	strcpy(string2 , string1);
	printf("\n%s is string1",string1);
	printf("\n After copying string 1 --> %s is string2",string2);
}

