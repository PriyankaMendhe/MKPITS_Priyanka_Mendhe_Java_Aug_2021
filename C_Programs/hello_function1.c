//1- wap to create a function sayhello() to print hello.
#include<stdio.h>
void sayhello()
{
	printf("\nPrinting hello from sayhello function");
}
int main()
{
	printf("\nCalling the hello function");
	sayhello();
	printf(" \nagain calling sayhello() function ");
	sayhello();
	printf("\nEnd of calling function in main");
}
