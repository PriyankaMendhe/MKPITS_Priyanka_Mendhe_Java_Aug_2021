//12- wap to accept a no. and print whether it is armstrong no.
//armstrong no. is a number ex. 153..1 cube+5 cube +3 cube = 1+ 125 + 27 : 153 (sum of cubes of digit)
#include<stdio.h>
int main()
{
	int num,reminder,sum,temp,cube;
	printf("Enter 3 digit no. to check whether is armstrong or not..");//153
	scanf("%d",&num);
	temp=num;//store num value in temp varible; bcoz num value gets change in logic temp=153;
	while(num>0)//153>0//15>0//1>0//0>0
	{
		reminder=num%10;// 153 % 10 = 3 //15 % 10 = 5 //1%10 ==1;
		cube= reminder * reminder* reminder;// 3^3 = 3*3*3 =27(1st iteration)//5^3=125//1^3=1
		sum= sum + cube;// sum = 0+27=27 ;// sum= 125+27=152// sum= 152+1=153;
		num = num/10;//153 / 10=15 //15/10 =1;//1/10=0;
		
	}
	
	num=temp;//get back original num value from temp num=153
	if(sum==num)//153=153
	{
		printf("\n number is armstrong no");// armstrong no.
	}
	else
	{
		printf("\n no. is not armstrong no.");
		
	}
}
