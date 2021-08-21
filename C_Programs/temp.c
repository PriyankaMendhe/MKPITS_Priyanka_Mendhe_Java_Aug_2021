//C program to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit
//c*(9/5)+32=f
//f-32 * 5/9 =c

#include<stdio.h>
int main()
{
	float cl,fh;
	char ch;
	printf("\npress c to convert temp from fh to cl...");
	printf("\npress f to convert temp from cl to fh...");
	printf(" \nenter your choice as (c,f)...");
	scanf("%c",&ch);
	if(ch=='c')
	{
	
	  printf("enter temp in farhenite");
	  scanf("%f",&fh);
	  cl = (fh - 32 ) * 5/9 ;
	  printf(" %.2f farehnite to %.2f celcius ",fh,cl);
	}
	else
	{
		if(ch=='c')
		{
		   printf("enter temp in celcius");
	       scanf("%f",&fh);
	       cl = ( 1.8 * cl ) + 32 ;
	        printf(" %.2f celcius  to %.2f farehnite  ",cl,fh);	
		}
		else
		{
				printf("\nInvalid choice");
		}
		
	
		
	}
	
}
