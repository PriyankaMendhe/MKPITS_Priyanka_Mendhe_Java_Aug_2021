//currentThread():Returns a reference to the currently executing thread object.
//By extending Thread class
//getName() & getId()


class First extends Thread
{
    public void run()
    {
        //Returns the identifier of this Thread.
        System.out.println("Class First Thread is Running ....getId : "+getId());

    }

}
class Second extends Thread
{
  public  void run()
    {
        System.out.println("Second class thread is running ...getName: "+getName());

    }

}

public class ThreadEx4 {
    public static void main(String args[])
    {

        Second s1 = new Second();
        First f1= new First();

        f1.start();
        s1.start();

        System.out.println("After object creation and start call");

        Thread ov = new Thread();
        Thread ov1 = Thread.currentThread();
        System.out.println("Thread Priority:"+ov.getPriority());
        System.out.println(ov1);//Thread[main,5,main]
        System.out.println(s1);//returns (thread-name, priority, thread-group)  Thread[Thread-0,5,main]
        System.out.println(f1);//Thread[Thread-1,5,main]

    }
}
