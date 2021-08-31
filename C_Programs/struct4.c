//4- create a structure product with productid,productname,productprice.
struct product
{
	int pid;
	char pname[20];
	float pprice;
};
#include<stdio.h>
#include<string.h>
int main()
{
	struct product p1;
	p1.pid = 503;
	strcpy(p1.pname," Lipton Green Tea");
	p1.pprice=256.75f;
	 
	printf("\n.....Product Details as below.........\n");
	printf("\n Product id = %d",p1.pid);
	printf("\n Product Name=%s",p1.pname);
	printf("\n Product Price= %.2f",p1.pprice);
	printf("\n Thank you :)");
	 
}
