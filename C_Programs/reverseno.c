//assignment :
//wap to accept a 3 digit no. and print the reverse of that no.
//for eg num =123
//then reverse of no. is 321

#include<stdio.h>
int main()
{
	int num= 123;
	int originalnum=num ;
	int rem,sum=0;
	int rev_num=0;
	
	while(num!=0)
	{
		rem = num % 10 ;
		num =num/10;
		rev_num = rev_num *10 + rem ;
		sum = sum + rev_num;
	}
 
   
		printf("%d reverse no is %d",originalnum , rev_num);
}
	
	
