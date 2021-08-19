//wap to accept 5 subject marks and calculate total , percentage and grade
 #include<stdio.h>
 int main()
 {
 	int s1, s2, s3 , s4 , s5;
 	float percentage,total;
 	printf("Enter 5 subject marks");
 	scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
 	total=s1+s2+s3+s4+s5;
 	printf("\nTotal Marks=%.2f",total);
 	percentage = ( total / 500) * 100 ;
 	printf("\npercentage=%.2f",percentage);
 	if(percentage>75)
 	{
 		printf("\nyou got distinction.");
    }
    else
    {
    	if(percentage<=75&&percentage>=60)
    	{
    		printf("\nyou got first division");
    		
		}
		else
		{
			if(percentage<60&&percentage>=35)
			{
				printf("\nyou got second division");
			}
			else
			{
				printf("\nyou are fail");
			}
		}
	}
	 
 }
