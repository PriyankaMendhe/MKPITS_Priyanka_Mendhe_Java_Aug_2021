import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {

    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2,"Sonu");
        map.put(25,"Rajesh");
        map.put(38,"Sarthi");

        System.out.println(map.size());

        System.out.println("By Using while Loop");

        Iterator itr = map.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry me = (Map.Entry) itr.next();

            System.out.println("Key is:  "+me.getKey()+"Value is : "+me.getValue());


        }

        System.out.println("By using for loop");

        for(Map.Entry me2 : map.entrySet())
        {
            System.out.println("Key is:  "+me2.getKey()+"Value is : "+me2.getValue());


        }
    }



}
