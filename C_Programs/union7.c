//union of customer data
union customer
{
	int cust_id;
	char cust_name[30];
	double cust_mno;
};
#include<stdio.h>
#include<string.h>
int main()
{
	union customer c1;
	
	printf("\n Enter customer id>>");
	scanf("%d",&c1.cust_id);
	printf("\n Customer id is = %d",c1.cust_id);
	
	printf("\n Enter mobile no.>>");
	scanf("%lf",&c1.cust_mno);
	printf("\n Mobile no.= %.0lf",c1.cust_mno);
	
	printf("\n Enter customer Name>>");
	fflush(stdin);
	gets(c1.cust_name);
	printf("\n Name=%s",c1.cust_name);
}
