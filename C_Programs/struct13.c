//13 - create a structure array of 5 elements of structure book .
struct book
{
	int bookid;
	char title[20];
	char author[20];
	float price;
	
};
void display(struct book b1);
#include<stdio.h>
int main()
{
	struct book b[5];
	int i=0;
	while(i<5)
	{
    printf("\nEnter book id>>");
	scanf("%d",&b[i].bookid);
	printf("Enter Title of book>>");
	fflush(stdin);
	gets(b[i].title);
	printf("Enter author>>");
	fflush(stdin);
	gets(b[i].author);
	printf("Enter Price of book>>");
	scanf("%f",&b[i].price);
	
	printf("\n.....book Details as below.........\n");
	display(b[i]);
	
	i++;
	}
}
void display(struct book b1)
{
	printf("\n Book ID= %d",b1.bookid);
	printf("\n Title=%s",b1.title);
	printf("\n Author=%s",b1.author);
	printf("\n Price= %.2f",b1.price);
	 
	
}
 

