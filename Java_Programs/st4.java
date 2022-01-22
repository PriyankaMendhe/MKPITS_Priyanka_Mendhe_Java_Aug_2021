import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class st4 {

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
        List<Integer> collect1 = ob.stream().filter(m->m%2==0).collect(Collectors.toList());
        System.out.println(collect1);
    }
}
