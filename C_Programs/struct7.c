//7 - create a structure product  and accept values from the user
struct product
{
	int pid;
	char pname[20];
	float pprice;
};
#include<stdio.h>
int main()
{
	struct product p1;
	printf("\nEnter product id>>");
	scanf("%d",&p1.pid);
	printf("\nEnter product name>>");
	fflush(stdin);
	gets(p1.pname);
	printf("Enter Product Price>>");
	fflush(stdin);
	scanf("%f",&p1.pprice);
	printf("\n.....Product Details as below.........\n");
	printf("\n Product id = %d",p1.pid);
	printf("\n Product Name=%s",p1.pname);
	printf("\n Product Price= %.2f",p1.pprice);
	printf("\n Thank you :)");
	
}



	
	 


