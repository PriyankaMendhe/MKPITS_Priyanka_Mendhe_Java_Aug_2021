import com.sun.javafx.scene.control.skin.IntegerFieldSkin;

import java.util.ArrayList;

public class st3 {

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

        for(Integer integer :  ob)
        {
            if(integer%2==0)
            {
                ob2.add(integer);

            }


        }

        System.out.println(ob2);

    }

}
