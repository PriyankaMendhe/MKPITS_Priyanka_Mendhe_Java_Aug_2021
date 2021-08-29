#include<stdio.h>
int main()
{
	int i, j,n;
	printf("enter 1 to n u want prime no. ");
	scanf("%d",&n);
	printf("\n 1 to %d prime no. are:\n",n);
 
	for(j=2;j<=n;j++)
	{
		
	    for(i=2;i<j;i++)
        {
 	       if(j % i == 0)
         	{
 		      
 		     break;
	       - }
       }
      if(i==j)
     {
 	printf("\n %d",j);
     }
		
}
}

