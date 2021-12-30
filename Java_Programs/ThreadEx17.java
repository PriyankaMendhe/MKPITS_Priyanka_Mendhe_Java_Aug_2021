import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorThreadClass extends Thread
{
   public void serviceRequest()
   {
       try{

           Thread.sleep(1000);

       }catch (Exception ee)
       {
           System.out.println(ee);
       }

   }

   public void run()
   {
       System.out.println(getName()+"Work Started");
       serviceRequest();
       System.out.println(getName()+"Work Finished");


   }




}

public class ThreadEx17 {

    public static void main(String args[])
    {
        ExecutorThreadClass ob1 = new ExecutorThreadClass();
        ExecutorThreadClass ob2 = new ExecutorThreadClass();
        ExecutorThreadClass ob3 = new ExecutorThreadClass();

        ob1.start();
        ob2.start();
        ob3.start();

        ExecutorService ex = Executors.newFixedThreadPool(3);
        ex.execute(ob1);
        ex.execute(ob2);
        ex.execute(ob3);

        ex.shutdown();
        while(!ex.isTerminated())
        {


        }
        //for(;ex.isTerminated();)
        System.out.println("All Thread work is Finished");

    }
}
