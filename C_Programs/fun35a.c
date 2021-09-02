#include <stdio.h>  
int main()  
{  
    int num;  
    int sum=0;  
    printf("Input a number to check whether it is Strong number:");  
    scanf("%d",&num);  
    int temp=num ;  
    int f ,r;  
    while(temp>0)  
    {  
        r=temp%10;  
         f=fact(r);  
        temp=temp/10;  
        sum=sum+f;  
    }  
    if(sum==num)  
    {  
        printf("\n%d is   a Strong number.",num);  
    }  
    else  
    {  
        printf("%d is   a not  Strong number.",num);  
    }  
    return 0;  
}  
int fact(int r)  
{  
    int fact=1,i;  
    for(i=1;i<=r;i++)  
    {  
        fact=fact*i;  
    }  
    return fact;  
      
}  
