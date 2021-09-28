class Calculate{

void sum(int num1, long num2)
{
   long res = num1 + num2;
   System.out.println("Result = "+res);

}

}

class over1{
public static void main(String arg[])
{

    Calculate c1 = new Calculate();
    c1.sum(2 , 3);


}

}