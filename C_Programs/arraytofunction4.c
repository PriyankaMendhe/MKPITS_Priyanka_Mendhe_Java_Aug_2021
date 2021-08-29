////3- create a program to accept 5 product name and  product price in array and then pass this array to function calculate_price 
//to calculate total_price
#include<stdio.h>
int main()
{
	int product_price[5],i;//array of 5 rows and 20 column;
	char product_name[5][20];
	for(i=0;i<5;i++)
	{
		printf("Enter product name..");
		scanf("%s",&product_name[i]);
		printf("Enter product price..");
		scanf("%d",&product_price[i]);
	}
	calculate_price( product_price);
	
	
}
int calculate_price(int product_price[])
{
	int total=0,i;
	for(i=0;i<5;i++)
	{
		total=total+ product_price[ i];
	}
	printf("\nTotal Price of product is= %d",total);
}
