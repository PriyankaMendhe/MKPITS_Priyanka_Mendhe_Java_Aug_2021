//34	Write a program in C to check whether a number is a palindrome or not.																							
//	Input a number: 121																							
//	Expected Output :																							
//	121 is a palindrome number.
#include<stdio.h>
int main()
{
	int num;
	printf("Input a number:");
	scanf("%d",&num);
	palindrome(num);
}
void palindrome( int num)
{
	int rnum=0,temp=0,r;
	temp= num;
 
	while(num>0) 
	{
		r=num%10; 
		rnum  =rnum*10+ r; 
		num = num/10;
	}
	 num=temp;
	 if(num==rnum)
	 {
	 	printf("%d is a palindrome number.",num);
	 }
	 else
	 {
	 	printf("%d is not a palindrome number.",num);
	 }
}
