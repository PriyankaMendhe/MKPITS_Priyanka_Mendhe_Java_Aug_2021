
//runnable interface

class th15 implements Runnable
{
    Thread t;

    th15()
    {

        t=new Thread(this);
        t.start();



    }

    @Override
    public void run() {

        System.out.println("HI"+t.getName());

    }
}

public class ThreadEx13 {

    public static void main(String args[])
    {
        th15 ob1 = new th15();
        th15 ob2 = new th15();

    }
}
