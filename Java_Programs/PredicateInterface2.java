import java.sql.SQLOutput;
import java.util.function.Predicate;

public class PredicateInterface2 {
    public static void main(String[] args) {

        Predicate <Integer> p1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                System.out.println(t);
                return true;
            }
        };
        boolean test1 = p1.test(10);
        System.out.println(test1);    // Calling Predicate method



        Predicate<Integer> pr = a -> (a > 18); // Creating predicate
        boolean test = pr.test(10);
        System.out.println(test);    // Calling Predicate method
    }
}
