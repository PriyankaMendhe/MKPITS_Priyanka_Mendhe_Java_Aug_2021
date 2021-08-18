 // 8 - wap to accept a no. print factorial of that no.
 #include<stdio.h>
 #include<conio.h>
 int main()
 {
 	int num,fact=1;
 	printf("enter no to calculate factorial");
 	scanf("%d",&num);
 	while(num>0)
 	{
 			fact=fact*num;
 			num--;
	 }
	 printf("\nfactorial of number is %d",fact);
return 0;
}
 
 	
 	
 	
 	
	  
 
