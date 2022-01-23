
// predicate with negate

import java.util.function.Predicate;

public class PredicateInterface5 {
    public static void main(String[] args) {

        Predicate<Integer> p1 = ar ->ar>100;


        Predicate<Integer> negate = p1.negate();

        boolean test = negate.test(15);//true
        System.out.println(test);

        boolean test1 = negate.test(115);//false
        System.out.println(test1);






    }
}


