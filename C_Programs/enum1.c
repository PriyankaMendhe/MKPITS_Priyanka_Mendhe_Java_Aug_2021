#include<stdio.h>
enum weekdays{Sunday=1,Monday, Tuesday, Wednesday, Thursday, Friday,Saturday};

int main()
{
	enum weekdays w;
	w=Saturday;
	printf("Value of Saturday in Intger= %d",w);
}

