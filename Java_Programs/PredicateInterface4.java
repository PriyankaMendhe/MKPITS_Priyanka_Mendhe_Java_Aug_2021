
// predicate with or

import java.util.function.Predicate;

public class PredicateInterface4 {
    public static void main(String[] args) {

        Predicate<Integer> p1 = ar ->ar>100;
        Predicate<Integer> p2 = ar ->ar==200;

        Predicate<Integer> or = p1.or(p2);

        boolean test = or.test(115);
        System.out.println(test);

        boolean test1= or.test(500);
        System.out.println(test1);

        boolean test2 = or.test(25);
        System.out.println(test2);




    }
}

