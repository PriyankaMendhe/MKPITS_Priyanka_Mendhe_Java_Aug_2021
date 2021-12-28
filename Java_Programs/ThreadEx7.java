//setName(): set new name to thread
//creating multiple thread using 1 class with multiple object
class th11 extends Thread
{
    public void run()
    {
        for(int i=0;i<=3;i++)
        {
            System.out.println(getName());

        }

    }


}


public class ThreadEx7 {

    public static void main(String args[]) {

        th11 t1 = new th11();
        th11 t2 = new th11();
        th11 t3 = new th11();
        th11 t4 = new th11();
        th11 t5 = new th11();

        t1.setName("Priyanka");
        t2.setName("Priyanka1");
        t3.setName("Priyanka2");
        t4.setName("Priyanka3");
        t5.setName("Priyanka4");



        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}

