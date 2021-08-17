#include<stdio.h> 
int main()  
{  
    float basic_sal, total_salary, da, hra;  
  
    printf("Enter basic salary\n");  
    scanf("%f", &basic_sal);  
    hra = basic_sal * 25 / 100   ;  
    da  = basic_sal * 35/ 100    ;  
  
    total_salary = basic_sal + da + hra;  
  
    printf("Total Salary is Rs %f\n", total_salary);  
  
     
}  
