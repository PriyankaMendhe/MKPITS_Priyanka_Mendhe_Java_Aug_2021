//Multiple Thread using 1 Resource without Sunchronized

class Display
{


    void display(String a)
    {
        System.out.print("[");
        System.out.print(a);
        System.out.print("]");


    }

}

class Thread1 implements Runnable
{
    Thread t;
    String sob;
    Display d;

    Thread1(Display d1,String sob1)
    {
        sob=sob1;
        d =d1;
        t = new Thread(this);
        t.start();


    }


    @Override
    public void run() {

        d.display(sob);



    }
}


public class ThreadEx15 {

    public static void main(String args[])
    {
        Display dis1 = new Display();

          Thread1 th1 = new Thread1(dis1,"Priyanka");
          Thread1 th2 = new Thread1(dis1,"Rajesh");
          Thread1 th3 = new Thread1(dis1,"Mendhe");


    }
}
