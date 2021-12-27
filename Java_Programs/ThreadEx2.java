//isAlive()

class A1 extends Thread
{
    public  void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread1 Alive status "+isAlive());
        }
    }

}
class B2 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread2 Alive Status.." +isAlive());
        }
    }

}
class C3 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread3 Alive Status.." +isAlive());
        }
    }

}

public class ThreadEx2 {

    public static void main(String args[])
    {
         A1 a1 = new A1();
         B2 b2 = new B2();
         C3 c3 = new C3();

         a1.start();
         b2.start();
         c3.start();



    }
}

