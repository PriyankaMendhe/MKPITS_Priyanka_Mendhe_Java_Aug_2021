class DaemonThread extends Thread{

    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            //System.out.println("Hii"+getName()  +isDaemon());

            if(isDaemon())
            {
                System.out.println(getName()+"   is Daemon thread");
            }
            else
            {
                System.out.println(getName()+"   is not Daemon thread");

            }

        }


    }




}



public class ThreadEx18 {

    public static void main(String args[])
    {
        DaemonThread ob1 = new DaemonThread();
        DaemonThread ob2 = new DaemonThread();
        DaemonThread ob3 = new DaemonThread();

        ob1.start();
        ob2.setDaemon(true);
        ob2.start();
        ob3.start();


    }
}
