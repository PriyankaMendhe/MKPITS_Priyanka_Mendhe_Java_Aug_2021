union data//union store 1 value at time and erase last data
{
	int i;
	float j;
	char name [20];
}d1;


#include<stdio.h>
#include<string.h>
int main()
{
	d1.i=20;
	printf("\n Value of I= %d",d1.i);
	d1.j=20.0f;
	printf("\n Value of j= %f",d1.j);
	strcpy(d1.name,"Priyanka");
	printf("\n Name=%s",d1.name);
	printf("\nNow  Value of I= %d",d1.i);//it will print garbage value
}
