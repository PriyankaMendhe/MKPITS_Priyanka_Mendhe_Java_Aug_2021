//12- wap to accept a no. and print whether it is armstrong no.//for 4 digit no.
//armstrong no. is a number ex. 1634..1 sq.+6 sq. +3 sq + 4 sq. = 1+ 1296 + 81+256 : 1634 (sum of square of digit)
#include<stdio.h>
int main()
{
	int num,reminder,sum,temp,sq;
	printf("Enter 4 digit no. to check whether is armstrong or not..");//1634
	scanf("%d",&num);
	temp=num;//store num value in temp varible; bcoz num value gets change in logic temp=153;
	while(num>0)//1634>0//163>0//16>0//1>0//0>0
	{
		reminder=num%10;//1634 %10=4//163%10=3//16%10=6//1%10=1
		sq= reminder * reminder* reminder * reminder;// 4^4 = 256;3^4=81; 6^4=1296;1^4=1
		sum= sum + sq;// sum=0+256 =256; 256+81=337;1296+337=1633;1633+1=1634
		num = num/10;//1634/10=163;163/10=16;16/10=1;1/10=0
		
	}
	
	num=temp;//get back original num value from temp num=1634
	if(sum==num)//1634=1634
	{
		printf("\n number is armstrong no");// armstrong no.
	}
	else
	{
		printf("\n no. is not armstrong no.");
		
	}
}
