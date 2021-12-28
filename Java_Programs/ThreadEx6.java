//creating multiple thread using 1 class with multiple object
class th10 extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println(getName());
            if(getName().equals("Thread-3"))
            {
                System.out.println("Thread-3  HI");
            }

        }

    }


}


public class ThreadEx6 {

    public static void main(String args[]) {

        th10 t1 = new th10();
        th10 t2 = new th10();
        th10 t3 = new th10();
        th10 t4 = new th10();
        th10 t5 = new th10();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
