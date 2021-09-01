//12	wap to accept a no and print whether it a prime no. or not.	
#include<stdio.h>
int main()
{
	int n;
	printf("\n Input the number : ");
	scanf("%d",&n);
	check_prime(n);
}
void check_prime(int num)
{
   int count =0,i=1;
   while(i<=num){
   	if(num%i==0)
   	{
   		count++;
	}
	i++;
   }
   if(count==2)
   {
   	printf("\nnumber is prime no.");
   }
   else
   {
   	printf("\nnumber is not prime no.");
   }
}
