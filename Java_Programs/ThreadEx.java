class th1 extends Thread
{
  public  void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Running Thread1....."+i);
        }
    }

}
class th2 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("Running Thread2....."+i);
        }
    }

}

public class ThreadEx {

    public static void main(String args[])
    {
        th1 ob1 = new th1();
        th2 ob2 = new th2();
        ob1.start();
        ob2.start();

    }
}
