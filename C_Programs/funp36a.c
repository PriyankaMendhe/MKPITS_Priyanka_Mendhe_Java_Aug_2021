/**
 * C program to print Strong numbers in given range
 */

#include <stdio.h>

int main()
{
    int i, j, r,num   , start, end;
    long long fact, sum;

    /* Input lower and upper limit from user */
    printf("Input starting range of number : ");
    scanf("%d", &start);
    printf("Input ending range of number: ");
    scanf("%d", &end);

    printf("All Strong numbers between %d to %d are:\n", start, end);
    
    /* Iterate from start to end */
    for(i=start; i<=end; i++)
    {
        /* Number to check for strong number */
        num = i;

        sum = 0;

        /* Find the sum of factorial of digits */ 
        while(num > 0)
        {
            fact = 1;
            r = num % 10;

            /* Find factorial of last digit of current num. */
            for( j=1; j<=r; j++)
            {
                fact = fact * j;
            }

            sum = sum + fact; 

            num = num/ 10;
        }
        
        /* Print 'i' if it is strong number */  
        if(sum == i)
        {
            printf("%d, ", i);
        }
    }

    return 0;
}
