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
   int  i=2;
   while(i<num){
   	if(num%i==0)
   	{
   		printf("\nnumber is not prime no.");
   		 break;
	}
	i++;
   }
   if(num==i)
   {
   	printf("\nnumber is prime no.");
   }
    
}
