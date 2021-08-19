/* wap to accept salary from the user then calculate bonus =1000 if salary is greater than 10000 ,
  bonus =500 if salary is greater than 5000 and less than 10000 , bonus =100 if salary is less than 5000.*/
  
  #include<stdio.h>
  #include<conio.h>
  int main()
  {
  	int sal;
  	printf("enter your salary");
  	scanf("%d",&sal);
  	if(sal>=10000)
  	{
  		printf("your bonus is 1000");
  		
	}
	else
	{
		if(sal>=5000&&sal<10000)
		{
		 printf("your bonus is 500");	
		}
		else
		{
			printf("your bonus is 100");
		}
	}
  	
  	
  	return 0;
  	
  }

