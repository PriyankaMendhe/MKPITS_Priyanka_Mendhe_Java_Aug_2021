// create a structure book with members bookid, title, author and price.
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
	struct book b;
	b.bookid=101;
	strcpy(b.title," C language");
	fflush(stdin);
	strcpy(b.author,"Xyz");
	b.price=225.75f;
	printf("Book Id = %d",b.bookid);
	printf("\n Title : %s",b.title);
	printf("\n Author=%s",b.author);
	printf("\n Price= %f",b.price);
}
