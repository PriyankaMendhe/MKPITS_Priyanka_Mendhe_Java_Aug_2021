//resume suspend sleep


import java.util.Objects;

class th14 extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println(getName());

        }

    }


}

public class ThreadEx11 {

    public static void main(String args[]) {

        th14 t1 = new th14();
        th14 t2 = new th14();
        th14 t3 = new th14();
        th14 t4 = new th14();
        th14 t5 = new th14();





        t1.start();
        t2.start();
        t3.start();

        System.out.println("Thread 3 Suspended");
        try {
            t3.suspend();

            t3.sleep(10000);

            System.out.println("Thread 3 Resumed");

            t3.resume();


        }catch(Exception ee)
        {
            System.out.println(ee);

        }


        t4.start();
        t5.start();
    }

}


