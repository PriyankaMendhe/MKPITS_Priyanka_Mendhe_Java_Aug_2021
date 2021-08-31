//14 - create a structure array of 10 element of struture product.
struct product
{
	int pid;
	char pname[20];
	float pprice;
};
void display(struct product p1);
#include<stdio.h>
int main()
{
	struct product p[10];
	int i=0;
	
	while(i<10)
	{
	 
	printf("\nEnter product id>>");
	scanf("%d",&p[i].pid);
	printf("\nEnter product name>>");
	fflush(stdin);
	gets(p[i].pname);
	printf("Enter Product Price>>");
	fflush(stdin);
	scanf("%f",&p[i].pprice);
	printf("\n.....Product[%d] Details as below.........\n",i+1);
	display(p[i]);
	i++;
}
 
}
void display(struct product p1)
{
 

	printf("\n Product id = %d",p1.pid);
	printf("\n Product Name=%s",p1.pname);
	printf("\n Product Price= %.2f",p1.pprice);
	printf("\n Thank you :)");
	
}
