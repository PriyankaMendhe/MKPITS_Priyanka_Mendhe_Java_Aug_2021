import java.util.function.Predicate;

public class PredicateInterface6 {

    static boolean checksingledigit(int a, Predicate<Integer> p1)
    {
        return p1.test(a);

    }

    public static void main(String[] args) {

        boolean checksingledigit = checksingledigit(1,c->c<10);

        System.out.println(checksingledigit);//true

        boolean checksingledigit1 = checksingledigit(15,c->c<10);

        System.out.println(checksingledigit1);//false


    }
}
