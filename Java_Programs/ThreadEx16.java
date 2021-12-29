//Multiple Thread using 1 Resource with Sunchronized

class oneToDisplay
{
    synchronized void toDisplay(String s)
    {
        System.out.print("[");
        System.out.print(s);
        System.out.print("]");


    }


}
class oneForThread implements Runnable
{
    Thread h1;
    oneToDisplay otd;
    String str;
    oneForThread(oneToDisplay otd3 , String str2)
    {
        str =str2;
        otd=otd3;
        h1 = new Thread(this);
        h1.start();



    }

    @Override
    public void run() {

        otd.toDisplay(str);

    }
}

public class ThreadEx16
{
    public static void main(String args[])
    {
        oneToDisplay otd1 = new oneToDisplay();

        oneForThread oth1 = new oneForThread(otd1,"Priyanka");
        oneForThread oth2 = new oneForThread(otd1,"Rajesh");
        oneForThread oth3 = new oneForThread(otd1,"Mendhe");

    }

}

