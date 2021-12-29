class th16 implements Runnable
{
    Thread t5;

    th16()
    {
        t5 = new Thread(this);
        t5.start();

    }
    @Override
    public void run() {

        System.out.println("Even No.");

        for(int y=1;y<=10;y++)
        {
            if(y%2==0)
            {
                System.out.println(y);

            }

        }

    }
}
class th17 implements  Runnable
{
    Thread t7;
    th17()
    {
        t7 = new Thread(this);
        t7.start();


    }


    @Override
    public void run() {
        System.out.println("Odd No");
        for(int i=1;i<10;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i);

            }



        }

    }
}


public class ThreadEx14 {
    public static void main(String args[])
    {

          th16 ob3 = new th16();
          th17 ob4 = new th17();


    }
}
