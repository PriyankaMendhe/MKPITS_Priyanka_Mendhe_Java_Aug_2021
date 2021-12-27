//isAlive() + getName() and calling Thread1 by 2 objects

class A11 extends Thread
{
    public  void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread1 Alive status "+isAlive()+"..Get Name : "+getName()+"......"+i);
        }
    }

}
class B22 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread2 Alive Status.." +isAlive()+"...Get Name : "+getName());
        }
    }

}
class C33 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Thread3 Alive Status.." +isAlive()+"....Get Name : "+getName());
        }
    }

}

public class ThreadEx3 {

    public static void main(String args[])
    {
        A11 a1 = new A11();
       A11 a11 = new A11();
        B22 b2 = new B22();
        C33 c3 = new C33();

        a1.start();
        b2.start();
        c3.start();



    }
}


