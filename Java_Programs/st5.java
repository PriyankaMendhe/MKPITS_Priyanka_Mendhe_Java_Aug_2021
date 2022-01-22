import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class st5 {

    public static void main(String args[])
    {
        ArrayList<Integer> ob = new ArrayList<Integer>();
        ArrayList<Integer> ob2 = new ArrayList<Integer>();

        ob.add(30);
        ob.add(40);
        ob.add(50);
        ob.add(60);
        ob.add(77);
        ob.add(80);

        System.out.println(ob);
        for(Integer integer : ob)
        {

            ob2.add(integer+5);

        }
        System.out.println(ob2);
    }
}

