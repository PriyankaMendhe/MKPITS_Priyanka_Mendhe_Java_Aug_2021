class AddingLowertype
{
    public static void main(String[] args)

    {
    byte a=10;
    byte b=10;
    byte c;
    //byte c=a+b;//Compile Time Error: because a+b=20 will be int
      c=(byte)(a+b);
    System.out.println(c);

    }
}
