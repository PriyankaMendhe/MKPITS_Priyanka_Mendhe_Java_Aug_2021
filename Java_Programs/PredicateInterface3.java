
// predicate with and

import java.util.function.Predicate;

public class PredicateInterface3 {
    public static void main(String[] args) {

        Predicate<Integer> p1 = ar ->ar>100;
        Predicate<Integer> p2 = ar ->ar<200;

        Predicate<Integer> and = p1.and(p2);

        boolean test = and.test(115);
        System.out.println(test);

        boolean test1= and.test(500);
        System.out.println(test1);

        boolean test2 = and.test(25);
        System.out.println(test2);




    }
}
