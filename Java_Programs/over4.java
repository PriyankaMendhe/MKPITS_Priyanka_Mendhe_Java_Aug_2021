class Calculate{

void sum(int num1, int num2)
{
   int res = num1 + num2;
   System.out.println("int arg method invoked");
   System.out.println("Result1 = "+res);

}
void sum(long num1, long num2)
{
   long res = num1 + num2;
   System.out.println("long arg method invoked");
   System.out.println("Result2 = "+res);

}

}

class over4{
public static void main(String arg[])
{

    Calculate c1 = new Calculate();
    c1.sum(2 , 3);// invoked int arg sum()

     // c1.sum(2446465654646L , 36662621622L);



}

}