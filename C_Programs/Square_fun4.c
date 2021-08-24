 // wap to create a function square with one int parameter to accept a number and calculate and display the square of that no.
 #include<stdio.h>
 void square( int num1)
 {
 	int square;
 	square = num1 * num1;
 	printf("Square of no is = %d",square);
 }
 int main()
 {
 	int n1;
 	printf("Enter a no.");
 	scanf("%d",&n1);
 	square(n1);
 }

