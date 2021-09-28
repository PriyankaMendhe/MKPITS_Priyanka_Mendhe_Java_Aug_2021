class Calculate{

void sum(int num1, long num2)
{
   long res = num1 + num2;
   System.out.println("Result = "+res);

}
void sum(int num1, int num2,int num3)
{
   long res = num1 + num2+ num3;
   System.out.println("Result = "+res);

}

}

class over2{
public static void main(String arg[])
{

    Calculate c1 = new Calculate();
    c1.sum(2 , 3);
    c1.sum(2, 3, 4);


}

}