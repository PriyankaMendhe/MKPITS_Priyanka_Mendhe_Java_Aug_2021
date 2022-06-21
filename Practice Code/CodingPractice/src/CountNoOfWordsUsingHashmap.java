import java.util.HashMap;

public class CountNoOfWordsUsingHashmap {

    public static void main(String[] args) {

        String str="This is is is done by me me";
        String[] spilt = str.split(" ");

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i=0; i< spilt.length;i++)
        {
            if(map.containsKey(spilt[i]))
            {
                int count = map.get(spilt[i]);

                map.put(spilt[i],count+1);

            }
            else
            {
                map.put(spilt[i],1);
            }

        }
        System.out.println(map);

    }
}
