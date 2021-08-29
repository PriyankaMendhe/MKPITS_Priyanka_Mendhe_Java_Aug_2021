 // wap to print feboncachi sereies
//	0 1 1 2 3 5 8 13
#include<stdio.h>
#include<conio.h>
 int main()
 {
 	int a=0,b=1,c,elements,i=1;
 	printf("Enter the no. of elements u want in feboncachi series");
 	scanf("%d",&elements);
 	while(i<=elements)
 	{
 		printf(" %d ",a);
 		c=a+b;
 		a=b;
 		b=c;
 		i++;
	 }
	 
	return 0;
}
 	
 	
 	
 	
 	
	  
 
