public class ref {


    int x, y;

    public static void main(String[] args) {

        ref p1 = new ref();

        p1.x = 1;
        p1.y=2;

        System.out.println("x= "+p1.x+"y= "+p1.y);

        change(p1);

        System.out.println("x= "+p1.x+"y= "+p1.y);
    }

    static void change(ref p)
    {
        p.x=2;
        p.y=1;

    }
}
