//10 wap to pass rno(int) and name (string) to function to display it.
#include<stdio.h>
int main()
{
	int rno=11;
	char name[20]="MKPITS";
	display( rno , name);
	 
	
}
void display( int rno, char *name)
{
	printf("%d is roll no",rno);//
	printf(" \n%s is a string",name);// MKPITS is a string
}

