//join
//setName(): set new name to thread
//creating multiple thread using 1 class with multiple object
class th12 extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println(getName());

        }

    }


}


public class ThreadEx9 {

    public static void main(String args[]) {

        th12 t1 = new th12();
        th12 t2 = new th12();
        th12 t3 = new th12();
        th12 t4 = new th12();
        th12 t5 = new th12();


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        System.out.println(t2.getName()+"  "+t2.isAlive());
        try{
            t2.join();
            System.out.println(t2.getName()+"  "+t2.isAlive());


        }catch(Exception ee)
        {
            System.out.println(ee);

        }
    }

}


