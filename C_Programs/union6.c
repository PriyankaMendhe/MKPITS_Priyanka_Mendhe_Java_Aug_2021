//wap to accept union value from user
//printing currpted value if we print all data at one time
union data
{
	int i;
	float j;
	char name[20];
};
#include<stdio.h>
#include<string.h>
int main()
{
	union data d1;
	printf("\n Enter i(int value)>>");
	scanf("%d",&d1.i);
	printf("\n Value of I= %d",d1.i);
	printf("\n Enter j(float value)>>");
	scanf("%f",&d1.j);
	printf("\n Enter Name>>");
	fflush(stdin);
	gets(d1.name);
	
	printf("\n Name=%s",d1.name);//it holds last accepted data in union
	printf("\n Value of I= %d",d1.i);//showing garbage value
	printf("\n Value of j= %f",d1.j);
	 

}
