class myThread implements Runnable
{

  public void run()
  {

        System.out.println("Thread Name:  "+Thread.currentThread().getName()+" Thread Group:  "+Thread.currentThread().getThreadGroup()+" Priority: "+Thread.currentThread().getPriority()+" State: "+Thread.currentThread().getState());




  }


}



public class ThreadEx19 {

    public static void main(String args[])
    {
        ThreadGroup tg = new ThreadGroup("JavaGrp");
        System.out.println(tg);
        myThread ob1 = new myThread();

        Thread t1 = new Thread(tg,ob1,"one");
        Thread t2 = new Thread(tg,ob1,"Two");
        Thread t3 = new Thread(tg,ob1,"Three");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1);


    }
}
