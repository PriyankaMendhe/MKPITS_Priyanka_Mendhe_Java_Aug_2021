// create a structure book with members bookid, title, author and price.
//5 - create a structure book and create 2 structure variable b1 and b2
struct book
{
	int bookid;
	char title[20];
	char author[20];
	float price;
	
};
#include<stdio.h>
#include<string.h>
int main()
{
	struct book b1, b2;
	b1.bookid=101;
	strcpy(b1.title," C language");
	fflush(stdin);
	strcpy(b1.author,"Xyz");
	b1.price=225.75f;
	printf("\nStudent book 1 detail..\n");
	printf("\n Book Id = %d",b1.bookid);
	printf("\n Title : %s",b1.title);
	printf("\n Author=%s",b1.author);
	printf("\n Price= %.2f",b1.price);
	printf("\n--------------------------------------------");
	//b2 varible input
	b2.bookid=102;
	strcpy(b2.title," C++ ");
	fflush(stdin);
	strcpy(b2.author,"ABCD");
	b2.price=200.75f;
	printf("\nStudent book 2 detail..\n");
	printf("\n Book Id = %d",b2.bookid);
	printf("\n Title : %s",b2.title);
	printf("\n Author=%s",b2.author);
	printf("\n Price= %.2f",b2.price);
}
