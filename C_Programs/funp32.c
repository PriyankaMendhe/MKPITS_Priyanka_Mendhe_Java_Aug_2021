//33	Write a program in C to display the number in reverse order.																							
//	Input a number: 123																							
//	Expected Output :																							
//	The number in reverse order is : 321

#include<stdio.h>
int main()
{
	int num;
	printf("Input a number:");
	scanf("%d",&num);
	reverse(num);
}
void reverse(int num)//num 321
{
	int rnum=0,r;
 
	while(num>0)//321>0//32 >0//3>0// 0>0
	{
		r=num%10;//321%10 = 1//32%10 = 2 // 3 %10 = 3
		rnum  =rnum*10+ r;// 0 *10 + 1 = 1// 1 * 10 + 2 =12// 12 * 10 + 3 =123
		num = num/10;//321/10 =32 //32/10=3//3/10 = 0
	}
	printf("\nThe no. in a reverse order :%d",rnum);
}
