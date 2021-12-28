//sleep()


class th13 extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println(getName());

        }

    }


}

public class ThreadEx10 {

    public static void main(String args[]) {

        th13 t1 = new th13();
        th13 t2 = new th13();
        th13 t3 = new th13();
        th13 t4 = new th13();
        th13 t5 = new th13();





        t1.start();
        t2.start();
        t3.start();

        try {

            t3.sleep(10000);


        }catch(Exception ee)
        {
            System.out.println(ee);

        }


        t4.start();
        t5.start();
    }

}


