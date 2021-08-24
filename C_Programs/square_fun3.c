 // wap to create a function square to accept  a no. and display the square of that no.
#include<stdio.h>
void square()
{
	int n1, square;
	printf("Enter no.");
	scanf("%d",&n1);
	square= n1*n1;
	printf("Square of no is = %d",square);
}
int main()
{
	square();
	printf("Exit from main function");
}


