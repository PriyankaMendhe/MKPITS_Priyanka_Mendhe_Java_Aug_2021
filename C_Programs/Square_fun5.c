//// wap to create a function square with one int parameter to accept a number and calculate and display the square of that no.
#include<stdio.h>
void square(n1)

{
	int square;
	square = n1 * n1;
	printf("Square of %d no is = %d",n1,square);
	
}
int main()
{
	int n1=5;
	square(n1);
	printf("\nfunction end from main");
}
