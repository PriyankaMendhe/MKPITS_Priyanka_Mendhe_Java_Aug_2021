 //5- wap to accept 3 subject marks and calculate total , percentage and grade
 #include<stdio.h>
 int main()
 {
 	int s1, s2, s3;
 	float percentage,total;
 	printf("Enter 3 subject marks");
 	scanf("%d%d%d",&s1,&s2,&s3);
 	total=s1+s2+s3;
 	printf("\nTotal Marks=%.2f",total);
 	percentage = ( total / 300) * 100 ;
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
