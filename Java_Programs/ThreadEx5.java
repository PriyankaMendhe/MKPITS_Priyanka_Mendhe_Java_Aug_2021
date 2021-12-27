 //getThreadGroup()
 //Returns the thread group to which this thread belongs. This method returns null if this thread has died (been stopped).


class First1 extends Thread
{
    public void run()
    {
        //Returns the identifier of this Thread.
        System.out.println("Class First Thread is Running ....getPriority: "+getPriority());

    }

}
class Second1 extends Thread
{
    public  void run()
    {
        System.out.println("class Second1.. thread is running ..."+getThreadGroup());//class Second1.. thread is running ...java.lang.ThreadGroup[name=main,maxpri=10]

    }

}

public class ThreadEx5 {
    public static void main(String args[])
    {

        Second1 s1 = new Second1();
        First1 f1= new First1();

        f1.start();
        s1.start();

        System.out.println("After object creation and start call");

        Thread ov = new Thread();
        Thread ov1 = Thread.currentThread();
        System.out.println("Thread Priority:"+ov.getPriority());
        System.out.println("Thread Priority:"+ov.getThreadGroup());//Thread Priority:java.lang.ThreadGroup[name=main,maxpri=10]
        System.out.println(ov1);//Thread[main,5,main]
        System.out.println(s1);//returns (thread-name, priority, thread-group)  Thread[Thread-0,5,main]
        System.out.println(f1);//Thread[Thread-1,5,main]

    }
}

