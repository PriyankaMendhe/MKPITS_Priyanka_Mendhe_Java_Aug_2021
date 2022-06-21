import java.util.ArrayList;
import java.util.List;

public class MergeList {
    public static void main(String[] args) {


        List<String> l1 = new ArrayList<>();

        l1.add("1");

        List<String> l2 = new ArrayList<>();

        l2.add("2");


        List<String> mergeList = new ArrayList<>(l1);
        mergeList.addAll(l2);

        System.out.println(mergeList);


    }
}
