//4 - ex of union display currpted value of i & j;

union data//union store 1 value at time and erase last data
{
	int i;
	float j;
	char name [20];
};


#include<stdio.h>
#include<string.h>
int main()
{
	union data d1;
	d1.i=20;
	d1.j=20.0f;
	strcpy(d1.name,"Priyanka");
	printf("\n Name=%s",d1.name);
	printf("\n Value of I= %d",d1.i);
	printf("\n Value of j= %f",d1.j);
}
	 
