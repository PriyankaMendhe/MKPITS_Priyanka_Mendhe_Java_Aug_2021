 //11 - wap to accept a no. and then print whether it is prime no. or not.
 #include<stdio.h>
 #include<conio.h>
 int main()
 {
 	int num,count=0,i;
 	
 	printf("enter no. to check prime or not");
 	scanf("%d",&num);
 while(i<=num)
 {
 	if(num%i==0)
 	{
 		count++;
	}
	i++;
 }
 
 if(count==2)
 {
 	printf("\n%d is a prime no",num);
 }
 else
 {
 	printf("\n%d is not prime no",num);
 }
 
 return 0;
 }
 
 	
 	
 	
 	
	  
 
